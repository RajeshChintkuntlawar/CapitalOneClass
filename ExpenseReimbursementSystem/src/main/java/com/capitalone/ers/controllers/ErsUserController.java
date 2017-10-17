package com.capitalone.ers.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsUserRoles;
import com.capitalone.ers.services.ErsUsersService;

public class ErsUserController {

	private Logger log = Logger.getRootLogger();
	private ErsUsersService ersUsers = new ErsUsersService();

	public void processPostRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		log.trace("in processPostRequests with URL " + requestUrl);

		switch (requestUrl) {
		case "/static/ErsLogin.html":
			log.trace("Continue with User Login");
			retrieveUserRole(req, resp);
			break;

		default:
			log.debug("processPostRequests default with url " + requestUrl);
			break;
		}
	}

	private void retrieveUserRole(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ErsUserRoles ersUserRoles = ersUsers.login(req);
		
		if (ersUserRoles != null) {
			log.debug("User Role " + ersUserRoles.getUserRole());

			if (ersUserRoles.getUserRole().equals("EMPLOYEE")) {
				resp.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
			} else {
				resp.sendRedirect("/ExpenseReimbursementSystem/static/manager.html");
			}
		} else {
			log.fatal("Failed to retrieve the User Role");
		}
	}
}
