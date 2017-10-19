package com.capitalone.ers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.ers.utils.DatabaseConnectionUtility;

public class ErsUsersDaoImpl implements ErsUsersDao {
	private Logger log = Logger.getRootLogger();
	private DatabaseConnectionUtility conUtil = new DatabaseConnectionUtility();

	@Override
	public String findUserRole(String username, String password) {
		try (Connection conn = conUtil.getConnection()) {
			log.trace("Retrieving User Role for " + username);

			PreparedStatement stmt = conn.prepareStatement("select user_role "
					+ " from expensereimbursementsystem.ers_users as users, expensereimbursementsystem.ers_user_roles as userroles"
					+ " where users.user_role_id = userroles.ers_user_role_id "
					+ " And ers_user_name = ? and ers_password = ?");

			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				log.debug(username + "'s role is " + rs.getString("user_role"));
				return rs.getString("user_role");
			} else {
				log.debug(username + " is an unknown User");
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}