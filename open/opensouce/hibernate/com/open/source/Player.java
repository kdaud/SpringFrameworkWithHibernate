package com.open.source;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private int pId;
	
	private String name;
	
	private String club;
	
	private int number;
	
	private String league;
	
	public Player(int pId, String name, String club, int number, String league) {
		super();
		this.pId = pId;
		this.name = name;
		this.club = club;
		this.number = number;
		this.league = league;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [pId=" + pId + ", name=" + name + ", club=" + club + ", number=" + number + ", league=" + league
		        + "]";
	}
	
}
