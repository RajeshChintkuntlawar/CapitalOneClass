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

	@Override
	public ErsUsers findUserId(String username) {
		try (Connection conn = conUtil.getConnection()) {
			log.trace("Retrieving User Id for " + username);
			ErsUsers ersUsers = null;

			PreparedStatement stmt = conn.prepareStatement(
					"SELECT ers_users_id, ers_user_name, ers_password, ers_first_name, ers_last_name, user_email, user_role_id"
							+ " FROM ers_users Where ers_user_name = ?");

			stmt.setString(1, username.toLowerCase());
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				ersUsers = new ErsUsers(rs.getInt("ers_users_id"), rs.getString("ers_user_name"),
						rs.getString("ers_password"), rs.getString("ers_first_name"), rs.getString("ers_last_name"),
						rs.getString("user_email"), rs.getInt("user_role_id"));

				log.debug("ersUsers data to store in the session variables " + ersUsers);
				return ersUsers;
			} else {
				log.debug(username + " is an unknown User. ERS doesn't have any details about " + username);
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}