/**
 * 
 */
package local.dev.generics;

/**
 * @author gk97758
 *
 * <p> This is an example of generic method
 */
public class TestAppGenericMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericMethod genericMethod = new GenericMethod();
		Integer intValue = new Integer(123);
		System.out.println("Returned value of generic method is : "+ genericMethod.showItems(intValue));
		Integer[] intArray = {1, 2, 5, 3, 4};
		genericMethod.showItems(intArray);
	}

}


class GenericMethod {
	
	/***
	 * a generic method which accepts the generic input value
	 * and perform actions accordingly.
	 * @param array
	 */
	public <T> void showItems(T[] array) {
		
		for(T item: array) {
			System.out.print(item +"->");
		}
	}
	
	/***
	 * a generic method which takes a generic input and
	 * return a generic output.
	 * @param item
	 * @return
	 */
	public <T> T showItems(T item) {
		
		System.out.println("Generic type of the item is : "+ item.getClass().getSimpleName());
		return item;
	}
}