package com.capitalone.ers.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.tomcat.jni.User;

import com.capitalone.ers.beans.ErsUserRoles;
import com.capitalone.ers.beans.ErsUsers;
import com.capitalone.ers.daos.ErsUserRolesDaoImpl;
import com.capitalone.ers.daos.ErsUsersDaoImpl;

public class ErsUsersService {
	ErsUsersDaoImpl ersUsersDaoimpl = new ErsUsersDaoImpl();
	Logger log = Logger.getRootLogger();

	public List<User> getAllUser(HttpServletRequest req) {
		if (req.getAttribute("user") != null) {
			return null;
		}
		return null;
	}

	public ErsUserRoles login(HttpServletRequest req) {
		ErsUserRoles ersUserRoles = new ErsUserRoles();
		ErsUserRolesDaoImpl ersUserRolesDaoImpl = new ErsUserRolesDaoImpl();
		log.debug("In ErsUsersService login method");
		log.debug("user " + req.getParameter("username") + " is trying to login");

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		ErsUsers ersUsers = ersUsersDaoimpl.findByUserDetails(username, password);

		if (ersUsers != null) {
			log.debug("user " + username + " succesfully logged in");
			
			ersUserRoles = ersUserRolesDaoImpl.findById(ersUsers.getErsRoleId());

			log.debug("ersUserRoles " + ersUserRoles.getUserRole());

			return ersUserRoles;
		}
		return null;
	}
}
