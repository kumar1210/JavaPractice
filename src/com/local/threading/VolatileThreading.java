/**
 * 
 */
package com.local.threading;

import java.util.Scanner;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * <p> volatile keyword is important in multithreading architecture, because
 * 		when one thread is trying to access/modify other threads instance variables
 * 		there might be the case where the other thread have it local cache of that 
 *		variables and ignore the updates. but making those variables volatile will 
 *		effectively update the local variable cache in the thread.
 *
 */
public class VolatileThreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Process proc = new Process();
		proc.start();
		
		LocalPrinter.printer("Press Enter to stop running");
		Scanner scn = new Scanner(System.in);
		scn.nextLine();
		proc.shutdown();
		LocalPrinter.printer("Process has been stopped");
		scn.close();
	}
	
}

class Process extends Thread{
	
	private volatile boolean state = true;
	
	@Override
	public void run() {
		
		while(state) {
			LocalPrinter.printer("Running");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LocalPrinter.printer("Exception while running the thread"+ e.getStackTrace());
			}
		}
	}
	
	public void shutdown() {
		state = false;
	}
}
