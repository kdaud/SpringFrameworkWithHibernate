package com.developement;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mentor {
	
	@Id
	@GeneratedValue
	private int mentorId;
	
	private String fName;
	
	private String lName;
	
	private String bulde;
	
	private List<Kids> kids;
	
	/**
	 * @return the kids
	 */
	public List<Kids> getKids() {
		return kids;
	}
	
	/**
	 * @param kids the kids to set
	 */
	public void setKids(List<Kids> kids) {
		this.kids = kids;
	}
	
	/**
	 * @return the mentorId
	 */
	public int getMentorId() {
		return mentorId;
	}
	
	/**
	 * @param mentorId the mentorId to set
	 */
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	/**
	 * @return the bulde
	 */
	public String getBulde() {
		return bulde;
	}
	
	/**
	 * @param bulde the bulde to set
	 */
	public void setBulde(String bulde) {
		this.bulde = bulde;
	}
	
}
