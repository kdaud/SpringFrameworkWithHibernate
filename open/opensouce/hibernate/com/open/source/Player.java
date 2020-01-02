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
	
	//	public Player(int pId, String name, String club, int number, String league) {
	//		super();
	//		this.pId = pId;
	//		this.name = name;
	//		this.club = club;
	//		this.number = number;
	//		this.league = league;
	//	}
	
	/**
	 * @return the pId
	 */
	//	public int getpId() {
	//		return pId;
	//	}
	//	
	//	/**
	//	 * @return the name
	//	 */
	//	public String getName() {
	//		return name;
	//	}
	//	
	//	/**
	//	 * @return the club
	//	 */
	//	public String getClub() {
	//		return club;
	//	}
	//	
	//	/**
	//	 * @return the number
	//	 */
	//	public int getNumber() {
	//		return number;
	//	}
	//	
	//	/**
	//	 * @return the league
	//	 */
	//	public String getLeague() {
	//		return league;
	//	}
	//
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [pId=" + pId + ", name=" + name + ", club=" + club + ", number=" + number + ", league=" + league
		        + "]";
	}
	
}
