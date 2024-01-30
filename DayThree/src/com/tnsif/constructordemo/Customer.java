// to demonstrate constructor
package com.tnsif.constructordemo;

public class Customer {
	// instance variable
	private String name;
	private int id;
	private int age;
	private String address;

	// Default constructor
	public Customer() {
		System.out.println("Default constructor");
	}

	// Parameterized constructor
	public Customer(String name, int id, int age, String address) {

		this();// default constructor
		System.out.println("Para. Const)");
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + "]";
	}

}
