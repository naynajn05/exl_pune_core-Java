package com.tnsif.uncheckedexception;

public class UncheckedException {

	public static void main(String[] args) {

		int x[];

		try {
			x = new int[] { 1, 3, 5, 6, 7, 7 };
			System.out.println(x[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("Element at this index is not found... " + e.getMessage());
		}

		finally {
			System.out.println("In finally block");

		}
		System.out.println("End of main method");
	}

}
