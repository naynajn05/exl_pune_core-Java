//to demonstrate the database setting
package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Import java.sql package
Load and register the driver-
Establish a connection to the database server
Create a statement
Execute the statement
Retrieve the result
Close the statement and connection
*/
public class DBUtil {
	
	private static Connection cn;
	private static final String DB_Driver_Class="com.mysql.cj.jdbc.Driver";
	private static final String DB_Url="jdbc:mysql://localhost:3306/test";
	private static final String DB_USername="root";
	private static final String DB_Password="Sanavi@05";
	public static Connection getConnection()
	{
		try {
			
			//step 1
			Class.forName(DB_Driver_Class);//to load the driver
			System.out.println("Driver is loaded successfully...");
			//step 2
			 cn=DriverManager.getConnection(DB_Url, DB_USername, DB_Password);
			System.out.println("Connection is established...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		return cn;
	}
	
	

}
