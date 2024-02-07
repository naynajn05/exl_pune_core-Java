package com.tnsif.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(23, 78));
		
		System.out.println(MethodOverloading.addition(23.6f, 78));
		System.out.println(MethodOverloading.addition(23, 78.9f));
		System.out.println(MethodOverloading.addition("Ritesh ", "Dhatrak"));
		System.out.println(MethodOverloading.addition("Ritesh ", "Dhatrak ","Pune"));

		
		Point p1=new Point();
		
		System.out.println(p1);
		
		Point p2=new Point(7f);
		System.out.println(p2);
		
		Point p3=new Point(2.6f,9.0f);
		System.out.println(p3);
	}

}
