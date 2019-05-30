package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.db.DBConn_4_28;
import org.model.Login_4_28;

public class LoginDao_4_28 {
	

	
	public Login_4_28 checkLogin(String user,String pass) {
		String sql="SELECT * FROM login where name=? and password=?";
		
		try {
			Connection cn=DBConn_4_28.getConn();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				Login_4_28 l=new Login_4_28();
				l.setId(rs.getInt("id"));
				l.setName(rs.getString("name"));
				l.setPassword(rs.getString("password"));
				l.setRole(rs.getBoolean("role"));
				return l;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			DBConn_4_28.closeConn();									
		}
		
	}
	/*
	public static void add(String name, String user, String password,String address,String tel,String sex,String interest, String remark) {
		String sql="insert into member(name,user,password,address,tel,sex,interest,remark) values(?,?,?,?,?,?,?,?)";
		try {
			Connection cn=DBConn_4_28.getConn();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, user);
			ps.setString(3, password);
			ps.setString(4, address);
			ps.setString(5, tel);
			ps.setString(6, sex);
			ps.setString(7, interest);
			ps.setString(8, remark);
			ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			DBConn_4_28.closeConn();									
		}
	}
	*/
	public static void main(String[] args) {
		LoginDao_4_28 ld=new LoginDao_4_28();
		//ld.add("abc", "abc", "abc", "abc","abc", "abc", "1,2", "abc");
		System.out.println(ld.checkLogin("a", "a"));
		//add("xyz", "987");
	}
}
