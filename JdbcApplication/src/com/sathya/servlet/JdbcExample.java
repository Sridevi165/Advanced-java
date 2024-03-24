package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		//stept1:load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully....");
        //step2:create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","System","geetha");
	    System.out.println("connection created successfully...");
	    //step4:Release the connection
	    connection.close();
	    System.out.println("connection closed successfully....");
	}
}
