package com.capital.one.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class FrontController extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	private UserController userController = new UserController();

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

		// route to user controller
		if(requestUrl.startsWith("/users")) {
			userController.processGetRequests(req, resp);
		}
		
		req.getRequestDispatcher("/static/loginPage.html").forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("post request made with url: " + requestUrl);
		
		if(requestUrl.startsWith("/users")) {
			userController.processPostRequests(req, resp);
		}
	}
}
