package com.tnsif.nestinginterfaces;

public class ChildClass implements OuterInterface.InnerInterface{

	@Override
	public void Show() {
		System.out.println(b);
		
	}

}
