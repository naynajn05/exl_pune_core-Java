package com.tnsif.interfacesdemo;

public class BankImpl implements Bank {

	@Override
	public void deposit(Account account, double amount) {
		if(amount>Deposit_Limit)
		{
			System.out.println("Deposit limit exceeded..Try later");
		}
		else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("Deposited amount is "
			+amount+"into account "+account.getAccNo());
		}
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance()-amount>Min_Bal)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Amount is withdrawn "
					+amount+"from account "+account.getAccNo());
		}else
		{
			System.out.println("You can not withdraw amount");
		}
		
	}

}
