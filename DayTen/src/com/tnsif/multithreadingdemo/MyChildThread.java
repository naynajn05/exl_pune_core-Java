package com.tnsif.multithreadingdemo;

public class MyChildThread extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("In Running stage.." +this.isAlive());
		
		int no=0;
		
		while(no<2)
		{no++;
		System.out.println("number= "+no);
		
		try {
			sleep(400);
		}catch(InterruptedException exp)
		{
			System.err.println("Thread is interrupted.....");
		}
		
	}
	}
}
