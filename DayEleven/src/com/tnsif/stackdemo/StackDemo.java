//to demonstrate Stack 
package com.tnsif.stackdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		System.out.println(stk);
		
		stk.push(5);
		stk.push(78);
		stk.push(99);
		stk.push(56);
		stk.push(null);
		stk.push(99);
		stk.push(null);
		System.out.println(stk);
		
		System.out.println(stk.pop());
		System.out.println(stk);
		
		System.out.println(stk.pop());
		System.out.println(stk);
		
		System.out.println("Peek element "+stk.peek());
		System.out.println(stk);
		
		System.out.println(stk.search(56));
		
	

	}

}
