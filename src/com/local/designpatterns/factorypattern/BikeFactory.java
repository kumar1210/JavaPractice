/**
 * 
 */
package com.local.designpatterns.factorypattern;

/**
 * @author gaurav's
 * <p>
 * A factory class which will return the instance
 * of the object based on the condition defined
 * Here company is the condition based on which the 
 * concrete obj will be returned.
 * 
 * <p>
 * We can define this class as singleton also and then
 * method can be called, or we can declare the object
 * instantiation method as static and call directly, as it
 * is done below.
 * 
 * <p><b> Benefits : </b>
 * <p>1. Factory pattern removes the instantiation of actual 
 *    implementation classes from client code
 * <p>2. provides abstraction between implementation and client
 *  classes through inheritance.
 *
 */
public class BikeFactory {

	
	public static Bike getBikeModel (String model, String company, double price) {
		
		Bike bikeObj = null;
		if(company.equalsIgnoreCase("Bajaj")) {
			bikeObj = new Bajaj(model, company, price);
		} else if(company.equalsIgnoreCase("Royal Enfield")) {
			bikeObj = new RoyalEnfield(model, company, price);
		}
		return bikeObj;
	}
}
