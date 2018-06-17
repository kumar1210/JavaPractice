/**
 * 
 */
package com.local.designpatterns.singleton;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * this singleton is lazy because it will create the instance only when 
 * it is required. But it is not thread safe.
 *
 */
public class LazySingleton {

	private static LazySingleton instance;
	
	private LazySingleton () {
		
	}
	
	public static LazySingleton getInstance() {
		if (instance ==null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public void testMethod() {
		LocalPrinter.printer(" bye bye humpty dumpty");
	}
}
