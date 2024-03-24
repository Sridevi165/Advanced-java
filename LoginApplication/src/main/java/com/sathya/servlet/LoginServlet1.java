package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet1 extends HttpServlet {
	
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		String firstname=request.getParameter("firstname");
        String middlename=request.getParameter("middlename");
        String lastname=request.getParameter("lastname");
        
        //step-2:process the data
          String status;
          
          if(firstname.equals("Sri")&&middlename.equals("Durga")&&lastname.equals("Bhavani"))
          {
       	   status=firstname+" "+middlename+" "+lastname;
          }
          else
          {
       	   status="Login fail....";
          }
          PrintWriter writer=response.getWriter();
          response.setContentType("text/html");
          writer.println("<html>");
          writer.println("<h1>Your Fullname</h1>"  +status);
          writer.println("</html>");
	}

		

}
