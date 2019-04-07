package com.springioc.autowire.byName.annotationConfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.autowire.byName.annotationConfig.beans.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getCar().getName());
	}

}
