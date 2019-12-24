package com.dotask.ticket;


public class Developer {
	
	private String askDevs;
	
	public String getAskDevs() {
		return askDevs;
	}
	
	public void setAskDevs(String askDevs) {
		this.askDevs = askDevs;
	}
	
	public void print() {
		System.out.println(getAskDevs());
	}
}
