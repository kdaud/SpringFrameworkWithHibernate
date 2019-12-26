package com.developement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kids {
	
	@Id
	private String kidId;
	
	private String name;
	
	private int noOfTasks;
	
	private String country;
	
	@ManyToOne
	private Mentor mentor;
	
	/**
	 * @return the mentor
	 */
	public Mentor getMentor() {
		return mentor;
	}
	
	/**
	 * @param mentor the mentor to set
	 */
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	/**
	 * @return the kidId
	 */
	public String getKidId() {
		return kidId;
	}
	
	/**
	 * @param kidId the kidId to set
	 */
	public void setKidId(String kidId) {
		this.kidId = kidId;
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
	 * @return the noOfTasks
	 */
	public int getNoOfTasks() {
		return noOfTasks;
	}
	
	/**
	 * @param noOfTasks the noOfTasks to set
	 */
	public void setNoOfTasks(int noOfTasks) {
		this.noOfTasks = noOfTasks;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kids [kidId=" + kidId + ", name=" + name + ", noOfTasks=" + noOfTasks + ", country=" + country + ", mentor="
		        + mentor + "]";
	}
	
}
