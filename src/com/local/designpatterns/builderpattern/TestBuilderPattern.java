/**
 * 
 */
package com.local.designpatterns.builderpattern;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class TestBuilderPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//For Village People
		HomeBuilder builder = new RuralHomeBuilder();
		Home newHome  = HomeDirector.buildHome(builder);
		LocalPrinter.printer("Home for villagers is : "+ newHome);
		
		//for City People
		builder = new MetroHomeBuilder();
		newHome = HomeDirector.buildHome(builder);
		LocalPrinter.printer("Home for Metro people is : "+newHome);
	}

}