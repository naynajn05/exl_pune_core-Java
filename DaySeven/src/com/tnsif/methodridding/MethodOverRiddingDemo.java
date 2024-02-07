package com.tnsif.methodridding;

public class MethodOverRiddingDemo {

	public static void main(String[] args) {
		RBI rbi;
		//Dynamic Binding //loose coupling
		rbi=new RBI();
		
		System.out.println(rbi.getHomeLoan());//RBI
		
		rbi=new AxisBank();
		System.out.println(rbi.getHomeLoan());//Axis BAnk
		
		rbi=new HDFCBank();
		System.out.println(rbi.getHomeLoan());//HDFC
		
		rbi=new ICICIBank();
		System.out.println(rbi.getHomeLoan()); //ICICI Bank
		
		
		
		

	}

}
