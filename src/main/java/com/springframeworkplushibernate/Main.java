package com.springframeworkplushibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	static {
		System.out.println("KAKUMIRIZI DAUD a Junior Software Engineer");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restorant restorant = (Restorant) context.getBean("programming");
		restorant.greatMentors();
		
	}
	
}
