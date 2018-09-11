/**
 * 
 */
package com.local.functional;

/**
 * @author gaurav's
 *
 */
@FunctionalInterface
public interface MatheMatical {

	public void operation(int ...num);
	
	default void print() {
		System.out.println("MatheMatical Default Method");
	}
	
	@Override
    public String toString();  //Overridden from Object class
    @Override
    public boolean equals(Object obj);//Overridden from Object class
}
