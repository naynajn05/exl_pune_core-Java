//driver class
package com.tnsif.encapsulationdemo;

public class encapsulationdemo {

	public static void main(String[] args) {
		Person person1=new Person();
		person1.setId(10);
		person1.setName("Mrudula");
		person1.setAge(22);
		System.out.println(person1);
		System.out.println(person1.getAge());
		

	}

}
