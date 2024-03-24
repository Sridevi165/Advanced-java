package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<pre>");
		
		writer.println("username..."+session.getAttribute("username"));
		writer.println("age..."+session.getAttribute("age"));

		writer.println("qualification..."+session.getAttribute("qualification"));
		writer.println("designation..."+session.getAttribute("designation"));
		
		writer.println("useremail..."+request.getParameter("email"));
		writer.println("user mobile number..."+request.getParameter("mobile"));

		writer.println("</pre>");
		writer.println("</html>");
		writer.println("</body>");
 
	}
}