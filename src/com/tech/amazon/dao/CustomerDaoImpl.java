package com.tech.amazon.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.tech.amazon.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private Connection conn = null;
	private Statement stmt = null;

	public CustomerDaoImpl() {
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
	public boolean save(Customer customer) {
		String sql =
			"INSERT INTO CUSTOMER VALUES(SEQ_CUSTOMER.NEXTVAL, '" + customer.getName() + "','"
				+ customer.getName() + "','" + customer.getName() + "')";

		System.out.println(sql);
		try {
			this.stmt.execute(sql);
			return true;
		} catch (SQLException e) {
			System.out.println("SQLException in Amazon:can not create new category");
			e.printStackTrace();
		}
		sql =
			"INSERT INTO ADDRESS VALUES(SEQ_ADDRESS.NEXTVAL, '" + customer.getName() + "','"
				+ customer.getName() + "','" + customer.getName() + "')";

		System.out.println(sql);
		try {
			this.stmt.execute(sql);
			return true;
		} catch (SQLException e) {
			System.out.println("SQLException in Amazon:can not create new category");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Customer category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int cId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findById(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByName(String name) {
		return null;

	}

}
