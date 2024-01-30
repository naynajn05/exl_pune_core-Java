package com.tnsif.constructordemo;
import java.util.Scanner;
public class CustomerDriver {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		
		System.out.println(cust1);

		
		Customer cust2=new Customer("Mrudula",10,21,"Pune");
		System.out.println(cust2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		
		System.out.println("Enter your address");
		String address=sc.next();
		
		Customer cust3=new Customer(name,id,age,address);
		System.out.println(cust3);
	}

}
