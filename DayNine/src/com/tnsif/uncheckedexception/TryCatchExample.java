package com.tnsif.uncheckedexception;

public class TryCatchExample {

	static int performDivision(int x, int y) {
		
		int z = 0;
		try {
			System.out.println("In try block");
			z = x / y;
			
			System.out.println("Output of division is " + z);
		} catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.err.println("Error due to division by zero..." + e.getMessage());
		} finally {
			System.out.println("In finally block");
		}

		return z;

	}

	static float division(float a, float b) {
		return a / b;
	}

}
