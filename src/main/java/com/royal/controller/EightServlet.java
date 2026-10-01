package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EightServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 

	{
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		
		Enumeration<String> e = config.getInitParameterNames();
		
		while(e.hasMoreElements())
		{
			String paraName = e.nextElement();
			
			String paraValue = config.getInitParameter(paraName);
			
			System.out.println(paraName+"----"+paraValue);
		}	

//		String urlName = config.getInitParameter("URLNAME");
//		String driverClass = config.getInitParameter("DRIVERCLASS");
//		String userName = config.getInitParameter("USERNAME");
//		String password = config.getInitParameter("PASSWORD");
//		
//		PrintWriter out = response.getWriter();
//		out.print("EightServlet" + this + "---> EightServletConfig"+config+"<br>");
//		out.print("<br>urlName" + urlName + "<br>");
//		out.print("<br>driverClass" + driverClass + "<br>");
//		out.print("<br>userName" + userName + "<br>");
//		out.print("<br>password" + password + "<br>");
		
	}
}
