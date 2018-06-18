/**
 * 
 */
package com.local.designpatterns.builderpattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * <p> One of the concrete class of home builder
 *  which will make the home with its defined properties. 
 *
 */
public class RuralHomeBuilder extends HomeBuilder {

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#buildWall()
	 */
	@Override
	public void buildWall() {

		LocalPrinter.printer("Build the wall with soil and water.");
		home.setWallType("Soil");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#buildGate()
	 */
	@Override
	public void buildGate() {

		LocalPrinter.printer("Build the wooden carved gate with gods depicted in it.");
		home.setGateType("Carved Wooden");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#paintHouse()
	 */
	@Override
	public void paintHouse() {

		LocalPrinter.printer("Paint the house with cowdung and color mixed in it.");
		home.setHomeColor("Natural Color");
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.builderpattern.HomeBuilder#prepareKitchen()
	 */
	@Override
	public void prepareKitchen() {

		LocalPrinter.printer("Build the gas with soil and bring dry woods.");
		home.setKitchenType("Manual");
	}
	
	@Override
	public Home getHome() {
		return home;
	}

}
