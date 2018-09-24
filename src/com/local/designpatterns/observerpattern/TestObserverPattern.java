/**
 * 
 */
package com.local.designpatterns.observerpattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class TestObserverPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Customer customer1 = new Customer("Gaurav");
		Customer customer2 = new Customer("Momota");
		
		Product badmintonRacket = new Product("Li Ning Racket", false);
		badmintonRacket.addObserver(customer1);
		badmintonRacket.addObserver(customer2);
		LocalPrinter.printer("Current avaibility of the product "+ badmintonRacket.getProductName() + " is : "+badmintonRacket.isAvailability());
		LocalPrinter.printer("Current avaibility of the product "+ badmintonRacket.getProductName() + " is changed to available. ");
		badmintonRacket.setAvailability(true);
	}

}
