package com.tech.amazon.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tech.amazon.model.UserLogin;

public class UserLoginDaoImpl implements UserLoginDao {

	private Connection conn = null;
	private Statement stmt = null;

	public UserLoginDaoImpl() {
		this.conn = DBConn.getConnection();
		if (this.conn == null) {
			System.out.println("Connection Error");
			throw new RuntimeException();
		}
		try {
			this.stmt = this.conn.createStatement();
		} catch (SQLException e) {
			System.out.println("SQLException in Amazon:can not create statement");
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int custId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserLogin findById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserLogin findByName(String name) {
		// bob
		try {
			String sql = "SELECT * FROM USERLOGIN WHERE USERNAME = '" + name + "'";
			ResultSet rs = this.stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs);
				UserLogin userLogin = new UserLogin(rs.getInt(1), rs.getString(2), rs.getString(3));
				return userLogin;
			}
		} catch (SQLException e) {
			System.out.println("got SQLException");
			e.printStackTrace();
		}
		return null;
		// bob
	}
}
