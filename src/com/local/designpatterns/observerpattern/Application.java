/**
 * 
 */
package com.local.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author gaurav's
 *
 */
public class Application extends Observable {
	
	private String name;
	private boolean isRunning;
	private List<Observer> observers;
	
	
	/**
	 * @param name
	 * @param isRunning
	 */
	public Application(String name, boolean isRunning) {
		this.name = name;
		this.isRunning = isRunning;
		observers = new ArrayList<Observer>();
	}
	
	public void addListObserver(Observer obs) {
		observers.add(obs);
		addObserver(obs);
	}
	
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}
	
	/**
	 * @param isRunning the isRunning to set
	 */
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
		if(isRunning) {
			setChanged();
			notifyObservers();
		}
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the isRunning
	 */
	public boolean isRunning() {
		return isRunning;
	}
	
	public String toString() {
		return name;
	}

}
