package com.capitalone.ers.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.services.ErsUsersService;

public class ErsUserController {

	private Logger log = Logger.getRootLogger();
	private ErsUsersService ersUsers = new ErsUsersService();

	public void processPostRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/ErsLogin":
			retrieveUserRole(req, resp);
			break;

		default:
			break;
		}
	}

	private void retrieveUserRole(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String userRole = ersUsers.login(req);

		if (userRole != null) {
			if (userRole.equals("EMPLOYEE")) {
				resp.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
			} else {
				resp.sendRedirect("/ExpenseReimbursementSystem/static/manager.html");
			}
		} else {
			log.debug("Failed to retrieve the User Role.  Redirecting to Login Page.");
			resp.sendRedirect("/ExpenseReimbursementSystem/static/ErsLogin.html");
		}
	}
}
