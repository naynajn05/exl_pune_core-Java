//Program to demonstrate static variables
package com.tnsif.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Yash", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Apurva", 321);
		System.out.println(e);
		
		e = new Employee("Ashish", 213);
		System.out.println(e);
	}
	
	
}