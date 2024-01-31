package com.tnsif.secondpackage;

import com.tnsif.firstpackage.Base;

public class Executor extends Base{

	public static void main(String[] args) {
		Base b=new Base();
		//System.out.println(b.varDefault);
		//System.out.println(b.varProtected);
		System.out.println(b.varPublic);
		//System.out.println(b.varPrivate);
		
		//b.methodDefault();
		//b.methodprotected();
		b.methodPublic();
	}

}
