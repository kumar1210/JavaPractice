/**
 * 
 */
package com.local.xmlparsers.dom;

/**
 * @author gaurav's
 *
 */
public class Student {

	private String name;
	
	

	/**
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
