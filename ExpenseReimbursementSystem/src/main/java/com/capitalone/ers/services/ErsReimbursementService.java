package com.capitalone.ers.services;

import java.io.IOException;
import java.security.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursement;
import com.capitalone.ers.daos.ErsReimbursementDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ErsReimbursementService {
	Logger log = Logger.getRootLogger();
	ErsReimbursementDaoImpl ersReimbursementDaoImpl = new ErsReimbursementDaoImpl();
	ErsReimbursement ersReimbursement = new ErsReimbursement();

	public void getPastRequestDetails(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		log.debug("getPastRequestDetails");

		// jackson code for converting to json
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		try {
			String ersReimbursementJson = ow.writeValueAsString(ersReimbursementDaoImpl.findByAuthor(1));

			// write to response body
			log.debug(ersReimbursementJson);
			resp.getWriter().println(ersReimbursementJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void addNewReimbursementDetails(HttpServletRequest req) {
		log.debug("In ErsReimbursement method");
//		ersReimbursement.setReimbAmount(req.getParameter("ReimbursementAmount"));
//		ersReimbursement.setReimbSubmitted(new Timestamp(System.currentTimeMillis()));
//		ersReimbursement.setReimbResolved(new Timestamp(System.currentTimeMillis()));
//		ersReimbursement.setReimbDescription(req.getParameter("ReimbursementDescription"));
//		byte b = 0;
//		ersReimbursement.setReimbReceipt(b);
//		ersReimbursement.setReimbAuthor(1);
//		ersReimbursement.setReimbResolver(2);
//		ersReimbursement.setReimbStatusId(1);
//		switch (req.getParameter("ReimbursementType")) {
//		case "LODGING":
//			ersReimbursement.setReimbTypeId(1);
//			break;
//		case "TRAVEL":
//			ersReimbursement.setReimbTypeId(2);
//			break;
//		case "FOOD":
//			ersReimbursement.setReimbTypeId(3);
//			break;
//		case "OTHER":
//			ersReimbursement.setReimbTypeId(4);
//			break;
//		default:
//			ersReimbursement.setReimbTypeId(4);
//			break;
//		}
//		ersReimbursementDaoImpl.addReimbursement(ersReimbursement);
	}

}
