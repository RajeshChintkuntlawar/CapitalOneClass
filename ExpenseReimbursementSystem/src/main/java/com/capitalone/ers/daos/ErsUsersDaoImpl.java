package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.beans.ErsUsers;
import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsUsersDaoImpl implements ErsUsersDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();
	ErsUserRolesDaoImpl eErsUserRolesDaoImpl = new ErsUserRolesDaoImpl();

	@Override
	public ErsUsers findByUserDetails(String username, String password) {
		try (Connection conn = conUtil.getConnection()) {
			log.debug("Retrieving User Details from ERS_USERS");
			log.debug("username " + username);
			log.debug("password " + password);
			PreparedStatement stmt = conn.prepareStatement("SELECT ers_users_id, ers_user_name, ers_password, ers_first_name, ers_last_name, user_email, user_role_id FROM ers_users WHERE ers_user_name = ? and ers_password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			log.debug("SQL used to retireve the data: " + stmt);
			ResultSet rs = stmt.executeQuery();
			ErsUsers ersUsers = null;
			if (rs.next()) {
				ersUsers = new ErsUsers(rs.getInt("ers_users_id"), rs.getString("ers_user_name"), rs.getString("ers_password"), rs.getString("ers_first_name"),
						rs.getString("ers_last_name"), rs.getString("user_email"), rs.getInt("user_role_id"));
				log.debug("Data Retrieval from ERS_USERS is successful for " + username);
				return ersUsers;
			} else {
				log.debug("Data Retrieval from ERS_USERS failed for " + username);
			}
			return null;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
