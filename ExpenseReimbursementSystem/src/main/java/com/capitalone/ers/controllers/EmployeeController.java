package com.capitalone.ers.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.services.ErsReimbursementService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class EmployeeController {

	private Logger log = Logger.getRootLogger();
	ErsReimbursementService ersReimbursementService = new ErsReimbursementService();

	public void viewPastRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			ersReimbursementService.getPastRequestDetails(req, resp);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void newReimbursementRequest(HttpServletRequest req, HttpServletResponse resp) {
		ersReimbursementService.addNewReimbursementDetails(req, resp);

	}

	public void updateReimbursementRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
		ersReimbursementService.updateReimbursementDetails(req, resp);
		
	}
}
