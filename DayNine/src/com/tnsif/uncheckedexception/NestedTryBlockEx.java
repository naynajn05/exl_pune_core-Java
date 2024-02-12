//Program to demonstrate nested Try Catch Block
package com.tnsif.uncheckedexception;

public class NestedTryBlockEx {
	public static void check() {
		//string 1
		String str = "TNSIF";
		int slength = str.length();
		System.out.println("String length: " + slength);
		
		//string 2
		String anotherString = null;
		
		int y = 3;
		try {
			// Inner try block
			try {

				System.out.println(str.charAt(y)); // Exception occurred.

			} catch (StringIndexOutOfBoundsException ex) {
				System.err.println("index is out of bounds" + ex.getMessage());

			}
			System.out.println("String length: " + anotherString.length());

		} catch (NullPointerException npe) {
			System.err.println("Exception is thrown " + npe.getMessage());
		}
	}
}
