package com.uneb.ug;

import java.util.Scanner;

public class Login {
	
	private Scanner scan = new Scanner(System.in);
	
	private void show() {
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your password ");
		String pass = scan.nextLine();
		if (name.equals("Admin") && pass.equals("password")) {
			System.out.println("Congratulations for being a mentor 2019");
		}
		else {
			System.out.println("Try again next time");
		}
	}
	
	public static void main(String[] args) {
		new Login().show();
	}
	
}
