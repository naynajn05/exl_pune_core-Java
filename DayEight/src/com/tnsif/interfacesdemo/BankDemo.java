package com.tnsif.interfacesdemo;

public class BankDemo {

	public static void main(String[] args) {
		//create objects
		
		Bank Axis=new BankImpl(); //loose coupling
		
		Account acc1=new Account(13,"Madhuri",56000,Axis);
		
		//deposit
		
		
		Axis.deposit(acc1, 13000);
		System.out.println(acc1);
		
		Axis.deposit(acc1, 34000);
		
		Axis.withdraw(acc1, 20000);
		System.out.println(acc1);
		
		
		Axis.withdraw(acc1, 45000);
		System.out.println(acc1);
		

	}

}
