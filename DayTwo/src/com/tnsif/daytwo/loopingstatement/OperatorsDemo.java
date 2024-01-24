//Program to demonstrate  different operators(ternary,airthmetic,pre/post incrementation/decrementation) in java
package com.tnsif.daytwo.loopingstatement;

public class OperatorsDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a; //
		System.out.println("value of a: "+a);  //11
		int c = ++a + b + a--; //12+20+12 //a=11 //c=44
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--; //44+11+20 //b=19 //75
		System.out.println("d value after the operations: " + d);

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);

		// Ternary operator demonstration
		x = (10 == x) ? 1 : 0;
		System.out.println(x);
	}
}