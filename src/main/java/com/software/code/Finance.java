package com.software.code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Finance {
	
	public void showcase() {
		
	}
	
	private void mycode() {
		
	}
	
	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.setName("Equity");
		obj.setOrigin("Kenya");
		
		Bank obh = new Bank();
		obh.setName("Barclays");
		obh.setOrigin("England");
		
		Client obl = new Client();
		obl.setName("Mugoya Robert");
		obl.setOccupation("Teacher");
		obl.setAcctbal(850000.00);
		
		Client obv = new Client();
		obv.setName("Flavia Namuli");
		obv.setOccupation("Burser");
		obv.setAcctbal(550000.00);
		
		Client obn = new Client();
		obn.setName("Opio Denis");
		obn.setOccupation("Business");
		obn.setAcctbal(645000);
		
		Configuration con = new Configuration().configure("programmingjava.xml.cfg.xml").addAnnotatedClass(Bank.class)
		        .addAnnotatedClass(Client.class);
		SessionFactory sessionFactory =con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txc = session.beginTransaction();
		session.save(obj);
		session.save(obh);
		session.save(obl);
		session.save(obv);
		session.save(obn);
		
		txc.commit();
		session.close();		
	}
	
}
