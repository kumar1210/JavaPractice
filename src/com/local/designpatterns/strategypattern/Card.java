/**
 * 
 */
package com.local.designpatterns.strategypattern;

import java.math.BigInteger;
import java.text.MessageFormat;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public abstract class Card implements PaymentMethod {
	
	private String cardHolderName;
	private BigInteger cardNo;
	private int cVV;
	private String expiryDate;

	/**
	 * @param cardHolderName
	 * @param cardNo
	 * @param cVV
	 * @param expiryDate
	 */
	public Card(String cardHolderName, BigInteger cardNo, int cVV, String expiryDate) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.cVV = cVV;
		this.expiryDate = expiryDate;
	}

	/* (non-Javadoc)
	 * @see com.local.designpatterns.strategypattern.PaymentMethod#pay(double)
	 */
	@Override
	public void pay(double amount) {
		
		LocalPrinter.printer("Total Amount paid is "+ amount +" through "+getType()+" card");
		LocalPrinter.printer(MessageFormat.format("{0} Card details are : [Name = {1}, CardNo. = {2}, CVV = {3}, ExpiryDate = {4}]", getType(), cardHolderName, cardNo, cVV, expiryDate));
	}
	
	public abstract String getType();

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @return the cardNo
	 */
	public BigInteger getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(BigInteger cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @return the cVV
	 */
	public int getcVV() {
		return cVV;
	}

	/**
	 * @param cVV the cVV to set
	 */
	public void setcVV(int cVV) {
		this.cVV = cVV;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
