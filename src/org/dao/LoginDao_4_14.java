package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.db.DBConn_4_14;
import org.model.Member_4_14;

public class LoginDao_4_14 {
	public Member_4_14 checkLogin(String user,String pass) {
		String sql="SELECT * FROM gjun.member where user=? and password=?";
		
		try {
			Connection cn=DBConn_4_14.getConn();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("interest"));
				String[] interet=rs.getString("interest").split(",");
				Member_4_14 m=new Member_4_14(rs.getString("name"),rs.getString("user"),rs.getString("password"),rs.getString("address"),rs.getString("tel"),rs.getString("sex"),interet,rs.getString("remark"));
				//l.setName(rs.getString("name"));
				//l.setPassword(rs.getString("password"));
				//System.out.println(l.getName()+","+l.getPassword());
				//System.out.println(m.getUser());
				return m;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			DBConn_4_14.closeConn();									
		}
		
	}
	
	public static void add(String name, String user, String password,String address,String tel,String sex,String interest, String remark) {
		String sql="insert into member(name,user,password,address,tel,sex,interest,remark) values(?,?,?,?,?,?,?,?)";
		try {
			Connection cn=DBConn_4_14.getConn();
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
			DBConn_4_14.closeConn();									
		}
	}
	
	public static void main(String[] args) {
		LoginDao_4_14 ld=new LoginDao_4_14();
		//ld.add("abc", "abc", "abc", "abc","abc", "abc", "1,2", "abc");
		ld.checkLogin("ab", "ab");
		//add("xyz", "987");
	}
}
