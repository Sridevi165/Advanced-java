package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet1")
public class ThirdServlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookie=request.getCookies();
		
		HttpSession session=request.getSession(false);
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<pre style='color:Green'>");
		
		writer.println("Username:"+cookie[0].getValue());
		writer.println("Age:"+cookie[1].getValue());
		writer.println("Qualification:"+cookie[2].getValue());
		writer.println("Designation:"+cookie[3].getValue());
		
		writer.println("Email:"+request.getParameter("email"));
		writer.println("Mobile number:"+request.getParameter("mobile"));

		writer.println("</pre>");
		writer.println("</html>");
		writer.println("</body>");
 
	
	}

}
