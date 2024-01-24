//to demonstrate ForEach Loop
package com.tnsif.daytwo.loopingstatement;

public class ForEachDemo {

	public static void main(String[] args) {
		//for integer array
		int arr[]= {10,20,30,40,50};
		for(int i:arr)
		{
			System.out.println(i);
		}

		
		//char array
		char charArr[]= {'A','B','C'};
		for(char c:charArr)
		{
			System.out.println(c);
		}
		
		//string array
		String strArr[]= {"Java","Programming"};
		for(String str:strArr)
		{
			System.out.println(str);
		}
	}

}
