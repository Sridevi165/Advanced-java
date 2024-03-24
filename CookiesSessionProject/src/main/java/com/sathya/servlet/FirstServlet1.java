package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the requested data from client
		 String Username=request.getParameter("username");
		 String Age=request.getParameter("age");

		 //create the cookies object
		  Cookie cookie1=new Cookie("username",Username);
		  Cookie cookie2=new Cookie("age",Age);
		 
		 //add the cookies into response object
		 response.addCookie(cookie1);
	     response.addCookie(cookie2);
	     			 
		 //request the Dispatcher
		 RequestDispatcher dispatcher=request.getRequestDispatcher ("SecondForm1.html");
		 dispatcher.forward(request,response);	 

	
  }

}
