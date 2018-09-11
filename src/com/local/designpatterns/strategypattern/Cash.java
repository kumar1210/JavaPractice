/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.text.MessageFormat;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class Cash implements PaymentMethod {

	/* (non-Javadoc)
	 * @see com.local.designpatterns.strategypattern.PaymentMethod#pay(double)
	 */
	@Override
	public void pay(double amount) {

		LocalPrinter.printer(MessageFormat.format("Paid {0} amount using cash", amount));
	}

}
