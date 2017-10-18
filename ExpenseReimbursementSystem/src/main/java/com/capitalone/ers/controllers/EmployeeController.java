package com.capitalone.ers.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.daos.ErsReimbursementDaoImpl;

public class EmployeeController {

	private Logger log = Logger.getRootLogger();
	ErsReimbursementDaoImpl ersReimbursementDaoImpl = new ErsReimbursementDaoImpl();

	public void processEmployeeRequests(HttpServletResponse resp) {
		try {
			resp.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
