package com.listcollection.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OpenMRS {
	
	public static void main(String[] args) {
		ApplicationContext coders = new ClassPathXmlApplicationContext("Junior.xml");
		Programmer programmer = (Programmer) coders.getBean("lunchon");
		programmer.daycoder();
	}
}
