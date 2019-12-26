package com.developement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	
	public static void main(String[] args) {
		Mentor obj1 = new Mentor();
		obj1.setfName("Tendo");
		obj1.setlName("Martin");
		obj1.setBulde("Guide");
		
		Kids obv = new Kids();
		obv.setKidId("reydex");
		obv.setName("Pemission Error");
		obv.setNoOfTasks(10);
		obv.setCountry("India");
		
		Configuration con = new Configuration().configure("myhibernatefile.cfg.xml").addAnnotatedClass(Mentor.class)
		        .addAnnotatedClass(Kids.class);
		SessionFactory sf= con.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(obj1);
		session.save(obv);
		tx.commit();
		session.close();
	}
	
}
