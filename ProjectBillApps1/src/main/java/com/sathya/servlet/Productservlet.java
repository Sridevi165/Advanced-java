package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("./Productservlet")
public class Productservlet extends HttpServlet {
	
       	private static final String Proprice = null;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
       	//step1:Read the requested data
      		 int proId=Integer.parseInt(request.getParameter("proId"));
      		 String proName=request.getParameter(("proName"));
      		 double proprice=Double.parseDouble(request.getParameter("proPrice"));
      		 int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
      		 
         	//step1:process the data
      		 double tot_bill=proprice*proQuantity;
      		 double discount,net_amt;
    		if(tot_bill<1000)
 			  discount=0;
 		    else if(tot_bill>1000&&tot_bill<5000)
 			   discount=0.05*tot_bill;
 		
 		    else if(tot_bill>5000&&tot_bill<10000)
 			   discount=0.1*tot_bill;
 		
 		    else
 			   discount=0.15*tot_bill;
 		
 	     net_amt=tot_bill-discount;
 	
 		
 		  // Step-3 : Render the Response
 	      response.setContentType("text/html");
 	      PrintWriter Writer=response.getWriter();	    
 	      Writer.println("<html>");
 	      Writer.println("<body bgcolor=skyblue>");
 	      Writer.println("<h1>Product Form</h1>");
 	      Writer.println("Product Id="+proId+"<br><br>");
 	      Writer.println("Product Name="+proName+"<br><br>");
 	      Writer.println("Product Price=$"+Proprice+"<br><br>");
 	      Writer.println("Product Quantity="+proQuantity+"<br><br>");
 	      Writer.println("Total Bill=$"+tot_bill+"<br><br>");
 	      Writer.println("Discopunt=$"+discount+"<br><br>");
 	      Writer.println("Net Amount=$"+net_amt+"<br><br>");
 	      Writer.println("</body>");
 	      Writer.println("</html>");

    }

}