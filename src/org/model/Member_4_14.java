package org.model;

public class Member_4_14 {
	private String name, user, password, address, tel, sex, remark;
	private String[] interest;
 	public Member_4_14() {}
	
	public Member_4_14(String name, String user, String password,String address,String tel,String sex ,String[] interest, String remark) {
		this.name = name;
		this.user = user;
		this.password = password;
		this.address=address;
		this.tel = tel;
		this.sex=sex;
		this.interest = interest;
		this.remark = remark;
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

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	
	public String Interest() {
		String[] s= {"Sport","Moive","Music","Game"};
		String tmp="";
		for(int i=0;i<interest.length;i++)
			tmp+=s[Integer.parseInt(interest[i])-1]+(i==interest.length-1?"":",");
		return tmp;
	}
	/*
	public String[] setInterest(String str) {
		return str.split(",");
	}*/
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
