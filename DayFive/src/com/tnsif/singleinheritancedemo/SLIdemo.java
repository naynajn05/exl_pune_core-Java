package com.tnsif.singleinheritancedemo;

public class SLIdemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setRollNo(19);
		student1.setGender("Male");
		student1.setAadharNo("1234 5678 9011");
		student1.setName("Shivam");
		System.out.println(student1);
		
		Student student2 = new Student("4356 6668","PAN 1234","Saurabh",5664575,"Male",20,"NBN");
		System.out.println(student2);
	}

}
