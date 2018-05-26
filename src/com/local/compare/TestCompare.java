/**
 * 
 */
package com.local.compare;

import java.util.Arrays;

/**
 * @author gaurav's
 *
 */
public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ComparableEmployee[] empArr = new ComparableEmployee[4];
		empArr[0] = new ComparableEmployee(10, "Mikey", 10000);
		empArr[1] = new ComparableEmployee(20, "Arun", 20000);
		empArr[2] = new ComparableEmployee(5, "Lisa", 5000);
		empArr[3] = new ComparableEmployee(1, "Pankaj", 50000);
		Arrays.sort(empArr);
		System.out.println("Sorted Array with comparable : " + Arrays.toString(empArr));
		Arrays.sort(empArr, empArr[0].conditionalComp);
		System.out.println("Sorted Array with comparator : " + Arrays.toString(empArr));
	}

}
