/**
 * 
 */
package com.local.test;

/**
 * @author gaurav's
 *
 */
public class ChildClass extends ParentClass {
	
	int i =0;
	
	public ChildClass(int i) {
		super();
		this.i = i;
	}
	
	public ChildClass() {
	}

	@Override
	public int methodA() throws RuntimeException{
		System.out.println(Thread.currentThread());
		return 1;
	}
	
	@Override
	public String toString() {
		return String.valueOf(i);
	}
	
}
