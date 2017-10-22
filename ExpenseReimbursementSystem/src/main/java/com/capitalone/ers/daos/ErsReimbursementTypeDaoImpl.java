package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsReimbursementType;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsReimbursementTypeDaoImpl implements ErsReimbursementTypeDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	@Override
	public ErsReimbursementType findById(int typeId) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Data retrieval from ERS_REIMBURSEMENT_TYPE based on Reimbursement Type Id");

			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM ERS_REIMBURSEMENT_TYPE WHERE REIMB_TYPE_ID = ?");

			stmt.setInt(1, typeId);

			ResultSet rs = stmt.executeQuery();

			ErsReimbursementType ersReimbursementType = null;

			if (rs.next()) {
				ersReimbursementType = new ErsReimbursementType(rs.getInt("REIMB_Type_ID"), rs.getString("REIMB_Type"));
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_TYPE is successful for " + typeId);
			} else {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_TYPE failed for " + typeId);
			}

			return ersReimbursementType;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ErsReimbursementType findByType(String reimbType) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Data retrieval from ERS_REIMBURSEMENT_TYPE based on Reimbursement Type");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ERS_REIMBURSEMENT_TYPE WHERE REIMB_TYPE = ?");
			stmt.setString(1, reimbType);
			ResultSet rs = stmt.executeQuery();
			ErsReimbursementType ersReimbursementType = null;
			if (rs.next()) {
				ersReimbursementType = new ErsReimbursementType(rs.getInt("REIMB_Type_ID"), rs.getString("REIMB_Type"));
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_TYPE is successful for " + reimbType);
			} else {
				log.debug("Data Retrieval from ERS_REIMBURSEMENT_TYPE failed for " + reimbType);
			}
			return ersReimbursementType;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
