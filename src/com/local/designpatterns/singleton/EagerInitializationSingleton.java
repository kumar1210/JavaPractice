/**
 * 
 */
package com.local.designpatterns.singleton;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * <p> for a class being a singleton, it should have 
 * 		1) private constructor
 * 		2) static field
 * 		3) a static getter or method to get the instance.
 *
 */
public class EagerInitializationSingleton {

	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {
		
	}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
	
	public void testMethod() {
		LocalPrinter.printer("hello dum-dum");
	}
}
