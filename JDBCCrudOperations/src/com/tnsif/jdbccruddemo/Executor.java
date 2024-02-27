package com.tnsif.jdbccruddemo;

import java.sql.Connection;

public class Executor {

	public static void main(String[] args) {
		Connection cn=DBUtil.getConnection();
		System.out.println(cn);
		//add emp
		StatementInterfaceDemo.addEmployee(89, "Vilas", 78000.0d);
		
		//Retrieve all
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------------------------");
		
		System.out.println(StatementInterfaceDemo.updateEmpName(12, "Aditya"));
		StatementInterfaceDemo.updateEmpSalary(12, 98000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterfaceDemo.showEmp();
		
		
		StatementInterfaceDemo.deleteEmp(106);
		StatementInterfaceDemo.deleteEmp(107);
		StatementInterfaceDemo.updateEmpName(203,"Shreyas");
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.addEmployee(405, "Madhuri", 85000);
		StatementInterfaceDemo.showEmp();
	

	}

	}


