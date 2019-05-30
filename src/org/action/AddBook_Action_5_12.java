package org.action;

import org.dao.BookDao_5_12;
import org.model.Book_5_12;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddBook_Action_5_12 extends ActionSupport{
	private Integer id;	
	private String ISBN;
	private String bookName;
	private String author;
	private String publisher;
	private float price;
	private int cnum;
	private int snum;
	private String summary;
	
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Book_5_12 b=new Book_5_12(ISBN,bookName,author,publisher,price,cnum,snum,summary);
		BookDao_5_12 bd=new BookDao_5_12();
		if (b!=null) {
			bd.add(b);
			ActionContext.getContext().getSession().put("book", b);
			return "success";
		}
		else {
			return "fail";
		}
		
	}
}
