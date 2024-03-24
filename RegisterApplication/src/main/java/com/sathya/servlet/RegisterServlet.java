package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, CharSequence languages) throws ServletException, IOException {
		
		//step 1:Read the data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String []qualification=request.getParameterValues("qualification");
		String country=request.getParameter("contry");
		String comments=request.getParameter("comments");
		
		//	step:2
		String q=String.join(" ",qualification);
		String l=String.join(" ",languages);
		
		//step3
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("your username="+username+"<br><br>");
		writer.println("your password="+password+"<br><br>");
		writer.println("your email="+email+"<br><br>");
		writer.println("your mobile="+mobile+"<br><br>");
		writer.println("your geneder="+gender+"<br><br>");
		writer.println("your dod="+dob+"<br><br>");
		
		writer.println("your quals="+q+"<br><br>");
		writer.println("your language="+l+"<br><br>");
		writer.println("your counrty="+country+"<br><br>");
		writer.println("your comment:="+comments+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
	}

		
	}

	
		


