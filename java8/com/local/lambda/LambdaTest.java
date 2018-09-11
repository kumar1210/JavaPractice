/**
 * 
 */
package com.local.lambda;

/**
 * @author gaurav's
 *
 */
public class LambdaTest {

	private static final int c =7;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runnable th = () -> System.out.println("Lambda Expression");
		
		Thread th1 = new Thread(th);
		th1.start();
		
		LambdaItest test = (a, b) -> {
			System.out.println("Addition = " + (a+b));
			System.out.println("Addition = " + (c+b));
		};
		
		test.operation(5, 3);
		
	}

	
	interface LambdaItest{
		
		public void operation(int a, int b);
	}
}
