/**
 * 
 */
package com.local.designpatterns.singleton;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 * this singleton is also another form of eager initialization,as the initialization is happening
 * inside a static block. also not thread safe.
 */
public class SingletonWithStatic {
	
	private static SingletonWithStatic instance; 
	
	static {
		instance = new SingletonWithStatic();
	}
	
	private SingletonWithStatic() {
		
	}

	public static SingletonWithStatic getInstance() {
		return instance;
	}
	
	public void testMethod() {
		LocalPrinter.printer("hello humpty dumpty");
	}
	
}
