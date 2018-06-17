/**
 * 
 */
package com.local.innerclass;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * An outer class, consisting static inner class
 * local inner class and non-static inner class
 * 
 * Inner classes can access their private fields directly
 * without their getter/setter methods.
 *
 */
public class OuterClass {

	private static String name = "Outer";
	private int i = 0;
	public int j = -1;
	
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}


	/****
	 * 
	 * @author gaurav's
	 * 
	 * <p> Static nested class is same as any other top-level
	 *  class and is nested for only packaging convenience.
	 *  <p> this class can access only the static variables of 
	 *  the outer class.
	 *  <p> Any other class can create its  instances
	 *  by directly calling this class name itself, i.e. no need
	 *  to have an outerclass obj reference.
	 *
	 */
	static class StaticInnerClass {
		
		public void printMethod () {
			LocalPrinter.printer("Without static : "+name);
			OuterClass obj = new OuterClass();
			LocalPrinter.printer(obj.i);
		}
		
		public static void printStaticMethod () {
			LocalPrinter.printer("With static : "+name);
		}
	}
	
	/***
	 * 
	 * @author gaurav's
	 * <p> a non static inner class which can access
	 *     all its outer class static and non-static variables;
	 *     
	 * <p> to create an object of this class, user should have
	 *  	an object reference of outer class i.e.
	 *  	OuterClass obj = new OuterClass();
	 *  	OuterClass.NonStaticInnerclass innerObj = obj.new NonStaticInnerclass();
	 */
	class NonStaticInnerClass {
		
		int k =i;
		int l = j;
		
		public void printMethod() {
			LocalPrinter.printer("Non Static Inner Class method "+k);
		}
		
		public void printStaticValueMethod() {
			LocalPrinter.printer("Print Outer Class static value "+name);
		}
	}
	
	
	public void localInnerClassMethod() {
		
		/****
		 * 
		 * @author gaurav's
		 *
		 * <p> a local inner class which is defined in a method
		 * <p> less used, but can be helpful to bring the requirements
		 *     under object model. 
		 */
		class Log {
			
			private void logger() {
				LocalPrinter.printer("Inner Local Class Printer"+name);
			}
		}
		
		Log obj = new Log();
		obj.logger();
	}
}

