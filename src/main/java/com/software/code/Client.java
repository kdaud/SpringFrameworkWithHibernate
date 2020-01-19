package com.software.code;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name = "client_name")
public class Client {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "client_name")
	private String name;
	
	@Column(name = "client_occupation")
	private String occupation;
	
	@Column(name = "account_balance")
	private double acctbal;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	/**
	 * @return the acctbal
	 */
	public double getAcctbal() {
		return acctbal;
	}
	
	/**
	 * @param acctbal the acctbal to set
	 */
	public void setAcctbal(double acctbal) {
		this.acctbal = acctbal;
	}
	
}
