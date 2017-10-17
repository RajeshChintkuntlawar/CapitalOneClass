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

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.trace("full url: " + req.getRequestURI());
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("get request made with url: " + requestUrl);

		// route static content normally
		if (requestUrl.startsWith("/static/")) {
			super.doGet(req, resp);
			return;
		}

		req.getRequestDispatcher("/static/ErsLogin.html").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("proceeding with the post request using url: " + requestUrl);

		if (requestUrl.startsWith("/static/ErsLogin")) {
			ersUserController.processPostRequests(req, resp);
		}
	}
}
