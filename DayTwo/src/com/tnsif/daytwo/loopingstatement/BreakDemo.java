//Program to demonstrate  break statement
package com.tnsif.daytwo.loopingstatement;

public class BreakDemo {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}

	}
}
