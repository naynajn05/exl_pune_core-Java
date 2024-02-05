////Program to demonstrate Hierarchical Inheritance - Student Class
package com.tnsif.hierachicaldemo;

//child2
public class Student extends Person
{
	private String clas;
	private float per;
	
	public Student(String clas, float per) {
		this.clas = clas;
		this.per = per;
	}
	
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(String name, String city,String clas, float d )
	{
		//private members can't inherited into child class
		/*
		 * super.name=name; super.city=city;
		 */
		super(name,city);
		this.clas = clas;
		this.per = d;
	}
	
	@Override
	public String toString() {
		return "Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	
	
}
