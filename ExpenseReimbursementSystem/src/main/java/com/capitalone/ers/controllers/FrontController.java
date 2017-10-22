package com.capitalone.ers.controllers;

import java.io.IOException;
import java.sql.SQLException;

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

			// //Check if the user already logged in
			// if(!"/static/ErsLogin.html".equals(requestUrl)) {
			// ErsUsers currentUser = (ErsUsers)
			// req.getSession().getAttribute("currentUser");
			// if(currentUser == null) {
			// resp.sendRedirect("/static/ErsLogin.html");
			// return;
			// }
			// }
			super.doGet(req, resp);
			return;
		} else if (requestUrl.startsWith("/viewPastTickets")) {
			log.debug("viewPastTickets");
			employeeController.viewPastRequests(req, resp);
		} else if (requestUrl.startsWith("/viewAllRequests")) {
			log.debug("viewAllRequests");
			managerController.viewAllRequests(req, resp);
		} else {
			req.getRequestDispatcher("/static/ErsLogin.html").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		log.debug("proceeding with the post request using url: " + requestUrl);

		if (requestUrl.startsWith("/ErsLogin")) {
			req.getSession().removeAttribute("currentUser");
			ersUserController.processPostRequests(req, resp);
		} else if (requestUrl.startsWith("/static/static/newReimbursementRequest.html")) {
			employeeController.newReimbursementRequest(req, resp);
			resp.sendRedirect("/ExpenseReimbursementSystem/static/viewPastTickets.html");
		} else if (requestUrl.startsWith("/updateDenyRequest")) {
				try {
					employeeController.updateReimbursementRequest(req, resp);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} else {
			log.debug("requestUrl received in doPost " + requestUrl);
			// req.getRequestDispatcher("/static/ErsLogin.html").forward(req,
			// resp);
		}

	}
}
