package com.tnsif.interfacesdemo;

public interface Bank {
	double Min_Bal=15000;
	double Deposit_Limit=25000;
	double interest_rate=7.8;
	//abstract method
	 void deposit(Account account,double amount);
	 
	 void withdraw(Account account,double amount);

}
