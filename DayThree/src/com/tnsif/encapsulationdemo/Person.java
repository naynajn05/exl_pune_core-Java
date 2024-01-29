//to demonstrate simple class & encapsulation
package com.tnsif.encapsulationdemo;

public class Person {
	
	//data member//encapsulation
	private int id;
	private String name;
	private int age;
	
	
	//getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//object class
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
