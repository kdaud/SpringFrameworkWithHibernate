package com.caching.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Church {
	
	public static void main(String[] args) {
		Servants obj1 = new Servants();
		obj1.setName("Sr. Deborah");
		obj1.setDepartment("Sabbath School");
		obj1.setRole("Ass. Sabbath School Cordinator");
		
		Servants obj2 = new Servants();
		obj2.setName("James");
		obj2.setDepartment("Treasury");
		obj2.setRole("Accountant");
		
		Servants obj3 = new Servants();
		obj3.setName("Dr Annyona");
		obj3.setDepartment("Elders");
		obj3.setRole("First Elder");
		
		Servants obj4=new Servants();
		obj4.setName("Pr Aaron Turyomurugyendo");
		obj4.setDepartment("Elders");
		obj4.setRole("Second Elder");
		
		Configuration con = new Configuration().configure("hibernates.cfg.xml").addAnnotatedClass(Servants.class);
		SessionFactory sf= con.buildSessionFactory();
		Session session =sf.openSession();
		session.beginTransaction();
		session.save(obj1);
		session.save(obj2);
		session.save(obj3);
		session.save(obj4);
		session.getTransaction().commit();
	}
	
}
