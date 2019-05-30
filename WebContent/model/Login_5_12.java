package org.model;

import java.io.Serializable;

public class Login_5_12 implements Serializable{
	private Integer id;			
	private String name;		
	private String password;	
	private boolean role;		
	
	public Login_5_12() {
		
	}
	
	public Login_5_12(String name,String password,boolean role) {
		this.name=name;
		this.password=password;
		this.role=role;
	}
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	
	public boolean getRole(){
		return this.role;
	}
	public void setRole(boolean role){
		this.role = role;
	}
}