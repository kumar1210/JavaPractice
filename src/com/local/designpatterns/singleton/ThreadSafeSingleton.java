/**
 * 
 */
package com.local.designpatterns.singleton;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 ** <p> for a class being a singleton, it should have 
 * 		1) private constructor
 * 		2) static field
 * 		3) a static getter or method to get the instance.
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton () {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance () {
		if(instance ==null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public void testMethod () {
		LocalPrinter.printer("hi dum-dum");
	}
}
