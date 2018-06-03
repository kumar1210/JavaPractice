/**
 * 
 */
package com.local.latch;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author gaurav's
 *
 */
public class RunnableLatch implements Runnable {
	
	public CountDownLatch latch;
	
	/**
	 * @param latch
	 */
	public RunnableLatch(CountDownLatch latch) {
		this.latch = latch;
	}



	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println("Thread Started "+Thread.currentThread().getName() + " at "+ new Date());
		try {
			//Thread.sleep(1000);
			latch.countDown();
		} catch (Exception e) {
			System.out.println("Error "+e);
		}
	}



	/**
	 * 
	 */
	public RunnableLatch() {
		super();
	}

}
