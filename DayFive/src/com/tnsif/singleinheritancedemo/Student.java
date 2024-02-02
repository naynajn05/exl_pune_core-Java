package com.tnsif.singleinheritancedemo;


//child class
public class Student extends Citizen{
	
	//data member
	private String gender;
	private int rollNo;
	private String collegeName;
	
	
	
	public Student() {
		super();
	}

	public Student(String gender, int rollNo, String collegeName) {
		super();
		this.gender = gender;
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	

	public Student(String aadharNo, String panNo, String name, int phNo,String gender, int rollNo, String collegeName) {
		super( aadharNo,  panNo,  name, phNo);
		this.gender = gender;
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [gender=" + gender + ", rollNo=" + rollNo + ", collegeName=" + collegeName + ", getAadharNo()="
				+ getAadharNo() + ", getPanNo()=" + getPanNo() + ", getName()=" + getName() + ", getPhNo()=" + getPhNo()
				+ "]";
	}
	
	
	
	
	
	

}
