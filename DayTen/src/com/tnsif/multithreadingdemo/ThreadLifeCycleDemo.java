//to demonstrate Thread Life cycle
package com.tnsif.multithreadingdemo;

public class ThreadLifeCycleDemo {
	
	public static void main(String[] args) {
		MyChildThread myThread=new MyChildThread();
		System.out.println("Before Runnable stage.." +myThread.isAlive());
		
		myThread.start();
		System.out.println("In Runnable stage.." +myThread.isAlive());
		
		try {
			Thread.sleep(500);
			System.out.println("In blocked stage "+myThread.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("thread id interrupted  ");
		}
		
		System.out.println("After completion of the execution , "
				+ "is thread alive? "+myThread.isAlive());;
	}

}
