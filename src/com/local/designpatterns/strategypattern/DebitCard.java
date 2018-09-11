/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.math.BigInteger;

/**
 * @author gaurav's
 *
 */
public class DebitCard extends Card {

	/***
	 * 
	 * @param cardHolderName
	 * @param cardNo
	 * @param cVV
	 * @param expiryDate
	 */
	public DebitCard(String cardHolderName, BigInteger cardNo, int cVV, String expiryDate) {
		super(cardHolderName, cardNo, cVV, expiryDate);
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.strategypattern.Card#getType()
	 */
	@Override
	public String getType() {
		return "Debit";
	}

}
