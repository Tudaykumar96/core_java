package com.exceptiojnns.checkedExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlExcptionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibdb","root","root");
		Statement stmt = con.createStatement();
		stmt.executeQuery("create table studentinfo");
		
	}
}
