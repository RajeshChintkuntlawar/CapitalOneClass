package com.capitalone.ers.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionUtility {

	public Connection getConnection() {
		Properties databaseConnectionProp = new Properties();
		try {
			databaseConnectionProp.load(new FileInputStream("/Users/mne157/Documents/workspace/bootcamp/GitHubCode/CapitalOneClass/ExpenseReimbursementSystem/src/main/resources/databaseConnection.properties"));
			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection(databaseConnectionProp.getProperty("url"),
					databaseConnectionProp.getProperty("username"), databaseConnectionProp.getProperty("password"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
