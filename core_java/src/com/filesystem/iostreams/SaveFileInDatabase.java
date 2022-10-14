package com.filesystem.iostreams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveFileInDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connection();
		System.out.println("connection established");

	}

	public static Connection connection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/filereaderdb";
		String userName = "root";
		String password = "root";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
