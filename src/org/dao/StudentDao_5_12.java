package org.dao;

import java.util.Date;

import org.DBConn.DBConn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Student_5_12;
import org.model.Student_5_12;

public class StudentDao_5_12 {
	
	public static void add( Student_5_12 s) {
		Session sn=DBConn.conn();
		Transaction tx=sn.beginTransaction();
		sn.save(s);
		tx.commit();
	}
	
	public static Student_5_12 load(int id) {
		Session sn=DBConn.conn();
		return (Student_5_12)sn.get(Student_5_12.class, new Integer(id));
	}
	
	public static void update(int id,Student_5_12 bf) {
		Session sn=DBConn.conn();
		Student_5_12 b=load(id);
		b.setName(bf.getName());
		Transaction tx=sn.beginTransaction();
		sn.update(b);
		tx.commit();
	}
	
	public static void delete(int id) {
		Session sn=DBConn.conn();
		Student_5_12 b=load(id);
		Transaction tx=sn.beginTransaction();
		sn.delete(b);
		tx.commit();
	}
	
	public static void main(String[] args) {
		add(new Student_5_12("abc123", "aa","aa", true, new Date(), 1, 1));
	}
}
