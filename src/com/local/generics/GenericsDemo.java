package com.local.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	

	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		
		for (Number number : list) {
			System.out.println(number);
		}
		
		nonGenericmethod1((List)list);
		genericMethod1(list);
	}

	/***
	 * 
	 * @param list
	 */
	public static void nonGenericmethod1(List<Number> list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}
	/***
	 * wildcard upper bound example
	 * @param list
	 */
	public static void genericMethod1(List<? extends Number> list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}
}
