package org.action;

import org.dao.BookDao_5_12;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteBook_Action_5_12 extends ActionSupport{
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		BookDao_5_12 bd=new BookDao_5_12();
		if(bd.load(id)!=null) {
			bd.delete(id);
			return "success";
		}
		return "fail";
			
	}
}
