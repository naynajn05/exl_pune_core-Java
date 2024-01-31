package com.tnsif.firstpackage;

public class Executor {

	public static void main(String[] args) {
		Base b=new Base();
		System.out.println(b.varDefault);
		System.out.println(b.varProtected);
		System.out.println(b.varPublic);
		//System.out.println(b.varPrivate);
		
		b.methodDefault();
		b.methodprotected();
		b.methodPublic();
		
		//instanceof operator
		Base b1=new Base();
		Person p=new Person();
		
		System.out.println(b1 instanceof Base); //return true
		//System.out.println(p instanceof Base); //CTE //incompatible types

	}

}
