package com.mycodes;


public class MyCodes {
	
	public void showcodes(int age) {
		System.out.println("Age is " + age);
	}
	
	public static void codes(int[] marks) {
		System.out.println("Firts Element is " + marks[0]);
		marks[0] = 30;
		System.out.println("Firts Element is " + marks[0]);
		
	}
	
	public static void main(String[] args) {
		int year = 40;
		new MyCodes().showcodes(year);
		int[] grades = { 12, 25, 64 };
		codes(grades);
	}
	
}
