package com.software.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatecodes.cfg.xml");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.persist(obh);
		entityManager.persist(obl);
		entityManager.persist(obv);
		entityManager.persist(obn);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	
}
