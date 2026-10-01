package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ninethservlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		ServletContext servletContext = getServletContext();
		
		Enumeration<String> e = servletContext.getInitParameterNames();
		
		out.print("<b>NinethServlet : </b><br>");
		
		while(e.hasMoreElements())
		{
			String paramName = e.nextElement();
			
			String paramValue = servletContext.getInitParameter(paramName);
			
			out.println(paramName + " : " + paramValue +"<br>");
		}
//		String lang1 = servletContext.getInitParameter("lang1");
//		String lang2 = servletContext.getInitParameter("lang2");
//		String lang3 = servletContext.getInitParameter("lang3");
//
//		PrintWriter out = response.getWriter();
//		
//		out.print("<b>NinethServlet : </b><br>");
//		out.print("<b>lang1 : </b>"+lang1+"</br>");
//		out.print("<b>lang2 : </b>"+lang2+"</br>");
//		out.print("<b>lang3 : </b>"+lang3+"</br>");

	}
}
