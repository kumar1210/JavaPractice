package com.local.examples;



/****
 * 
 * @author gaurav's
 * <p>
 * <uri>https://dzone.com/articles/java-volatile-keyword-0
 * 
 * <p> volatile keyword is important in multithreading architecture, because
 * 		when one thread is trying to access/modify other threads instance variables
 * 		there might be the case where the other thread have it local cache of that 
 *		variables and ignore the updates. but making those variables volatile will 
 *		effectively update the local variable cache in the thread.
 */
public class TestVolatile {

	private static volatile int MY_INT = 0;

    public static void main(String[] args) {
    	new ChangeListener().start();
        new ChangeMaker().start();
    }
    
    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : {0} "+ MY_INT);
                     local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                System.out.println("Incrementing MY_INT to {0} "+ (local_value+1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (Exception e) { e.printStackTrace(); }
            }
        }
    }
}
