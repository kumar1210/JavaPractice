/**
 * 
 */
package com.local.threading;

/**
 * @author gaurav's
 * 
 * Q.1> You are given are two threads (T1 and T2) for generation and two threads (T3 and T4) for validation.
 *  How do you make sure that T3 & T4 runs only after (T1 & T2).
 *
 */
public class TestRunnableJob {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RunnableJob job1 = new RunnableJob();
		RunnableValidate job2 = new RunnableValidate();
		Thread thread1 = new Thread(job1, "T1");
		Thread thread2 = new Thread(job1, "T2");
		Thread thread3 = new Thread(job2, "T3");
		Thread thread4 = new Thread(job2, "T4");
		try {
			thread1.start();
			Thread.yield();
			thread1.join();
			thread2.start();
			thread2.join();
			thread3.start();
			thread3.join();
			thread4.start();
		} catch (Exception e) {
			System.out.println("Error while executing "+e);
		}
		
	}

}
