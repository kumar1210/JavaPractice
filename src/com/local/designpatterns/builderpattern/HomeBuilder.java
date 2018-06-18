/**
 * 
 */
package com.local.designpatterns.builderpattern;

/**
 * @author gaurav's
 *
 */

/***
 * 
 * @author gaurav's
 *
 * <p> An abstract class which helps the building
 *  in complex object, consider the method as a setter
 *  methods of an instances.
 */
public abstract class HomeBuilder {

	Home home = new Home();
	public abstract void buildWall();
	public abstract void buildGate();
	public abstract void paintHouse();
	public abstract void prepareKitchen();
	public abstract Home getHome();
}
