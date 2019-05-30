package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.db.DBConn;
import org.model.Login;

public class LoginDao {
	public Login checkLogin(String name,String pass) {
		String sql="SELECT * FROM gjun.login where name=? and password=?";
		
		try {
			Connection cn=DBConn.getConn();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				Login l=new Login();
				l.setName(rs.getString("name"));
				l.setPassword(rs.getString("password"));
				//System.out.println(l.getName()+","+l.getPassword());
				return l;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			DBConn.closeConn();									
		}
		
	}
	
	public static void add(String name,String password) {
		String sql="insert into login(name,password) values(?,?)";
		try {
			Connection cn=DBConn.getConn();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			DBConn.closeConn();									
		}
	}
	
	public static void main(String[] args) {
		//checkLogin("abc", "1234");
		add("xyz", "987");
	}
}
