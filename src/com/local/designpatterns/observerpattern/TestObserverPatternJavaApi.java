/**
 * 
 */
package com.local.designpatterns.observerpattern;

/**
 * @author gaurav's
 *
 */
public class TestObserverPatternJavaApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Application app1 = new Application("Local Application", false);
		
		Monitor itrs = new Monitor("ITRS Monitoring");
		Monitor google = new Monitor("Google Monitoring");
		// use custom method to add observers or we can add directly addObserver()
		app1.addListObserver(google);
		app1.addListObserver(itrs);
		app1.setRunning(true);
	}

}
