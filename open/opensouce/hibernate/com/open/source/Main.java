package com.open.source;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	static {
		System.out.println("Advance Java Technology");
	}
	
	public static void main(String[] args) {
		Player obj = new Player();
		

		Configuration con = new Configuration().configure("myconfigurationfile.cfg.xml").addAnnotatedClass(Player.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		obj = session.get(Player.class, 5);
		tx.commit();
		session.close();
		System.out.println(obj);
	}
	
}
