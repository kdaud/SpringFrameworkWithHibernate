/**
 * 
 */
package com.dotask.ticket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admins
 *
 */
public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Core.xml");
		Developer developer = (Developer) context.getBean("software");
		developer.print();
		
	}
	
}
