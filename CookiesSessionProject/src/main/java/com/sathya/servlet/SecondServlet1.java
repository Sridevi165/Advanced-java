package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet1")
public class SecondServlet1 extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//get the requested data from client
			 String Qualification=request.getParameter("Qualification");
			 String Designation=request.getParameter("Designation");

			 //create the cookies object
			  Cookie cookie3=new Cookie("qualification",Qualification);
			  Cookie cookie4=new Cookie("designation",Designation);
			 
			 //add the cookies into response object
			 response.addCookie(cookie3);
		     response.addCookie(cookie4);
		     			 
			 //request the Dispatcher
			 RequestDispatcher dispatcher=request.getRequestDispatcher ("ThirdForm1.html");
			 dispatcher.forward(request,response);	 

		
	}

}
