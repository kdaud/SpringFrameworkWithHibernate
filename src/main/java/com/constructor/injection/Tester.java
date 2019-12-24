package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Designing.xml");
		Guide guide = (Guide) context.getBean("approvals");
		guide.coding();
	}
	
}
