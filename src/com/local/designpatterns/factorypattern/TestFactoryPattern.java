/**
 * 
 */
package com.local.designpatterns.factorypattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * Client side code to test the factory pattern
 *
 */
public class TestFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bike enfieldBike = BikeFactory.getBikeModel("350X", "Royal Enfield", 175000);
		Bike bajajBike   = BikeFactory.getBikeModel("Pulsar 150", "Bajaj", 85000);
		LocalPrinter.printer(enfieldBike);
		LocalPrinter.printer(bajajBike);
		LocalPrinter.printer(enfieldBike.model); //here i can access the variable because of protected and all class are in same folder.
		LocalPrinter.printer(bajajBike.getModel());
	}

}
