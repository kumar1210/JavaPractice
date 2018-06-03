package com.local.test;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {

		//demoVarArgsMethod(1,2,3,4);
		
		testHashMethod();
	}
	
	private static void testHashMethod() {
		
		Integer h =100, key =2;
		int n = (h = key.hashCode()) ^ (h >>> 8);
	    h = (key == null) ? 0 : n;
	    System.out.println(h);
	    HashMap<String, String> map = new HashMap<>();
	    System.out.println(map.put("t1", "V1"));
	    System.out.println(map.put("t1", "V2"));
	    System.out.println(map.get("t3"));
	}
		

	/****
	 * varargs works as an array, but should not be considered as a 
	 * replacement of that.
	 * 
	 * method with varargs, should not be overloaded. 
	 * it gets compile successfully, but while using it compiler
	 * might get confused. like the below two methods
	 * @param is
	 */
	public static void demoVarArgsMethod(int ...is ) {
		
		System.out.println(Arrays.toString(is));
	}
	
	public static void demoVarArgsMethod(int i, int ...js) {
		System.out.println(Arrays.toString(js));
	}

}
