/**
 * 
 */
package com.local.test;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * this class is just to test the hieararchy of 
 * access modifiers.
 *
 */
public class ParentClass {
	
	int j=0;
	
	/**
	 * @param j
	 */
	public ParentClass(int j) {
		this.j = j;
	}

	@Override
	public boolean equals(Object obj) {
		LocalPrinter.printer("true");
		return true;   
	}

	@Override
	public int hashCode() {
		LocalPrinter.printer(super.hashCode());
		LocalPrinter.printer(super.hashCode()%3);
		return super.hashCode()%3;  
	}
	/**
	 * 
	 */
	public ParentClass() {
	}

	protected int methodA() {
		return 0;
	}
	
	@Override
	public String toString() {
		return String.valueOf(j);
	}
	
	
}
