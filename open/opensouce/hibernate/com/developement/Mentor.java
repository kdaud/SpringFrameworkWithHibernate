package com.developement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mentor {
	
	@Id
	private int mentorId;
	
	private String fName;
	
	private String lName;
	
	private String bulde;
	
	@OneToMany(mappedBy = "mentor")
	private List<Kids> kids = new ArrayList<Kids>();
	
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", fName=" + fName + ", lName=" + lName + ", bulde=" + bulde + ", kids="
		        + kids + "]";
	}
	
}
