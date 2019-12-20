package com.codingjava.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Coding.xml");
		Mentors mentors = (Mentors) context.getBean("technology");
		mentors.mentors();
	}
	
}
