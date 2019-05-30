package org.model;

import java.util.Date;

public class Lend_4_28 {
	private Integer id;
	private String bookname,publisher,isbn,bookid,readid;
	private float price;
	private Date ltime;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getReadid() {
		return readid;
	}
	public void setReadid(String readid) {
		this.readid = readid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getLtime() {
		return ltime;
	}
	public void setLtime(Date ltime) {
		this.ltime = ltime;
	}
}
