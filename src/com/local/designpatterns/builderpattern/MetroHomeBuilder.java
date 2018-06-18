/**
 * 
 */
package com.local.designpatterns.builderpattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * <p> One of the concrete class of home builder
 *  which will make the home with its defined properties. 
 *
 */
public class MetroHomeBuilder extends HomeBuilder {

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#buildWall()
	 */
	@Override
	public void buildWall() {

		LocalPrinter.printer("Prepare Walls with the bricks and cement");
		home.setWallType("Cemented");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#buildGate()
	 */
	@Override
	public void buildGate() {

		LocalPrinter.printer("Prepare Iron Gate for more Security");
		home.setGateType("Iron");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#paintHouse()
	 */
	@Override
	public void paintHouse() {

		LocalPrinter.printer("Paint house with the Merolac and artificial colours");
		home.setHomeColor("Artificial Color");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#prepareKitchen()
	 */
	@Override
	public void prepareKitchen() {

		LocalPrinter.printer("Built the fancy kitchen with microwave, automatic gas, etc.");
		home.setKitchenType("Automatic");
	}

	@Override
	public Home getHome() {
		return home;
	}

}
