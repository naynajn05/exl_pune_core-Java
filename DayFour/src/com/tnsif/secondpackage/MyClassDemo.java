package com.tnsif.secondpackage;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj = MyClass.getObject();
		obj.setId(12);
		System.out.println(obj);

		MyClass obj1 = MyClass.getObject();
		System.out.println(obj1);

		MyClass obj2 = MyClass.getObject();
		obj2.setId(30);
		System.out.println(obj2);

		MyClass obj3 = MyClass.getObject();
		System.out.println(obj3);

	}

}
