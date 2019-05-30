package org.model;

import java.io.Serializable;
import java.util.Date;

public class Student_5_12 implements Serializable{
	private Integer id;	
	
	private String readId;
	private String name;
	private String spec;
	private boolean sex;
	private Date born;
	private int num;
	private int snum;
	
	
	public Student_5_12() {
		
	}
	
	public Student_5_12(String readId, String name, String spec, boolean sex, Date born, int num,
			int snum) {
		
		
		this.readId = readId;
		this.name = name;
		this.spec = spec;
		this.sex = sex;
		this.born = born;
		this.num = num;
		this.snum = snum;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getReadId(){
		return this.readId;
	}
	public void setReadId(String readId){
		this.readId = readId;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getSpec(){
		return this.spec;
	}
	public void setSpec(String spec){
		this.spec = spec;
	}
	
	public boolean getSex(){
		return this.sex;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	
	public Date getBorn(){
		return this.born;
	}
	public void setBorn(Date born){
		this.born = born;
	}
	
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num = num;
	}
	
	public int getSnum(){
		return this.snum;
	}
	public void setSnum(int snum){
		this.snum = snum;
	}
	
	
}