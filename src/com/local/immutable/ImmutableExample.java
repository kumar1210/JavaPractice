/**
 * 
 */
package com.local.immutable;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author gaurav's
 * 
 * <P> An Immutable class, below are the properties of being mutable
 * 		<p> Class should be final 
 * 		<p> instances should be private.
 * 		<p> don't provide setter methods 
 * 		<p> let the instances should be final and get it initialized with constructor
 * 		<p> return a clone copy in getters, rather returning the object directly.
 * 		<p> Initialize values, by performing deep copy.
 * 
 *
 */
public final class ImmutableExample implements Cloneable{
	
	private int id;
	private String name;
	private HashMap<String, String> data;

	/**
	 * Constructor with the deep copy of the instance
	 * 
	 * @param id
	 * @param name
	 * @param data
	 */
	public ImmutableExample(int id, String name, HashMap<String, String> input) {

		this.id = id;
		this.name = name;
		System.out.println("Performing deep copy of the hashmap");
		HashMap<String,String> tempMap=new HashMap<String,String>();
		Iterator<String> itr = input.keySet().iterator();
		String key;
		while(itr.hasNext()) {
			key = itr.next();
			tempMap.put(key, input.get(key));
		}
		this.data = tempMap;
	}
	
	/**
	 * Constructor with the shallow copy of the instance
	 * 
	 * @param id
	 * @param name
	 * @param data
	 */
	public ImmutableExample(HashMap<String, String> input, int id, String name) {

		this.id = id;
		this.name = name;
		System.out.println("Performing shallow copy of the hashmap");
		this.data = input;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("1", "value1");
		map1.put("2", "value2");
		
		int id = 1;
		String name = "gaurav";
		ImmutableExample deepObject = new ImmutableExample(id, name, map1);
		ImmutableExample shallowObject = new ImmutableExample(map1, id, name);
		
		System.out.println("Object with Deep Copy " + deepObject);
		System.out.println("Object with Shallow Copy " + shallowObject);
		name ="kumar";
		id   = 2;
		map1.put("3", "value3");
		System.out.println("Object with Deep Copy post modification " + deepObject);
		System.out.println("Object with Shallow Copy post modification " + shallowObject);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the data
	 */
	public HashMap<String, String> getData() {
		//to test this, uncomment this line get this into a new variable and edit that
		//return data;  
		
		return (HashMap<String, String>) data.clone();
	}
	
	@Override
	public String toString() {
		return "[id = "+this.id+", name = "+this.name+", data = "+this.data+"]";
	}

}
