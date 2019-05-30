package org.dao;

import java.util.Date;

import org.DBConn.DBConn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Lend_5_12;
import org.model.Lend_5_12;

public class LendDao_5_12 {
	public static void add(Lend_5_12 l) {
		Session sn=DBConn.conn();
		Transaction tx=sn.beginTransaction();
		sn.save(l);
		tx.commit();
	}
	public static Lend_5_12 load(int id) {
		Session sn=DBConn.conn();
		return (Lend_5_12)sn.get(Lend_5_12.class, new Integer(id));
	}
	
	public static void update(int id,Lend_5_12 bf) {
		Session sn=DBConn.conn();
		Lend_5_12 b=load(id);
		b.setBookName(bf.getBookName());
		Transaction tx=sn.beginTransaction();
		sn.update(b);
		tx.commit();
	}
	
	public static void delete(int id) {
		Session sn=DBConn.conn();
		Lend_5_12 b=load(id);
		Transaction tx=sn.beginTransaction();
		sn.delete(b);
		tx.commit();
	}
	
	public static void main(String[] args) {
		add(new Lend_5_12("abc123", "a1", "java", "aaa", 100, "abc123", new Date()));
	}
}
