package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(getUsername().equals("abc")&&getPassword().equals("123")) {
			ActionContext.getContext().getSession().put("user", getUsername());
			ActionContext.getContext().getSession().put("pass", getPassword());
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
}
