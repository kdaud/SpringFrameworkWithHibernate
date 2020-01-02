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
		Player obj = new Player(201, "Giggs", "United", 11, "EPL");
		//System.out.println(obj.notifyAll());
		System.out.println(obj.toString());
		Configuration con = new Configuration().configure("myconfigurationfile.cfg.xml").addAnnotatedClass(Player.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		session.close();
	}
	
}
