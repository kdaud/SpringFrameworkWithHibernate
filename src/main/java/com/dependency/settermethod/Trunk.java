package com.dependency.settermethod;


public class Trunk {
	
	Devs devs;
	
	public void setDevs(Devs devs) {
		this.devs = devs;
	}
	
	public void openMRS() {
		devs.members();
	}
	
}
