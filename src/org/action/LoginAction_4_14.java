package org.action;

import org.dao.LoginDao_4_14;
import org.model.Member_4_14;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction_4_14 extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Member_4_14 member;

	
	
	@Override
	public String execute() throws Exception {
		
		LoginDao_4_14 loginDao=new LoginDao_4_14();
		Member_4_14 m=loginDao.checkLogin(getMember().getUser(), getMember().getPassword());
		if(m!=null) {
			ActionContext.getContext().getSession().put("m", m);
			return SUCCESS;
		}
		else {
			return ERROR;
		}
		//return SUCCESS;
		
	}
	
	public Member_4_14 getMember() {
		return member;
	}

	public void setMember(Member_4_14 member) {
		this.member = member;
	}
}
