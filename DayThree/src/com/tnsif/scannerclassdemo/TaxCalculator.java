//driver class for tax calculation
package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Person person=new Person();
		
		//scanner class to accept input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your gender");
		String gender=sc.next();
		
		System.out.println("Enter your income");
		int income=sc.nextInt();
		
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		TaxCalculation tax=new TaxCalculation();
		tax.calculateTax(person);
		
		System.out.println(person);

	}

}
 