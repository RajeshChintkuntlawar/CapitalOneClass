package com.capitalone.ers.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.ers.services.ErsReimbursementService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class EmployeeController {

	private Logger log = Logger.getRootLogger();
	ErsReimbursementService ersReimbursementService = new ErsReimbursementService();

	public void viewPastRequests(HttpServletRequest req) {
		log.debug("In viewPastRequests");
		try {
			ersReimbursementService.getPastRequestDetails(req);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void newReimbursementRequest(HttpServletRequest req) {
		log.debug("In newReimbursementRequest");
		ersReimbursementService.addNewReimbursementDetails(req);

	}

}
