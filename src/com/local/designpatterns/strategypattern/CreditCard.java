/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.math.BigInteger;

/**
 * @author gaurav's
 *
 */
public class CreditCard extends Card {
	

	public CreditCard(String cardHolderName, BigInteger cardNo, int cVV, String expiryDate) {
		super(cardHolderName, cardNo, cVV, expiryDate);
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.strategypattern.Card#getType()
	 */
	@Override
	public String getType() {
		return "Credit";
	}

}
