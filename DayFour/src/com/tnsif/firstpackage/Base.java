//to demonstrate packages and access modifiers
package com.tnsif.firstpackage;

public class Base {
	
	//data members
	private int varPrivate=10;
	protected int varProtected=20;
	int varDefault=30;
	public int varPublic=40;
	
	
	
	//methods 
	private void methodPrivate()
	{
		System.out.println("Private method "+varPrivate);
	}
	
	protected void methodprotected()
	{
		System.out.println("Protected method "+varProtected);
	}
	
	void methodDefault()
	{
		System.out.println("Default method "+varDefault);

	}
	
	public void methodPublic()
	{
		System.out.println("Public method "+varPublic);
		methodprotected();

	}
	
	
}
