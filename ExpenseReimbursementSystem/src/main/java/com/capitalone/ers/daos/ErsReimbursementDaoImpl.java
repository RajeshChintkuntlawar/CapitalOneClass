package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursement;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsReimbursementDaoImpl implements ErsReimbursementDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	@Override
	public ErsReimbursement findByAuthor(int authoerId) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Retrieving ERS_REIMBURSEMENT Data");
			// PreparedStatement stmt = conn.prepareStatement("SELECT reimb_id,
			// reimb_amount, reimb_submitted, reimb_resolved, reimb_description,
			// reimb_receipt, reimb_author, reimb_resolver, reimb_status_id,
			// reimb_type_id FROM ers_reimbursement WHERE REIMB_AUTHOR = ?");

			PreparedStatement stmt = conn.prepareStatement(
					"SELECT reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt, users.ers_first_name, reimb_resolver, ersstatus.reimb_status, erstype.reimb_type"
							+ " FROM ers_reimbursement as ersreimb, ers_reimbursement_status as ersstatus, ers_reimbursement_type as erstype, ers_users as users"
							+ " Where ersreimb.reimb_status_id = ersstatus.reimb_status_id"
							+ " And ersreimb.reimb_type_id = erstype.reimb_type_id"
							+ " And ersreimb.reimb_author = users.ers_users_id" + " And REIMB_AUTHOR = ?");

			stmt.setInt(1, authoerId);
			log.debug("stmt " + stmt);
			ResultSet rs = stmt.executeQuery();
			ErsReimbursement ersReimbursement = null;
			if (rs.next()) {
				ersReimbursement = new ErsReimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"),
						rs.getTimestamp("reimb_submitted"), rs.getTimestamp("reimb_resolved"),
						rs.getString("reimb_description"), rs.getString("reimb_receipt"),
						rs.getString("ers_first_name"), rs.getString("reimb_resolver"), rs.getString("reimb_status"),
						rs.getString("reimb_type"));

				log.debug("Data Retrieval from ERS_REIMBURSEMENT is successful for " + authoerId);
			} else {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT failed for " + authoerId);
			}
			return ersReimbursement;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addReimbursement(ErsReimbursement ersReimbursement) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Inserting new Reimbursement data into ERS_REIMBURSEMENT");
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO ers_reimbursement("
					+ "reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id)"
					+ "VALUES (0, ersReimbursement.getReimbAmount(), ersReimbursement.getReimbSubmitted(), ersReimbursement.getReimbResolved(), ersReimbursement.getReimbDescription(), ersReimbursement.getReimbReceipt(), ersReimbursement.getReimbAuthor(), ersReimbursement.getReimbResolver(), ersReimbursement.getReimbStatusId(), ersReimbursement.getReimbTypeId());");
			ResultSet rs = stmt.executeQuery();
			if (rs.rowInserted()) {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT is successful for " + ersReimbursement.toString());
			} else {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT failed for " + ersReimbursement.toString());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
