/**
 * 
 */
package com.local.designpatterns.builderpattern;

/**
 * @author gaurav's
 * 
 * <p> The client facing class, which will accept the
 *  particular builder to build the respective type of 
 *  home.
 *
 */
public class HomeDirector {
	
	public static Home buildHome(HomeBuilder builder) {
		builder.buildWall();
		builder.buildGate();
		builder.prepareKitchen();
		builder.paintHouse();
		return builder.getHome();
	}

}
