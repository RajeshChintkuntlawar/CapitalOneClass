package com.capitalone.ers.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class EmployeeController {

	private Logger log = Logger.getRootLogger();

	public void viewPastTickets(HttpServletRequest req, HttpServletResponse resp) {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/static/employee":
			log.trace("User Type Employee requesting to view past tickets");
			viewTickets(req, resp);
			break;

		default:
			break;
		}
	}

	private void viewTickets(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
//		log.debug("post request made with url: " + requestUrl);
//		
//		if(requestUrl.startsWith("/users")) {
//			employeeController.addReimbursementRequests(req, resp);
//		}
//	}
	
//	public void addReimbursementRequests(HttpServletRequest req, HttpServletResponse resp) {
//		// TODO Auto-generated method stub
//
//	}

}
