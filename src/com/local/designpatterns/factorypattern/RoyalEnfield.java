/**
 * 
 */
package com.local.designpatterns.factorypattern;

/**
 * @author gaurav's
 * 
 * <p> One of the concrete class of abstract class
 * bike.
 *
 */
public class RoyalEnfield extends Bike {

	
	/**
	 * @param model
	 * @param company
	 * @param totalPrice
	 */
	public RoyalEnfield(String model, String company, double totalPrice) {
		super(model, company, totalPrice);
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.factorypattern.Bike#getModel()
	 */
	@Override
	public String getModel() {

		return model;
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.factorypattern.Bike#getCompanyName()
	 */
	@Override
	public String getCompanyName() {

		return company;
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.factorypattern.Bike#getPrice()
	 */
	@Override
	public double getPrice() {

		return totalPrice;
	}

}
