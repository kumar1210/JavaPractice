/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.util.ArrayList;
import java.util.List;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class Customer {
	
	private List<Product> items = new ArrayList<>();
	private String paymentType;

	/**
	 * @param paymentType
	 */
	public Customer(String paymentType) {
		super();
		this.paymentType = paymentType;
	}

	public void addItem(Product item) {
		items.add(item);
	}
	
	public void removeItem(Product item) {
		items.remove(item);
	}
	
	public double totalAmount() {
		
		return items.stream().mapToDouble(item -> item.getPrice()).sum();
	}
	
	public void pay() {
		
		PaymentMethod payMethod = PaymentMethodFactory.getPaymentMethod(paymentType);
		// can also use the reflection method factory.
		LocalPrinter.printer("Items list are : "+items);
		payMethod.pay(totalAmount());
	}
	
	/**
	 * @return the items
	 */
	public List<Product> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Product> items) {
		this.items = items;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}
