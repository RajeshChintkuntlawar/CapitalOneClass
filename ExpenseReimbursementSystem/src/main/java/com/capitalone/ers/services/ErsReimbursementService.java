package com.capitalone.ers.services;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursement;
import com.capitalone.ers.daos.ErsReimbursementDaoImpl;

public class ErsReimbursementService {

	Logger log = Logger.getRootLogger();

	// public List<User> getAllUser(HttpServletRequest req) {
	// if (req.getAttribute("user") != null) {
	// return null;
	// }
	// return null;
	// }

	public void addReimbursement(HttpServletRequest req) {
		ErsReimbursementDaoImpl ersReimbursementDaoImpl = new ErsReimbursementDaoImpl();
		ErsReimbursement ersReimbursement = new ErsReimbursement();
		log.debug("In ErsReimbursement method");
		// ersReimbursement.setReimbAmount(req.getParameter("ReimbursementAmount"));
		ersReimbursement.setReimbSubmitted(new Timestamp(System.currentTimeMillis()));
		ersReimbursement.setReimbResolved(new Timestamp(System.currentTimeMillis()));
		ersReimbursement.setReimbDescription(req.getParameter("ReimbursementDescription"));
		byte b = 0;
		ersReimbursement.setReimbReceipt(b);
		ersReimbursement.setReimbAuthor(1);
		ersReimbursement.setReimbResolver(2);
		ersReimbursement.setReimbStatusId(1);
		switch (req.getParameter("ReimbursementType")) {
		case "LODGING":
			ersReimbursement.setReimbTypeId(1);
			break;
		case "TRAVEL":
			ersReimbursement.setReimbTypeId(2);
			break;
		case "FOOD":
			ersReimbursement.setReimbTypeId(3);
			break;
		case "OTHER":
			ersReimbursement.setReimbTypeId(4);
			break;
		default:
			ersReimbursement.setReimbTypeId(4);
			break;
		}
		ersReimbursementDaoImpl.addReimbursement(ersReimbursement);
	}
}
