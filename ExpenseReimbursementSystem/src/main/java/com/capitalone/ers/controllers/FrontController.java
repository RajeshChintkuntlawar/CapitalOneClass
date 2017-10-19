package com.capitalone.ers.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class FrontController extends DefaultServlet {

	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getRootLogger();
	ErsUserController ersUserController = new ErsUserController();
	EmployeeController employeeController = new EmployeeController();
	ManagerController managerController = new ManagerController();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.trace("full url at the start of the application: " + req.getRequestURI());
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("get request made with url: " + requestUrl);

		// route static content normally
		if (requestUrl.startsWith("/static/")) {
			
//			//Check if the user already logged in
//			if(!"/static/ErsLogin.html".equals(requestUrl)) {
//				ErsUsers currentUser = (ErsUsers) req.getSession().getAttribute("currentUser");
//				if(currentUser == null) {
//					resp.sendRedirect("/static/ErsLogin.html");
//					return;
//				}
//			}
			super.doGet(req, resp);
			return;
		}
	
		req.getRequestDispatcher("/static/ErsLogin.html").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("proceeding with the post request using url: " + requestUrl);

		if (requestUrl.startsWith("/ErsLogin")) {
			ersUserController.processPostRequests(req, resp);
		}

		//Not working
		if (requestUrl.startsWith("/CustomerService")) {
			log.debug("customer service");
			resp.sendRedirect("/CustomerService.html");
		}

		if (requestUrl.startsWith("/viewPastTickets")) {
			log.debug("viewPastTickets");
			resp.sendRedirect("/ExpenseReimbursementSystem/static/viewPastTickets.html");
			employeeController.viewPastRequests(req);
		}
		
		if (requestUrl.startsWith("/newReimbursementRequest")) {
			log.debug("newReimbursementRequest");
			resp.sendRedirect("/ExpenseReimbursementSystem/static/newReimbursementRequest.html");
			employeeController.newReimbursementRequest(req);
		}
		
		if (requestUrl.startsWith("/viewAllRequests")) {
			log.debug("viewAllRequests");
			resp.sendRedirect("/ExpenseReimbursementSystem/static/viewAllRequests.html");
			employeeController.viewPastRequests(req);
		}
	
	}
}
