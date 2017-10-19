package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsUserRoles;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsUserRolesDaoImpl implements ErsUserRolesDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	@Override
	public ErsUserRoles findById(int roleId) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Data retrieval from ERS_USER_ROLES");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ERS_USER_ROLES WHERE ERS_USER_ROLE_ID = ?");
			stmt.setInt(1, roleId);
			ResultSet rs = stmt.executeQuery();
			ErsUserRoles ersUserRoles = null;
			if (rs.next()) {
				ersUserRoles = new ErsUserRoles(rs.getInt("ERS_USER_ROLE_ID"), rs.getString("USER_ROLE"));
				log.debug("Data Retrieval from ERS_USER_ROLES is successful for " + roleId);
			} else {
				log.debug("Data Retrieval from ERS_USER_ROLES failed for " + roleId);
			}
			return ersUserRoles;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
