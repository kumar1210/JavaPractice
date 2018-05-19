/**
 * 
 */
package com.local.threading;

/**
 * <t> a worker thread which implements runnnable
 * 	   interface and have an identity with the int number.
 * </t>
 * 
 * @author gaurav's
 * 
 */
public class RunnableWorkerThread implements Runnable {

	private int workerNumber;

	   RunnableWorkerThread(int workerNumber) {
	      this.workerNumber = workerNumber;
	   }
	   
	   public void run() {
	      // The thread simply prints 1 to 5
	      for (int i = 1; i <= 5; ++i) {
	         System.out.printf("Worker %d: %d\n", workerNumber, i);
	         try {
	            // sleep for 0 to 0.5 second
	            Thread.sleep((int)(Math.random() * 500));
	         } catch (InterruptedException e) {}
	      }
	   }

}
