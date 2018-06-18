/**
 * 
 */
package com.local.designpatterns.factorypattern;

/**
 * @author gaurav's
 * 
 * An abstract class or the base class
 * it can be an interface or a normal class as well,
 * here i have used an abstract class.
 *
 */
public abstract class Bike {

	protected String model;
	protected String company;
	protected double totalPrice;
	
	/**
	 * @param model
	 * @param company
	 * @param totalPrice
	 */
	public Bike(String model, String company, double totalPrice) {
		this.model = model;
		this.company = company;
		this.totalPrice = totalPrice;
	}
	
	public abstract String getModel();
	
	public abstract String getCompanyName();
	
	public abstract double getPrice();
	
	@Override
	public String toString() {
		return "Company Name: "+getCompanyName() +" Model : "+getModel() +" Price : "+getPrice();
	}
}
