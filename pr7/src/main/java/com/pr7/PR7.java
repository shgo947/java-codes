package com.pr7;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PR7 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse  response) throws IOException, ServletException {
		
		String name;
		int age;
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		name = request.getParameter("name");
		age = Integer.parseInt(request.getParameter("age"));
		
		out.print("<html><head><title>ServletForDoPostMethod</title></head>");
		out.print("<body><h3>Your name is "+name);
		out.print("<br>Your age is "+age);
		out.print("</body></html");
		
	}
	
	
}