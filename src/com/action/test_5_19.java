package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Person_5_19;

public class test_5_19 {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person_5_19 c=(Person_5_19) app.getBean("chinese");
		Person_5_19 a=(Person_5_19) app.getBean("america");
		c.show();
		a.show();
	}
}
