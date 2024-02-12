package com.tnsif.uncheckedexception;
import java.util.Scanner;
public class VoterDemo {
	
	public static void main(String[] args) {
		VoterInfo voter1=new VoterInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		voter1.setName(name);
		System.out.println("Enter age");
		int age=sc.nextInt();
		voter1.setAge(age);
		System.out.println(voter1);
		
	}

}
