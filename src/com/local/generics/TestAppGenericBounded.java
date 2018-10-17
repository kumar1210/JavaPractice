/**
 * 
 */
package local.dev.generics;

/**
 * @author gk97758
 *
 */
public class TestAppGenericBounded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//since integer implements Comparable interface
		System.out.println("Max value is : "+ calculateMax(100, 150));
	}

	/**
	 * restricts to pass only thos objects which is implementing comparable
	 * interface, i.e. bounding the parameter upto a specific type only which is 
	 * comparable here.
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Comparable<T>> T calculateMax(T t1, T t2) {
		
		if (t1.compareTo(t2)> 0){
			return t1;
		}
		
		return t2;
	}
}
