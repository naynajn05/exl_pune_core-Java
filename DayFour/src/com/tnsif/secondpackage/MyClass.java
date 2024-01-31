//to demonstrate Private constructor and singleton class
package com.tnsif.secondpackage;

public class MyClass {
	private static MyClass object=new MyClass();
	
	private int id;

	private MyClass()
	{
		System.out.println("object is created using private constructor ");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static MyClass getObject()
	{
		return object;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	

}
