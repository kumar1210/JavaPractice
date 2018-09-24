/**
 * 
 */
package com.local.designpatterns.observerpattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class Customer implements Observer {
	
	private String name;

	/**
	 * @param name
	 */
	public Customer(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.observerpattern.Observer#updateObserver()
	 */
	@Override
	public void updateObserver() {

		LocalPrinter.printer("Hi "+getName()+", product is available now. ");
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

}
