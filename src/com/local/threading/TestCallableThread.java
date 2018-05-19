/**
 * 
 */
package com.local.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author gaurav's
 *
 */
public class TestCallableThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService pool = Executors.newCachedThreadPool();
		
		CallableWorkerThread [] workerThread = new CallableWorkerThread[5];
		Future<String>[] futures = new Future[5];
		
		for (int i = 0; i < workerThread.length; i++) {
			workerThread[i] = new CallableWorkerThread(i+1);
			futures[i]      = pool.submit(workerThread[i]);
		}
		pool.shutdown();
		for (int i = 0; i < 5; ++i) {
	         try {
	            System.out.println(futures[i].get() + " ended");
	         } catch (InterruptedException ex) {
	        	 System.out.println(ex);
	         } catch (ExecutionException ex) {
	            System.out.println(ex);
	         }
	      }
		
	}

}
