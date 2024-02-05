package com.tnsif.hierachicaldemo;

public class HierDemo {

	public static void main(String[] args) {
		Person p; //obj reference
		
		Person p1=new Person(); //tightly coupled
		
		p=new Person(); //object for person class//loosely coupled //Dynamic binding
		p.setName("Pavan");
		p.setCity("Pune");
		System.out.println(p);
		
		p=new Student("Nikhil","Mumbai","SE",78.99f);
		System.out.println(p);
		
		p=new Employee("Saurabh","Dighi",23,60000,"HR");
		System.out.println(p);
		

	}

}
