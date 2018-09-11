/**
 * 
 */
package com.local.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author gaurav's
 *
 */
public class TestPriorityQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		PriorityQueue<String> tasks=new PriorityQueue<String>(Comparator.naturalOrder());
		tasks.add("task1");
		tasks.add("task4");
		tasks.add("task3");
		tasks.add("task2");
		tasks.add("task5");
		
		Object[] taskArray = tasks.toArray();
		System.out.println(Arrays.toString(taskArray));
		System.out.println(tasks.toString());

		System.out.println(tasks.poll());
		System.out.println(tasks.poll());
		System.out.println(tasks.comparator().toString());
	}

}
