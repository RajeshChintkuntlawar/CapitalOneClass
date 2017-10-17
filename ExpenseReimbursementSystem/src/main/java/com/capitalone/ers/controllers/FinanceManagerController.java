package com.capitalone.ers.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class FinanceManagerController {

	private Logger log = Logger.getRootLogger();

	public void viewAllReimbursements(HttpServletRequest req, HttpServletResponse resp) {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/manager":
			log.trace("User Type Manager requesting to view all reimbursements");
			viewReimbursements(req, resp);
			break;

		default:
			break;
		}

	}

	private void viewReimbursements(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

}
