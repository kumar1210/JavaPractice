/**
 * 
 */
package com.local.designpatterns.observerpattern;

/**
 * @author gaurav's
 * 
 * 
 *
 */
public interface Subject {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
