package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursement;
import com.capitalone.ers.beans.ErsReimbursementType;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsReimbursementDaoImpl implements ErsReimbursementDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	ErsReimbursementTypeDaoImpl ersReimbursementTypeDaoImpl = new ErsReimbursementTypeDaoImpl();
	ErsReimbursementType ersReimbursementType = new ErsReimbursementType();

	@Override
	public List<ErsReimbursement> findByAuthor(int authorId) {
		List<ErsReimbursement> ersReimbursements = new ArrayList<ErsReimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Retrieving ERS_REIMBURSEMENT Data for " + authorId);

			PreparedStatement stmt = conn.prepareStatement(
					"SELECT reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt, users.ers_first_name, reimb_resolver, ersstatus.reimb_status, erstype.reimb_type"
							+ " FROM ers_reimbursement as ersreimb, ers_reimbursement_status as ersstatus, ers_reimbursement_type as erstype, ers_users as users"
							+ " Where ersreimb.reimb_status_id = ersstatus.reimb_status_id"
							+ " And ersreimb.reimb_type_id = erstype.reimb_type_id"
							+ " And ersreimb.reimb_author = users.ers_users_id And REIMB_AUTHOR = ?"
							+ " order by reimb_id");

			stmt.setInt(1, authorId);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				if (rs.getString("reimb_resolver") != null) {

					// Retrieve the resolver name
					PreparedStatement stmtNew = conn
							.prepareStatement("SELECT ers_first_name FROM ers_users Where ers_users_id = "
									+ rs.getString("reimb_resolver"));

					ResultSet rsNew = stmtNew.executeQuery();

					if (rsNew.next()) {
						log.debug(rsNew.getString("ers_first_name"));
					}

					ersReimbursements.add(new ErsReimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"),
							rs.getTimestamp("reimb_submitted"), rs.getTimestamp("reimb_resolved"),
							rs.getString("reimb_description"), rs.getString("reimb_receipt"),
							rs.getString("ers_first_name"), rsNew.getString("ers_first_name"),
							rs.getString("reimb_status"), rs.getString("reimb_type")));
				} else {
					// Add Resolver Name as blank
					ersReimbursements.add(new ErsReimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"),
							rs.getTimestamp("reimb_submitted"), rs.getTimestamp("reimb_resolved"),
							rs.getString("reimb_description"), rs.getString("reimb_receipt"),
							rs.getString("ers_first_name"), " ", rs.getString("reimb_status"),
							rs.getString("reimb_type")));
				}
			}

			return ersReimbursements;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ErsReimbursement> findAllRequests() {
		List<ErsReimbursement> ersReimbursements = new ArrayList<ErsReimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Retrieving ERS_REIMBURSEMENT Data for All Users");

			PreparedStatement stmt = conn.prepareStatement(
					"SELECT reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt, users.ers_first_name, reimb_resolver, ersstatus.reimb_status, erstype.reimb_type"
							+ " FROM ers_reimbursement as ersreimb, ers_reimbursement_status as ersstatus, ers_reimbursement_type as erstype, ers_users as users"
							+ " Where ersreimb.reimb_status_id = ersstatus.reimb_status_id"
							+ " And ersreimb.reimb_type_id = erstype.reimb_type_id"
							+ " And ersreimb.reimb_author = users.ers_users_id" + " order by reimb_id");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				ersReimbursements.add(new ErsReimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"),
						rs.getTimestamp("reimb_submitted"), rs.getTimestamp("reimb_resolved"),
						rs.getString("reimb_description"), rs.getString("reimb_receipt"),
						rs.getString("ers_first_name"), rs.getString("reimb_resolver"), rs.getString("reimb_status"),
						rs.getString("reimb_type")));
			}

			return ersReimbursements;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addReimbursement(ErsReimbursement inputData) {
		try (Connection conn = conUtil.getConnection()) {

			int authorId = Integer.parseInt(inputData.getReimbAuthor());

			PreparedStatement stmt = conn.prepareStatement(
					"INSERT INTO ers_reimbursement(reimb_amount, reimb_description, reimb_author, reimb_type_id)"
							+ " VALUES (?,?,?,?)");

			stmt.setDouble(1, inputData.getReimbAmount());
			stmt.setString(2, inputData.getReimbDescription());
			stmt.setInt(3, authorId);
			stmt.setInt(4, inputData.getReimbTypeId());

			log.debug("Insert Statement Prepared: " + stmt);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateReimbursement(String managerRequest, int resolverId) throws SQLException {

		try (Connection conn = conUtil.getConnection()) {
			
			String formattedRequest = managerRequest.substring(1, managerRequest.length() - 1);

			String[] splitManagerAction = formattedRequest.split(",");
			int reimbursementIdUpdated = Integer.parseInt(splitManagerAction[0]);

			PreparedStatement stmt = conn.prepareStatement(
					"UPDATE ers_reimbursement SET reimb_resolved=current_timestamp, reimb_resolver=?, reimb_status_id=? WHERE reimb_id=?");

			stmt.setInt(1, resolverId);
			if (splitManagerAction[1].equals("Approve")) {
				stmt.setInt(2, 2);
			} else if (splitManagerAction[1].equals("Deny")) {
				stmt.setInt(2, 3);
			} else {
				stmt.setInt(2, 1);
			}
			
			stmt.setInt(3, reimbursementIdUpdated);

			stmt.executeUpdate();
		}
	}
}