/**
 * 
 */
package local.dev.generics;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @author gk97758
 *
 */
public class TestAppGenericTypeErasure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Ideal example of a generic example 
		TypeErasure<Integer> typeErasure = new TypeErasure<>();
		typeErasure.setItem(new Integer(5));
		
		// since the type is not defined, so the type got erased to 
		//main object. new Object() can't be set to 'typeErasure'
		TypeErasure typeErasure1 = new TypeErasure();
		typeErasure1.setItem(new Object());
		
		//setting new object to boundErasure will throw compiler error, 
		//as the upper bound here is Serializable
		BoundedTypeErasure boundErasure = new BoundedTypeErasure<>();
		//boundErasure.setItem(new Object());
		boundErasure.setItem(new String("Hello World !!"));
		System.out.println(boundErasure.getItem());
		
	}

}


/***
 * 
 * commented lines shows the type erasure property of the compiler
 * when the generic is not bounded then it will be replaced by the object
 * @author gk97758
 *
 * @param <T>
 */
//class TypeErasure {
class TypeErasure<T> {
	
	private T item;
	//private Object item;
	
	//public void setItem(Object item) {
	public void setItem(T item) {
		this.item = item;
	}
	
	//public Object getItem() {
	public T getItem() {
		return this.item;
	}
}

/***
 * 
 * when the class generic is bounded then it will be replaced by the 
 * the upper bound itself.
 * @author gk97758
 *
 * @param <T>
 */
//class TypeErasure {
class BoundedTypeErasure<T extends Serializable> {
	
	private T item;
	//private Serializable item;
	
	//public void setItem(Serializable item) {
	public void setItem(T item) {
		this.item = item;
	}
	
	//public Serializable getItem() {
	public T getItem() {
		return this.item;
	}
}

