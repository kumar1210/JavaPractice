/**
 * 
 */
package com.local.functional;

/**
 * @author gaurav's
 *
 */

@FunctionalInterface
public interface Chemical {

	public void operation(String ...name);
	
	default void print() {
		System.out.println("Chemical Default Method");
	}
	
	static int makeSolution() {
		System.out.println("Chemical Solution has been processing");
		return 0;
	}
}
