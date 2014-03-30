package com.tech.amazon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static Connection conn = null;

	public static Connection getConnection() {

		if (DBConn.conn == null) {

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				DBConn.conn =
					DriverManager.getConnection("jdbc:oracle:thin:@6r26hx1:1521:orcl", "BETTY", "BETTY");
				System.out.println("Connection xreated");
				return DBConn.conn;
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException in Amazon:driver class not found");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("SQLException in Amazon:can not create connection");
				e.printStackTrace();
			}
			return DBConn.conn;
		}

		return DBConn.conn;
	}
}
