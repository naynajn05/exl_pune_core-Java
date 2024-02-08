package com.tnsif.nestinginterfaces;

public interface OuterInterface {

	int a = 20;
	void display();

	interface InnerInterface {
		int b = 30;
		void Show();

	}

}
