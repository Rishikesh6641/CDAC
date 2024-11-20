package com.cdac.ov.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	
	private static Connection connection;
	
	public static void openConnection()throws SQLException {
		String url="jdbc:mysql://localhost:3306/advjava";
		connection=DriverManager.getConnection(url,"root","cdac");
		System.out.println("Connection Established...");
	}
	
	public static Connection getConnection() {
		return connection;
	}

	public static void closeConnection() throws SQLException{
		connection.close();
		System.out.println("Connection Closed");
	}
	
}
