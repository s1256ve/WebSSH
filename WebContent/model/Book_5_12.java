package org.model;

import java.io.Serializable;

public class Book_5_12 implements Serializable{
	private Integer id;	
	private String ISBN;
	private String bookName;
	private String author;
	private String publisher;
	private float price;
	private int cnum;
	private int snum;
	private String summary;

	
	public Book_5_12() {
		
	}
	
	public Book_5_12(String ISBN,String bookName) {
		
		this.ISBN=ISBN;
		this.bookName=bookName;
	}
	
	public Book_5_12( String iSBN, String bookName, String author, String publisher, float price, int cnum,
			int snum, String summary) {
		
		this.ISBN = iSBN;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.cnum = cnum;
		this.snum = snum;
		this.summary = summary;
		
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
