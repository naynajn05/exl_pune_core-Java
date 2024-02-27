//Program to demonstrate PreparedStatement Interface
package com.tnsif.preparedstatementdemo;


public class Executor {

	public static void main(String[] args) {
		System.out.println("Employee Details Retrieve Operation");	
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");
		PreparedStatementDemo.updateEmpName(80, "Pulkesh");
		PreparedStatementDemo.updateEmpSalary(80, 99000);
		System.out.println("Employee Details After Update Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		
		PreparedStatementDemo.addEmployee(101, "Sneha", 94000);
		System.out.println("Employee Details After Create Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		if(PreparedStatementDemo.deleteEmp(201)==false)
			System.err.println("No such employee...");
			else
				System.out.println("Employee removed....");
		System.out.println("Employee Details After Delete Operation");
		PreparedStatementDemo.showEmp();

	}

}
