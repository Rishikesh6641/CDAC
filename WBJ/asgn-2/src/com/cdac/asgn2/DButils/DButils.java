package com.cdac.asgn2.DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	
	private static Connection connection;
	
	public static Connection openConnection()throws SQLException {
		String url="jdbc:mysql://localhost:3306/advjava";
		connection=DriverManager.getConnection(url,"root","cdac");
		return connection;
	}
	
	public static void closeConnection()throws SQLException{
		if(connection!=null)
		connection.close();
		
		System.out.println("Connection closed");
	}

}
