package com.tnsif.multithreadingdemo;

public class ThreadDemo {

	public static void main(String[] args) {//thread 1
		ChildThread threadOne=new ChildThread(5,"Hello"); //thread 2
		ChildThread threadTwo=new ChildThread(10,"Hi"); //thread 3
		ChildThread threadThree=new ChildThread(10,"Bye"); //Thread 4
		threadOne.start();
		//threadOne.start(); //Illegal Thread state exception
		//threadOne.run();//single thread
		
		threadTwo.start();
		threadThree.start();
		
		System.out.println("End of the main method");

	}

}
