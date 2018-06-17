/**
 * 
 */
package com.local.innerclass;

import com.local.innerclass.OuterClass.StaticInnerClass;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class TestInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OuterClass obj = new OuterClass();
		LocalPrinter.printer(obj.j);
		LocalPrinter.printer(obj.getI());
		StaticInnerClass staticInnerObj = new StaticInnerClass();
		staticInnerObj.printMethod();
		StaticInnerClass.printStaticMethod();
		OuterClass.NonStaticInnerClass nonStaticObj= obj.new NonStaticInnerClass();
		nonStaticObj.printMethod();
		nonStaticObj.printStaticValueMethod();
	}

}
