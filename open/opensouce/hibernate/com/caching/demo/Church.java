package com.caching.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Church {
	
	public static void main(String[] args) {
		Servants obj1 = new Servants();
		
		
		
		Configuration con = new Configuration().configure("hibernates.cfg.xml").addAnnotatedClass(Servants.class);
		SessionFactory sf= con.buildSessionFactory();
		Session session =sf.openSession();
		
		session.beginTransaction();
		obj1 = session.get(Servants.class, 3);
		System.out.println(obj1);
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		obj1 = session2.get(Servants.class, 3);
		System.out.println(obj1);
		session2.getTransaction().commit();
		session2.close();
		
	}
	
}
