/**
 * 
 */
package local.dev.generics;

/**
 * @author gk97758
 * 
 * <p> An example to show how to define the generic class.
 * 	   By default T is the object, if the specified data type
 * 	   is not provided while instanting the object.
 *	
 * <p> We can also replace the T with the Object, but to 
 * 	   represent we use any name like here we used T
 */
public class TestAppGenericClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Always instantiate with the specific data type, else 
		//it will be instantiated with raw types and property of generics will
		//be untouched.
		Store<String> stringStore = new Store<>();
		stringStore.setItem("Hello Generics !!");
		System.out.println(stringStore.toString());
		
		Store<Integer> intStore = new Store<>();
		intStore.setItem(25);
		System.out.println("Square of 25 is : "+ Math.pow(intStore.getItem(), 2));
		
	}
	
}


class Store<T> {
	
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public String toString() {
		return this.item.toString();
	}
}