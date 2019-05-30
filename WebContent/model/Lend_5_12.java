package org.model;

import java.io.Serializable;
import java.util.Date;

public class Lend_5_12 implements Serializable{
	private Integer id;	
	private String bookId;
	private String readId;
	private String bookName;
	private String publisher;
	private float price;
	private String ISBN;
	private Date lTime;
	
	public Lend_5_12() {
		
	}
	
	public Lend_5_12(String bookId, String readId, String bookName, String publisher, float price,
			String iSBN, Date lTime) {
		
		
		this.bookId = bookId;
		this.readId = readId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
		this.ISBN = iSBN;
		this.lTime = lTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getReadId() {
		return readId;
	}
	public void setReadId(String readId) {
		this.readId = readId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Date getlTime() {
		return lTime;
	}
	public void setlTime(Date lTime) {
		this.lTime = lTime;
	}
}
