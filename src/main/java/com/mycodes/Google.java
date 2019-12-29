package com.mycodes;


public class Google implements Coder {
	
	public static void main(String[] args) {
		System.out.println("HELLO JUNIOR PROGRAMMER".toLowerCase());
		new Google().show();
		Mentor mentor = new Mentor();
		mentor.setLanguage("Java");
		System.out.println(mentor.toString());
	}
	

	public void show() {
		System.out.println(name);
	}
	
}
