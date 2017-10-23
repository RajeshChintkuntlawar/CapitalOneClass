package com.capitalone.ers.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursement;
import com.capitalone.ers.beans.ErsReimbursementType;
import com.capitalone.ers.beans.ErsUsers;
import com.capitalone.ers.daos.ErsReimbursementDaoImpl;
import com.capitalone.ers.daos.ErsReimbursementTypeDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ErsReimbursementService {
	Logger log = Logger.getRootLogger();
	ErsReimbursementDaoImpl ersReimbursementDaoImpl = new ErsReimbursementDaoImpl();
	ErsReimbursement ersReimbursement = new ErsReimbursement();

	ErsReimbursementTypeDaoImpl ersReimbursementTypeDaoImpl = new ErsReimbursementTypeDaoImpl();
	ErsReimbursementType ersReimbursementType = new ErsReimbursementType();

	public void getPastRequestDetails(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		// Retrieve the session user id
		ErsUsers currentUser = (ErsUsers) req.getSession().getAttribute("currentUser");

		// jackson code for converting to json
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		try {

			log.debug("Current User " + currentUser);
			log.debug("currentUser.getErsUsersId() " + currentUser.getErsUsersId());
			String ersReimbursementJson = ow
					.writeValueAsString(ersReimbursementDaoImpl.findByAuthor(currentUser.getErsUsersId()));

			// write to response body
			log.debug(ersReimbursementJson);
			resp.getWriter().println(ersReimbursementJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void addNewReimbursementDetails(HttpServletRequest request, HttpServletResponse resp) {
		// Retrieve the session user id
		ErsUsers currentUser = (ErsUsers) request.getSession().getAttribute("currentUser");

		// Create data for Insert
		ErsReimbursement ersReimbursement = new ErsReimbursement();

		ersReimbursement.setReimbAmount(Double.parseDouble(request.getParameter("ReimbursementAmount").toString()));
		ersReimbursement.setReimbDescription(request.getParameter("ReimbursementDescription"));
		Integer userId = currentUser.getErsUsersId();
		ersReimbursement.setReimbAuthor(userId.toString());

		ersReimbursementType = ersReimbursementTypeDaoImpl.findByType((request.getParameter("ReimbursementType")));

		ersReimbursement.setReimbTypeId(ersReimbursementType.getReimbTypeId());

		ersReimbursementDaoImpl.addReimbursement(ersReimbursement);
	}

	public void getAllsRequestsDetails(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		try {
			String ersReimbursementAllRequestsJson = ow.writeValueAsString(ersReimbursementDaoImpl.findAllRequests());

			// write to response body
			log.debug(ersReimbursementAllRequestsJson);
			resp.getWriter().println(ersReimbursementAllRequestsJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void updateReimbursementDetails(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {

		// Retrieve the session user id
		ErsUsers currentUser = (ErsUsers) request.getSession().getAttribute("currentUser");
		Integer resolverId = currentUser.getErsUsersId();

		
		// Approve or Deny a reimbursement based on manager action
		ersReimbursementDaoImpl.updateReimbursement(request.getReader().readLine().toString(), resolverId);
	}

}
