/**
 * 
 */
package com.coding.opensource;

/**
 * @author admins
 *
 */
public interface GF extends VF {
	
	public void calls();
	
	default void mycall() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World in Java");
		}
	}

}
