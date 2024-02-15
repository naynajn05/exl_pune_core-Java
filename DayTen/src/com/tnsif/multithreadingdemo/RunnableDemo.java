package com.tnsif.multithreadingdemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Runnable obj = new UsingRunnable(1, 5, "Good Evening");
		 * 
		 * Runnable obj1 = new Runnable() {// anonymous class public void run()
		 * 
		 * { System.out.println("runnable using anonymous class"); }
		 * 
		 * }; Thread thread=new Thread(obj1); thread.start();
		 */
	
	//lambda Expression
	Runnable runnable=()->{
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println("Hello" + i);
		}
	};
	
	new Thread(runnable).start();
	
	System.out.println("End of main ");
	}

}
