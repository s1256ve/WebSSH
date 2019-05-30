package com.dao;

public class America_5_19 implements Person_5_19{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void show() {
		System.out.println("America name:"+name+"\tage:"+age);
		
	}
}
