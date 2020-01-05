package com.restapi.amlearning;


public class Main {
	
	static {
		System.out.println("You are almost there in programming");
	}
	
	public static void main(String[] args) {
		new Rest("Am learning Rest Api Technology and am eyeing at GSoC 2020".toUpperCase());
		dopost(3, 7);
	}
	
	public static void dopost(int c, int h) {
		int gg = 2 * (c + h);
		System.out.println(gg);
	}
	
}
