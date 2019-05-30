package org.action;

import org.dao.LoginDao;
import org.model.Login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private Login login;
	
	
	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	@Override
	public String execute() throws Exception {
		LoginDao loginDao=new LoginDao();
		Login l=loginDao.checkLogin(login.getName(), login.getPassword());
		if(l!=null) {
			ActionContext.getContext().getSession().put("l", l);
			return SUCCESS;
		}
		else {
			return ERROR;
		}
		
		
	}
}
