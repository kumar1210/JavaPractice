/**
 * 
 */
package com.local.designpatterns.observerpattern;

import java.util.Observable;
import java.util.Observer;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class Monitor implements Observer {
	
	private String name;
	
	/**
	 * @param name
	 */
	public Monitor(String name) {
		this.name = name;
	}



	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {

		LocalPrinter.printer(name +" of "+ o.toString()+"  is started.");
	}

}
