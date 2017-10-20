package com.capitalone.ers.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.services.ErsReimbursementService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ManagerController {

	private Logger log = Logger.getRootLogger();
	ErsReimbursementService ersReimbursementService = new ErsReimbursementService();

	public void viewAllRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			log.debug("Retrieving all User Tickets");
			ersReimbursementService.getAllsRequestsDetails(req, resp);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
