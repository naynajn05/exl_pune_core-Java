package com.tnsif.functionalinterface;

public class GreetDemo {

	public static void main(String[] args) {
		Greet g=new Impl();
		g.greeting();
		
		//lambda Expression
		Greet g1=()->System.out.println("Bye");
		g1.greeting();
		
	}

}
