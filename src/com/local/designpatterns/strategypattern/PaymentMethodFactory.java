/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.math.BigInteger;

/**
 * @author gaurav's
 *
 */
public class PaymentMethodFactory {

	public static PaymentMethod getPaymentMethod (String type) {
		
		switch(type) {
			case "cash" : 
				return createCash();
			case "credit" :
				return createCreditCard();
			case "debit" :
				return createDebitCard();
		}
		
		throw new IllegalArgumentException();
	}

	private static PaymentMethod createDebitCard() {

		return new DebitCard("Gaurav", new BigInteger("1234567898765432"), 123, "01/22");
	}

	private static PaymentMethod createCreditCard() {
		return new CreditCard("Aayush", new BigInteger("9876543212345678"), 321, "22/22");
	}

	private static PaymentMethod createCash() {
		return new Cash();
	}
}
