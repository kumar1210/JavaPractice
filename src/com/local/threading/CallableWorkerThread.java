/**
 * 
 */
package com.local.threading;

import java.util.concurrent.Callable;

/**
 * @author gaurav's
 *
 */
public class CallableWorkerThread implements Callable<String> {
	
	private int identity;

	/**
	 * @param identity
	 */
	public CallableWorkerThread(int identity) {
		this.identity = identity;
	}

	@Override
	public String call() throws Exception {

		for (int i = 1; i <= 5; ++i) {    // just print 1 to 5
	         System.out.printf("Worker %d: %d\n", identity, i);
	         try {
	            Thread.sleep((int)(Math.random() * 1000));
	         } catch (InterruptedException e) {}
	      }
	      return "worker " + identity;
	}

}
