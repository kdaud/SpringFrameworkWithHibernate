package com.coding.opensource;


public class MainTest {
	
	public MainTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		new Goods().calls();
		new Goods().coding();
		Error obj = new Error();
		obj.fillInStackTrace();
		try {
			method();
		}
		catch (Exception e) {
			// TODO Auto-generated e.printStackTrace();
			System.out.println(e);
		}
	}
	
	public static void method() throws Exception {
		int[] marks = { 4, 5, 2, 7, 9 };
		for (int i = 0; i < 6; i++) {
			System.out.println(marks[i]);
		}
	}
	
}
