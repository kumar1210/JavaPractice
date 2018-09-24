/**
 * 
 */
package com.local.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class Product implements Subject {
	
	private List<Observer> observersList;
	private String productName;
	private boolean availability;
	
	public Product () {
		
		observersList = new ArrayList<Observer>();
	}

	/**
	 * @param productName
	 * @param availability
	 */
	public Product(String productName, boolean availability) {
		observersList = new ArrayList<Observer>();
		this.productName = productName;
		this.availability = availability;
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.observerpattern.Subject#addObserver(com.local.designpatterns.observerpattern.Observer)
	 */
	@Override
	public void addObserver(Observer observer) {

		observersList.add(observer);
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.observerpattern.Subject#removeObserver(com.local.designpatterns.observerpattern.Observer)
	 */
	@Override
	public void removeObserver(Observer observer) {

		observersList.remove(observer);
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.observerpattern.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {

		LocalPrinter.printer("Notifying all the Subscribed users about the avaibility of the product.");
		for(Observer observer : observersList) {
			observer.updateObserver();
		}
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the availability
	 */
	public boolean isAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
		if(availability == true) {
			notifyObservers();
		}
	}

}
