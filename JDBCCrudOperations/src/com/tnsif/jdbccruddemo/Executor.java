package com.tnsif.jdbccruddemo;

import java.sql.Connection;

public class Executor {

	public static void main(String[] args) {
		Connection cn=DBUtil.getConnection();
		System.out.println(cn);

	}

}
