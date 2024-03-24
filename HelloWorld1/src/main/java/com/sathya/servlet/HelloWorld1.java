package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sridevi")
public class HelloWorld1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
      	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    PrintWriter writer=response.getWriter();
	    writer.println("this is first servlet program");
	    writer.println("welcome to ratan sir classes");
	}

}
