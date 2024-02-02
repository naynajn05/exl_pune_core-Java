//to demonstrate single level inheritance
package com.tnsif.singleinheritancedemo;

//parent class
public class Citizen {

	private String aadharNo;
	private String panNo;
	private String name;
	private int phNo;

	// constructor
	public Citizen() {
		System.out.println("Citizen Default constructor");

	}

	public Citizen(String aadharNo, String panNo, String name, int phNo) {

		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.name = name;
		this.phNo = phNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhNo() {
		return phNo;
	}

	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", panNo=" + panNo + ", name=" + name + ", phNo=" + phNo + "]";
	}

	
	
	
}
