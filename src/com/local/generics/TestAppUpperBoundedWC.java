/**
 * 
 */
package com.local.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gaurav's
 * 
 * <p> Upper Bounded WildCard = ? extends T
 * <p> Lower Bounded WildCart = ? super T
 * <p> As Collection<String> cannot be typecasted to Collection<Object>, 
 * 	   since String is subclass of Object, not Collection<String> is of 
 * 	   Collection<Object>
 *
 */
public class TestAppUpperBoundedWC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		sum(Arrays.asList(1,2,3,4));
		List<Double> list1 = new ArrayList<>();
		list1.add(1.1);
		list1.add(2.2);
		list1.add(3.3);
		list1.add(4.4);
		//sum(Arrays.asList(1.1, 2.2, 3.3, 4.4));
		sum(list1);
		List<Serializable> list = new ArrayList<>();
		list.add("hello");
		list.add("hi");
		sum1(list);
		
	}
	
	
	/****
	 *  this method can be called by passing the list of 
	 *  subclasses of Number.
	 * @param list
	 */
	public static void sum(List<? extends Number> list) {
		
		double sum = 0.0;
		for(Number num: list) {
			sum += num.doubleValue();
		}
		
		// won't be able to add, as Integer is subclass of integer and 
		//there is no guarantee that list can be of Integer or Float or
		//any other.
		//list.add(new Integer(5));
		
		System.out.println("Upper Bounded Total Sum is : "+sum);
		System.out.println(list);
	}

	/***
	 * Lower bound examples.
	 * @param list
	 */
	public static void sum1(List<? super Number> list)  {
		
		// here addition of objects are allowed.
		// since the list will be passed of the super class of Number
		// and any subclass object can be added to the superclass list.
		list.add(new Integer(5));
		System.out.println("Lower Bound");
		System.out.println(list);
				
	}
}
