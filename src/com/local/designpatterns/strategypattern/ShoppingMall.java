/**
 * 
 */
package com.local.designpatterns.strategypattern;

/**
 * @author gaurav's
 *
 */
public class ShoppingMall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Customer cashCustomer = new Customer("cash");
		cashCustomer.addItem(new Product("Milk", 45));
		cashCustomer.addItem(new Product("Juice", 99.99));
		cashCustomer.pay();
		
		Customer creditCardCustomer = new Customer("credit");
		creditCardCustomer.addItem(new Product("Juice", 99.99));
		creditCardCustomer.addItem(new Product("Milk", 45));
		creditCardCustomer.pay();
		
		Customer debitCardCustomer = new Customer("debit");
		debitCardCustomer.addItem(new Product("Juice", 99.99));
		debitCardCustomer.addItem(new Product("Milk", 45));
		debitCardCustomer.pay();
		
		/*Customer randomCardCustomer = new Customer("random");
		randomCardCustomer.addItem(new Product("Juice", 99.99));
		randomCardCustomer.addItem(new Product("Milk", 45));
		randomCardCustomer.pay();*/
		
	}

}
