package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the client data
		 String Username=request.getParameter("username");
		 String age=request.getParameter("Age");

		 //create the Http session object
		 HttpSession session=request.getSession();
		 
		 //place the data into session object
		 session.setAttribute("Username",Username);
		 session.setAttribute("Age",age);
		 
		 //request the Dispatcher
		 RequestDispatcher dispatcher=request.getRequestDispatcher ("SecondForm1.html");
		 dispatcher.forward(request,response);	 

	
  }

}



