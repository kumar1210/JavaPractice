/**
 * 
 */
package com.local.generics;

import java.io.Serializable;

/**
 * @author gaurav's
 *
 */
public class TestAppGenericTypeInference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer input1 = 5;
		String input2 = "Hello";
		//GenericsDemo input3 = new GenericsDemo();
		//type witness , telling the compiler that the particular type in diamond i.e. <type>
		Serializable obj = TestAppGenericTypeInference.<Serializable>checkTypeInference(input1, input2);
		
		//compiler will automatically infer the type inference based on call.
		Comparable<?> obj1 = TestAppGenericTypeInference.checkTypeInference(input1, input2);
		
		//Serializable obj = checkTypeInference(input1, input3); try it.
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
	}
	
	/***
	 * the inference algorithm plays an important role here
	 * which decides based on the declaration and the arguments passed.
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static <T> T checkTypeInference(T input1, T input2) {
		return input2;
	}

}
