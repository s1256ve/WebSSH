package org.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn_4_14 {
	private static Connection cn;
	public static Connection getConn() {
		String url="jdbc:mysql://localhost:3306/gjun";
		String user="root",pass="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(url,user,pass);
			System.out.println("Done");
			return cn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no driver");
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no connection");
			return null;
		}
		
	}
	public static void closeConn() {
		try {
			cn.close();
		} catch (Exception e) {
			System.out.println("Can't close connection");
		}
	}
	public static void main(String[] args) {
		getConn();
	}
}
