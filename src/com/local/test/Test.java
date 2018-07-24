package com.local.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import localjar.LocalPrinter;


/****
 * 
 * @author gaurav's
 * <p> this class has different conceptual method examples
 *     for testing and common understanding.
 */
public class Test {
	
	public int num; 
	
	public static void main(String[] args) {

		//demoVarArgsMethod(1,2,3,4);
		//testHashMethod();
		//testHashMapValues();
		//checkLowerPrecisionValue();
		//checkHashSetIndexingWithHashCode();
		//testValueIterator();
		Map<String, Integer> map = new ConcurrentHashMap<>();
		System.out.println(map.put("Key1", 1));
		System.out.println(map.put("Key2", 2));
		System.out.println(map.put("Key1", 3));
		System.out.println(map.get("Key1"));
		System.out.println(map.remove("Key2"));
		
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
        
        Iterator<String> failSafeIterator = threadSafeList.iterator();
        while(failSafeIterator.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
            //failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
        }
        
        String[] array = {"geeksf", "geeks", "geeksfor", "geeksforgeeks"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
	}
	
	/****
	 * test the removing of map values through it's 
	 * one of key's value.
	 */
	private static void testValueIterator () {
		Map<String, String> map = new HashMap<>();
	    map.put("name", "baeldung");
	    map.put("type", "blog");
 	    LocalPrinter.printer(map);
	    Collection<String> values = map.values();
	    values.remove("baeldung");
	    LocalPrinter.printer(values.size());
	    LocalPrinter.printer(values.contains("baeldung"));
	    LocalPrinter.printer(values.contains("blog"));
	    LocalPrinter.printer(map);
	}
	
	
	/****
	 * check the equals and hashcode implementation of parent class
	 */
	private static void checkHashSetIndexingWithHashCode() {
		
		for(int i =0; i<10; i++) {
			LocalPrinter.printer("loop started ----------");
			Set<ParentClass> obj = new HashSet<ParentClass>(3,1);
			ParentClass parent  =  new ParentClass(10);
			ParentClass parent1 = new ParentClass(11);
			ParentClass parent2 = new ParentClass(12);
			ParentClass parent3  =  new ParentClass(13);
			ParentClass parent4 = new ParentClass(14);
			ParentClass parent5 = new ParentClass(15);
			obj.add(parent);
			obj.add(parent1);
			obj.add(parent2);
			obj.add(parent3);
			obj.add(parent4);
			obj.add(parent5);
			LocalPrinter.printer(obj.size());
			LocalPrinter.printer(obj.hashCode());
			LocalPrinter.printer(obj);
			LocalPrinter.printer(obj.contains(parent5));
			LocalPrinter.printer(obj.contains(parent4));
			LocalPrinter.printer(obj.contains(parent3));
			LocalPrinter.printer(obj.contains(parent2));
			LocalPrinter.printer(obj.contains(parent1));
			LocalPrinter.printer(obj.contains(parent));
			for (ParentClass parentClass : obj) {
				LocalPrinter.printer(parentClass.j);
				
				
			}
		}
	}
	
	/****
	 * this is all magic of hashcode and equals implementation
	 */
	private static void testHashMapValues() {
		HashMap<CharSequence,Integer> map = new HashMap<CharSequence,Integer>();
		
		String x = new String("try");
		map.put(x,7);
		LocalPrinter.printer(map);
		LocalPrinter.printer(x.hashCode()+"\n");
		
		String y=new String("try");
		map.put(y,9);
		LocalPrinter.printer(map);
		LocalPrinter.printer(y.hashCode()+"\n");
		
		String z=new String("try");
		map.put(z,8);
		LocalPrinter.printer(map);
		LocalPrinter.printer(z.hashCode()+"\n");
		
		StringBuffer a = new StringBuffer("try");
		map.put(a,3);
		LocalPrinter.printer(map);
		LocalPrinter.printer(a.hashCode()+"\n");
		
		StringBuffer b = new StringBuffer("bry");
		map.put(b,5);
		LocalPrinter.printer(map);
		LocalPrinter.printer(b.hashCode()+"\n");
		
		StringBuffer c = new StringBuffer("try");
		map.put(c,4);
		LocalPrinter.printer(map);
		LocalPrinter.printer(c.hashCode()+"\n");
		
		LocalPrinter.printer("size = "+map.size() + "\n");
		
		
		HashMap<ParentClass, Integer> objMap = new HashMap<>();
		
		ChildClass child  = new ChildClass(5);
		objMap.put(child, 5);
		LocalPrinter.printer(objMap);
		LocalPrinter.printer(child.hashCode());
		
		ChildClass child1 = new ChildClass(5);
		objMap.put(child1, 5);
		LocalPrinter.printer(objMap);
		LocalPrinter.printer(child1.hashCode());
		
		ParentClass parent = new ParentClass(10);
		objMap.put(parent, 10);
		LocalPrinter.printer(objMap);
		LocalPrinter.printer(parent.hashCode());
		
		ParentClass parent1 = new ParentClass(10);
		objMap.put(parent1, 10);
		LocalPrinter.printer(objMap);
		LocalPrinter.printer(parent1.hashCode());
	}
	
	
	/***
	 * 
	 * sample method of hashmap testing.
	 */
	private static void testHashMethod() {
		
		Integer h =100, key =2;
		int n = (h = key.hashCode()) ^ (h >>> 8);
	    h = (key == null) ? 0 : n;
	    LocalPrinter.printer(h);
	    HashMap<String, String> map = new HashMap<>();
	    LocalPrinter.printer(map.put("t1", "V1"));
	    LocalPrinter.printer(map.put("t1", "V2"));
	    LocalPrinter.printer(map.get("t3"));
	}
		
	/****
	 * 
	 * this is to check the conversion of lower precision value
	 * to higher precision. 
	 * However there is a chance of loss of data while type-casting.
	 */
	private static void checkLowerPrecisionValue() {

		byte bit = (byte) 111111;
		int converted = (int)bit;
		LocalPrinter.printer("Byte : "+bit +" int : "+converted);
		
		ChildClass obj = new ChildClass();
		LocalPrinter.printer(obj.methodA());
	}

	/****
	 * varargs works as an array, but should not be considered as a 
	 * replacement of that.
	 * 
	 * method with varargs, should not be overloaded. 
	 * it gets compile successfully, but while using it compiler
	 * might get confused. like the below two methods
	 * @param is
	 */
	public static void demoVarArgsMethod(int ...is ) {
		
		LocalPrinter.printer(Arrays.toString(is));
	}
	
	public static void demoVarArgsMethod(int i, int ...js) {
		LocalPrinter.printer(Arrays.toString(js));
	}

}
