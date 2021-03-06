package com.software.code;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name = "bank_name")
public class Bank {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String origin;
	
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
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello WOrld from Daud an Open Sourcer");
	}
}
