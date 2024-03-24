package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet1")
public class SecondServlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//get the client data
			 String Qualification=request.getParameter("Qualification");
			 String Designation=request.getParameter("Designation");
	
			
			 //locate the Httmp session object
			 HttpSession session=request.getSession();
			 
			 //place the data into session object
			 session.setAttribute("Qualification",Qualification);
			 session.setAttribute("Designation",Designation);
			 
			 //request the dispatcher
			 RequestDispatcher dispatcher=request.getRequestDispatcher ("ThirdForm1.html");
			 dispatcher.forward(request,response);	 
	
		}
	
	}
	
		