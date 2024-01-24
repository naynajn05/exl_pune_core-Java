package com.tnsif.daytwo.loopingstatement;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=510,b=316,c=56;
		if(a>b) //t=a
			{
			if(a>c)//
				System.out.println("a is a larger number");
			else
				System.out.println("c is a larger number");
	}else
		if(c>b)
		System.out.println("c is a larger number");
		else
			System.out.println("b is a larger number");


	}

}
