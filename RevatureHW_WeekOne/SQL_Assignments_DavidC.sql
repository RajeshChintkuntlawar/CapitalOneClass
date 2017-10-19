--Assignment 2.1
--Task1
SET SCHEMA 'chinook';

SELECT * FROM "Employee";

--Task2
SET SCHEMA 'chinook';

SELECT * FROM "Employee"
	WHERE "LastName"='King';

--Task3
SET SCHEMA 'chinook';

SELECT * FROM "Employee"
	WHERE "FirstName"='Andrew'
    AND "ReportsTo" IS NULL;

--Assignment 2.2
--Task1
SET SCHEMA 'chinook';

SELECT * FROM "Album"
	ORDER BY "Title" DESC;

--Task2
SET SCHEMA 'chinook';

SELECT "FirstName" FROM "Customer"
	ORDER BY "City";
	--ASC is default

--Assignment 2.3
--Task1

SET SCHEMA 'chinook';

INSERT INTO "Genre" ("GenreId","Name")
	VALUES (26,'Oldies'),
    (27,'Christian');

--Task2
SET SCHEMA 'chinook';

INSERT INTO "Employee"
-- EmployeeId,LastName,FirstName,Title,ReportsTo,BirthDate,HireDate,Address, City, State, Country, PostalCode, Phone, Fax, Email
	VALUES (9,'Doe','John','IT Manager',1,'1969-03-12','1980-06-01','200 Park Way','Richmond','Virginia','USA','23030','804-444-3333','800-201-2000','johnnyrocket@comcast.net');
    (10,'Barkley','John','Janitor',3,'1975-05-19','1984-11-03','888 Fairbank Drive','Richmond','Virginia','USA','23030','804-444-2222',NULL,'jbarkley@comcast.net');

--Task3
SET SCHEMA 'chinook';

--CustomerId,FirstName,LastName,Company,Address,City,State,Country,PostalCode,Phone,Fax,Email,SupportRepId
INSERT INTO "Customer"
	VALUES(60,'Roger','Rabbit','Last Hope Formulas','345 Deer Park Way','Nashville','Tennessee','USA','34458','456-342-1212',NULL,'rrabbit@yahoo.com',3),
    (61,'Fannie','Mae','Las Vegas Games, Inc.','1000 Hotel Lane','Las Vegas','Nevada','USA','11456','606-323-1111',NULL,'fmae@rocketmail.com',3);

--Assignment 2.4
--Task1
SET SCHEMA 'chinook';

UPDATE "Customer" 
	SET "FirstName" = 'Robert',
    	"LastName" = 'Walter'
    WHERE ("LastName" = 'Mitchell' AND "FirstName"= 'Aaron');

--Task2
SET SCHEMA 'chinook';

UPDATE "Artist" 
	SET "Name" = 'CCR'
    WHERE "Name" = 'Creedence Clearwater Revival';

--Assignment 2.5
--Task1
SET SCHEMA 'chinook';
       
SELECT * FROM "Invoice" WHERE "BillingAddress" LIKE 'T%';

--Assignment 2.6
--Task1
SET SCHEMA 'chinook';
       
SELECT * FROM "Invoice"
	WHERE "Total" BETWEEN 15 and 50;

--Task2
SET SCHEMA 'chinook';
       
SELECT * FROM "Employee"
	WHERE "HireDate" BETWEEN '2003-06-01' and '2004-03-01';

--Assignment 2.7
--Task1
SET SCHEMA 'chinook';

ALTER TABLE "Invoice"
	DROP CONSTRAINT "FK_InvoiceCustomerId",
    ADD CONSTRAINT del_invoice
    FOREIGN KEY ("CustomerId") REFERENCES "Customer"("CustomerId")
    ON DELETE CASCADE;
 
ALTER TABLE "InvoiceLine"
	DROP CONSTRAINT "FK_InvoiceLineInvoiceId",
    ADD CONSTRAINT del_invoiceline
    FOREIGN KEY ("InvoiceId") REFERENCES "Invoice"("InvoiceId")
    ON DELETE CASCADE;

DELETE FROM "Customer"
	WHERE ("FirstName"='Robert' AND "LastName"='Walter');

--Assignment 7.1
SET SCHEMA 'chinook';

SELECT (c."FirstName" || ' ' || c."LastName") customer_name, i."InvoiceId"
	FROM "Customer" c
    INNER JOIN "Invoice" i ON (c."CustomerId" = i."CustomerId")
    ORDER BY customer_name;

--Assignment 7.2
SET SCHEMA 'chinook';

SELECT c."CustomerId", c."FirstName", c."LastName",i."InvoiceId", i."Total"
	FROM "Customer" c
    FULL JOIN "Invoice" i ON (c."CustomerId" = i."CustomerId")
    ORDER BY "CustomerId";

--Assignment 7.3
 SET SCHEMA 'chinook';

SELECT artist."Name", album."Title"
	FROM "Album" album
    FULL JOIN "Artist" artist
    ON (artist."ArtistId" = album."ArtistId")
    ORDER BY "Name";

--Assignment 7.4
SET SCHEMA 'chinook';

SELECT artist."Name", album."Title"
	FROM "Album" album
    CROSS JOIN "Artist" artist
    ORDER BY "Name";

--Assignment 7.5
SET SCHEMA 'chinook';

-- could have done SELECT * but wanted to rename the managers fields to be unique
-- making my Self Join a LEFT JOIN so that I get the General Manager also who doesn't report to anyone.
SELECT a.*, 
	   b."EmployeeId" manager_employee_id, b."LastName" manager_last_name, b."FirstName" manager_first_name,
       b."Title" manager_title, b."BirthDate" manager_birth_date, b."HireDate" manager_hire_date, b."Address" manager_address,
       b."City" manager_city, b."State" manager_state, b."Country" manager_country, b."PostalCode" manager_postal_code,
       b."Phone" manager_phone, b."Fax" manager_fax, b."Email" manager_email
	FROM "Employee" a 
    LEFT JOIN "Employee" b
	ON (a."ReportsTo" = b."EmployeeId")
    ORDER BY a."EmployeeId";

--Assignment 8.1
SET SCHEMA 'chinook';

--Creating index with ReportsTo first column and EmployeeId second column
--because there can be many values of EmployeeId for each ID in the ReportsTo column

CREATE INDEX reporting_index
	ON "Employee" ("ReportsTo", "EmployeeId");
