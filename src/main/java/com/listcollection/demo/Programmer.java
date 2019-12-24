package com.listcollection.demo;

import java.util.List;

public class Programmer {
	
	private List programmers;
	
	public void setProgrammers(List programmers) {
		this.programmers = programmers;
	}
	
	public void daycoder() {
		System.out.println("These are the mentors: " + programmers);
	}
	
}
