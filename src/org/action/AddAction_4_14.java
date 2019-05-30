package org.action;

import org.dao.LoginDao_4_14;
import org.model.Member_4_14;

import com.opensymphony.xwork2.ActionSupport;

public class AddAction_4_14 extends ActionSupport{
	private String name, user, password, address, tel, sex, remark;
	private String[] interest;
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Member_4_14 m=new Member_4_14(name, user, password, address, tel, sex, interest, remark);
		for(String s:m.getInterest())
			System.out.println(s);
		LoginDao_4_14.add(m.getName(), m.getUser(), m.getPassword(), m.getAddress(), m.getTel(), m.getSex(), m.Interest(), m.getRemark());
		return SUCCESS;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

}
