package com.constructor.injection;


public class Guide {
	
	Coder coder;
	
	/**
	 * @param coder
	 */
	public Guide(Coder coder) {
		super();
		this.coder = coder;
	}
	
	public void coding() {
		coder.contest();
	}
	
}
