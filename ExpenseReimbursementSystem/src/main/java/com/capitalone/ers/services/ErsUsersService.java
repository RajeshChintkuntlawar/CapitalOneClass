package com.capitalone.ers.services;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.ers.daos.ErsUsersDaoImpl;

public class ErsUsersService {
	Logger log = Logger.getRootLogger();

	public String login(HttpServletRequest req) {
		ErsUsersDaoImpl ersUsersDaoImpl = new ErsUsersDaoImpl();

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String userRole = null;

		userRole = ersUsersDaoImpl.findUserRole(username, password);

		return userRole;
	}
}
