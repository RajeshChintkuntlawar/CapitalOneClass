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
			log.trace("retrieving user id");
			ersUsers.retrieveUserId(req, resp);
			log.trace("retrieving user role");
			ersUsers.login(req, resp);
			break;

		default:
			break;
		}
	}

}
