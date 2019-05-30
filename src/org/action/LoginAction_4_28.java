package org.action;

import org.dao.LoginDao_4_28;
import org.model.Login_4_28;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction_4_28 extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,password;
	

	
	@Override
	public String execute() throws Exception {
		
		LoginDao_4_28 loginDao=new LoginDao_4_28();
		Login_4_28 l=loginDao.checkLogin(getName(),getPassword());
		if(l!=null) {
			ActionContext.getContext().getSession().put("l", l);
			
			if(l.isRole()) {
				return "admin";
			}else {
				return "student";
			}
			
		}
		else {
			return ERROR;
		}
		//return SUCCESS;
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
