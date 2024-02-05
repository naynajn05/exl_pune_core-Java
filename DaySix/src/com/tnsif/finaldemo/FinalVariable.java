// Program to demonstrate final Variable
package com.tnsif.finaldemo;

public class FinalVariable {

	//final int x; // final instance variable must be initialized

	
	
	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;
	final  static int z=100;;
	

	// Declare & intialize static final variable.

	// instatnce method
	void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

}
