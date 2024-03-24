package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException
	{
		//step1:load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully....");
		
		//step2:create the connection 
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","geetha");
		System.out.println("connection cdreated successfully...");
	}

}
