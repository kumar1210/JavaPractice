/**
 * 
 */
package com.local.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 *
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//	destroySingleton();
		testSerializedSingleton();
		
	}
	
	/***
	 * successfully deserializing the singleton with the same instance 
	 * check the method readResolve in Singleton class
	 */
	private static void testSerializedSingleton() {
		
		SerializedSingleton obj = SerializedSingleton.getInstance();
		LocalPrinter.printer("HashCode before serializing "+obj.hashCode());
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("serializedSingleton.ser"));
			output.writeObject(obj);
			output.close();  
			
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("serializedSingleton.ser"));
			SerializedSingleton obj1 = (SerializedSingleton) input.readObject();
			input.close();
			LocalPrinter.printer("HashCode after deserializing "+obj1.hashCode());
		} catch (Exception e) {
			LocalPrinter.printer("Exception while serialize-deserialize "+e.getLocalizedMessage() + "\n" +e.getMessage());
		}
		
	}

	/***
	 * method to create multiple instances of the singleton, 
	 * by using reflection methodology.
	 * Check the output hashcode of 3rd object will be different from 1st & 2nd.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	private static void destroySingleton() {

		SingletonWithStatic obj1 = SingletonWithStatic.getInstance();
		LocalPrinter.printer(obj1.hashCode());
		SingletonWithStatic obj2 = SingletonWithStatic.getInstance();
		LocalPrinter.printer(obj2.hashCode());
		SingletonWithStatic obj3 = SingletonWithStatic.getInstance();
		LocalPrinter.printer("Before Reflection "+obj3.hashCode());
		Constructor<SingletonWithStatic>[] constructor = (Constructor<SingletonWithStatic>[]) 
				SingletonWithStatic.class.getDeclaredConstructors();
		for (Constructor<SingletonWithStatic> constructor2 : constructor) {
			constructor2.setAccessible(true);
			try {
				obj3 = constructor2.newInstance();
			} catch (InstantiationException|IllegalAccessException|IllegalArgumentException|InvocationTargetException e) {
				LocalPrinter.printer(e.getStackTrace());
			}
			break;
		}
		LocalPrinter.printer("After Reflection "+obj3.hashCode());
		
	}
}
