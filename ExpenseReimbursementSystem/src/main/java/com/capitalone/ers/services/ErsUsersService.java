package com.capitalone.ers.services;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsUserRoles;
import com.capitalone.ers.beans.ErsUsers;
import com.capitalone.ers.daos.ErsUserRolesDaoImpl;
import com.capitalone.ers.daos.ErsUsersDaoImpl;

public class ErsUsersService {
	Logger log = Logger.getRootLogger();

	public void login(HttpServletRequest req, HttpServletResponse resp) {
		ErsUserRolesDaoImpl ersUserRolesDaoImpl = new ErsUserRolesDaoImpl();

		String username = req.getParameter("username").toLowerCase();
		String password = req.getParameter("password");
		ErsUserRoles ersUserRoles = null;

		ersUserRoles = ersUserRolesDaoImpl.findUserRole(username, password);

		try {
			if (!ersUserRoles.getUserRole().equals(null)) {
				if (ersUserRoles.getUserRole().equals("EMPLOYEE")) {
					resp.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
				} else {

					resp.sendRedirect("/ExpenseReimbursementSystem/static/manager.html");

				}
			} else {
				log.debug("Failed to retrieve the User Role.  Redirecting to Login Page.");
				resp.sendRedirect("/ExpenseReimbursementSystem/static/ErsLogin.html");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void retrieveUserId(HttpServletRequest req, HttpServletResponse resp) {
		ErsUsersDaoImpl ersUsersDaoImpl = new ErsUsersDaoImpl();

		String username = req.getParameter("username");
		ErsUsers ersUsers = new ErsUsers();

		ersUsers = ersUsersDaoImpl.findUserId(username);

		req.getSession().setAttribute("currentUser", ersUsers);
//		ErsUsers currentUser = (ErsUsers) req.getSession().getAttribute("currentUser");
//		log.debug("currentUser " + currentUser.getErsUsersId());

	}

}
