/**
 * 
 */
package com.local.functional;

/**
 * @author gaurav's
 *
 */
public abstract class FunctionalIntefaceTest implements  MatheMatical, Chemical{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i =1;
		System.out.println("i = "+i);
		int j = ~i;
		System.out.println("j = "+j);

	}

	//@Override
	public void print() {
		//MatheMatical.super.print();
	}

}
