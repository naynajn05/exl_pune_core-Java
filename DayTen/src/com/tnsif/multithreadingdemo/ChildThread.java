//to demonstrate creating the child thread by extending thread class
package com.tnsif.multithreadingdemo;

public class ChildThread extends Thread{
	private int n;
	private String msg;
	
	//constructor
	public ChildThread(int n, String msg) {
		
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		
		for(int i=1;i<=n;i++)
		{
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted.."+ e.getMessage());
			}
		System.out.println(msg + i );
		System.out.println(Thread.currentThread().getName());
		}
	}

}
