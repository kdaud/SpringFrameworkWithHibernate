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
		new MyCodes().mycall();
		new MyCodes().calls();
		String[] names = { "Ivan", "Kate", "Olivia", "Florence" };
		methods(names);
	}
	public void mycall() {
		char [] data = {'D','A','U','D'};
		for (char cc : data) {
			System.out.println(cc);
		}
		String obj = new String(data);
		System.out.println(obj);
		
	}
	
	protected void calls() {
	String [] students= {"Gama","Godfrey","Duku","Fred"};
		for (String ss : students) {
			System.out.println(ss);
		}
		System.out.println("Origin For loop");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	
	}
	
	private static void methods(String[] teachers) {
		teachers[3] = "Kinene";
		teachers[2] = "Joseph";
		teachers[0] = "Jeremiah";
		teachers[1] = "Nyantika";
		for (String ss : teachers) {
			System.out.println(ss);
			
		}
		
	}
	
	void goods() {
		System.out.println("Hello World");
	}
}
