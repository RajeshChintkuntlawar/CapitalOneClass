package com.capital.one.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capital.one.beans.BankAccount;

public class BankAccountDaoJDBC implements BankAccountDao {

	@Override
	public List<BankAccount> findByUserId(int userId) {
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		try (Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=week2day3", "postgres", "bondstone")) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bank_accounts as ba JOIN user_bank_accounts as uba ON (ba.bank_id = uba.bank_id) WHERE uba.user_id = '" + userId + "'");

			while (rs.next()) {
				BankAccount acc = new BankAccount(rs.getInt("bank_id"), rs.getDouble("balance"), rs.getString("account_type"));
				accounts.add(acc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}

}
