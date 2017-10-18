package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursementStatus;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsReimbursementStatusDaoImpl implements ErsReimbursementStatusDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	@Override
	public ErsReimbursementStatus findById(int statusId) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Data retrieval from ERS_REIMBURSEMENT_STATUS");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ERS_REIMBURSEMENT_STATUS WHERE REIMB_STATUS_ID = ?");
			stmt.setInt(1, statusId);
			ResultSet rs = stmt.executeQuery();
			ErsReimbursementStatus ersReimbursementStatus = null;
			if (rs.next()) {
				ersReimbursementStatus = new ErsReimbursementStatus(rs.getInt("REIMB_STATUS_ID"), rs.getString("REIMB_STATUS"));
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_STATUS is successful for " + statusId);
			} else {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_STATUS failed for " + statusId);
			}
			return ersReimbursementStatus;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
