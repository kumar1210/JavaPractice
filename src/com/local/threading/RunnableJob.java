/**
 * 
 */
package com.local.threading;

import java.util.Date;

/**
 * @author gaurav's
 *
 */
public class RunnableJob implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		System.out.println("Runnable job is getting run by "+ thread.getName() +" at "+new Date());
		try {
		//	Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
