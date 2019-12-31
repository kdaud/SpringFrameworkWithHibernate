package com.logging.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Facebook {
	
	private static final Logger LOGGER = Logger.getLogger(Facebook.class.getName());
	
	public static void main(String[] args) {
		LOGGER.setLevel(Level.INFO);
		LOGGER.info("Am here coding");
		
		System.out.println("Logging in progress");
		LOGGER.warning("Java Programming");
		
		System.out.println("Logging in progress");
		LOGGER.fine("Coding is really sweet");
		
		System.out.println("Logging in progress");
		LOGGER.finest("Coding is nice");
		
		System.out.println("Logging in progress");
		LOGGER.config("Coding is really sweet");

	}
}
