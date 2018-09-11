/**
 * 
 */
package com.local.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author gaurav's
 *
 *		Type						    | Syntax				   | Method Reference	| Lambda expression
	1. Reference to a static method	    | Class::staticMethod	   | String::valueOf	| s -> String.valueOf(s)
	2. Reference to an instance method
       of a particular object	        | instance::instanceMethod | s:toString	        | () -> “string”.toString()
	3. Reference to an instance method
	   of an arbitrary object of a 
	   particular type					| Class:instanceMethod	   | String::toString	| s -> s.toString()
	4. Reference to a constructor	    | Class::new			   | String::new	    | () -> new String()
 */
public class MethodReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		staticMethodReferenceExample(list);
		
		instanceMethodReferenceExample(list);
		
	}
	

	private static void staticMethodReferenceExample(List<Integer> list) {
		
		
		System.out.print("Print with static method reference : ");
		list.forEach(MethodReferenceTest::staticPrint);
		
		System.out.print("\nPrint with lambda Expression : ");
		list.forEach(action -> MethodReferenceTest.staticPrint(action));
		
		System.out.print("\nPrint with normal 'for' loop : ");
		for (Integer integer : list) {
			staticPrint(integer);
		}
		
	}

	
	private static void instanceMethodReferenceExample(List<Integer> list) {
		
		CustomComparator comparator = new CustomComparator();
		System.out.print("\n\nPrint with instance Method Reference : ");
		list.sort(comparator::dummyCompare);
		list.forEach(MethodReferenceTest::staticPrint);
		
		Collections.sort(list, comparator::dummyCompare);
		System.out.println();
		list.forEach(System.out::print);
	}
	
	
	
	private static void staticPrint(int num) {
		
		if(num!=10)
			System.out.print(num+"-");
		else 
			System.out.print(num);
	}

}

class CustomComparator{
    public int dummyCompare(final Integer a, final Integer b) {
        return b.compareTo(a);
    }
    
    // just to check
    public void print() {
    	System.out.println("hello");
    }
}
