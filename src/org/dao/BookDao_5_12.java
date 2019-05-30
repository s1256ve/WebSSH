package org.dao;

import org.DBConn.DBConn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Book_5_12;

public class BookDao_5_12 {
	
	public static void add(Book_5_12 b) {
		Session sn=DBConn.conn();
		Transaction tx=sn.beginTransaction();
		sn.save(b);
		tx.commit();
	}
	
	public static Book_5_12 load(int id) {
		Session sn=DBConn.conn();
		return (Book_5_12)sn.get(Book_5_12.class, new Integer(id));
	}
	
	public static void update(int id,Book_5_12 bf) {
		Session sn=DBConn.conn();
		Book_5_12 b=load(id);
		b.setBookName(bf.getBookName());
		Transaction tx=sn.beginTransaction();
		sn.update(b);
		tx.commit();
	}
	
	public static void delete(int id) {
		Session sn=DBConn.conn();
		Book_5_12 b=load(id);
		Transaction tx=sn.beginTransaction();
		sn.delete(b);
		tx.commit();
	}
	
	public static void main(String[] args) {
		//add(new Book_5_12("1", "1", "1", "1", 100, 1,1, "aaabbbccc"));
		//System.out.println(load(1).getBookName());
		//Book_5_12 b=new Book_5_12("abc123", "java", "aaa", "bbb", 100, 3, 3, "aaabbbccc");
		//update(1, b);
		delete(2);
	}
}
