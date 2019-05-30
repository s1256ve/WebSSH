package org.dao;

import org.DBConn.DBConn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Login_5_12;
import org.model.Login_5_12;

public class LoginDao_5_12 {
	public static void add(Login_5_12 l) {
		Session sn=DBConn.conn();
		Transaction tx=sn.beginTransaction();
		sn.save(l);
		tx.commit();
	}
	
	public static Login_5_12 load(int id) {
		Session sn=DBConn.conn();
		return (Login_5_12)sn.get(Login_5_12.class, new Integer(id));
	}
	
	public static void update(int id,Login_5_12 lf) {
		Session sn=DBConn.conn();
		Login_5_12 b=load(id);
		b.setName(lf.getName());
		Transaction tx=sn.beginTransaction();
		sn.update(b);
		tx.commit();
	}
	
	public static void delete(int id) {
		Session sn=DBConn.conn();
		Login_5_12 b=load(id);
		Transaction tx=sn.beginTransaction();
		sn.delete(b);
		tx.commit();
	}
	
	public static void main(String[] args) {
		//add(new Login_5_12("c", "c",true));
	}
}
