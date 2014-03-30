package com.tech.amazon.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.tech.amazon.model.Category;

public class CategoryDaoImpl implements CategoryDao {

	private Connection conn = null;
	private Statement stmt = null;

	public CategoryDaoImpl() {
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
	public boolean save(Category category) {

		String sql =
			"INSERT INTO CATEGORY VALUES(SEQ_CATEGORY.NEXTVAL, '" + category.getName() + "','"
				+ category.getDesc() + "','" + category.getStatus() + "')";

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
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int cId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category findById(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
