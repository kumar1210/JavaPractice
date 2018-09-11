/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.text.MessageFormat;

/**
 * @author gaurav's
 *
 */
public class Product {
	
	private String name;
	private double price;
	
	
	/**
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString() {
		return MessageFormat.format("Product Name : {0}, Price : {1}", name, price);
	}

}
