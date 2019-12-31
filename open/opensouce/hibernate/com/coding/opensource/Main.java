package com.coding.opensource;


public class Main {
	
	static int grades = 9;
	public static void main(String[] args) {
		System.out.println(grades);
		Student obj = new Student();
		obj.setRollno(12);
		obj.setName("Katende Stephen");
		
		System.out.println(obj.toString());
		
		Student obx = new Student();
		obx.setRollno(14);
		obx.setName("Daud Kakumirizi");
		
		System.out.println(obx.toString());
	}
	
}
