package com.dependency.settermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quality {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Seniordevs.xml");
		Trunk trunk = (Trunk) context.getBean("upgradedevs");
		trunk.openMRS();
		
	}
	
}
