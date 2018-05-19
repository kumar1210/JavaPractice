/**
 * 
 */
package com.local.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p> this class is to test the ExecutorService
 * 	   here with two threads we are trying to handle
 * 	   5 worker threads.
 * <p>
 * 
 * @author gaurav's
 *
 */
public class TestRunnableThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);
		RunnableWorkerThread[] thread = new RunnableWorkerThread[5];
		for (int i = 0; i < 5; ++i) {
	         thread[i] = new RunnableWorkerThread(i+1);
	         pool.execute(thread[i]);
	      }
		pool.shutdownNow();
	}

}
