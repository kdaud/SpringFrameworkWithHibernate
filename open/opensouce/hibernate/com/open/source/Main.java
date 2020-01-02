package com.open.source;


public class Main {
	
	static {
		System.out.println("Advance Java Technology");
	}
	
	public static void main(String[] args) {
		Player obj = new Player(201, "Giggs", "United", 11, "EPL");
		//System.out.println(obj.notifyAll());
		System.out.println(obj.toString());
	}
	
}
