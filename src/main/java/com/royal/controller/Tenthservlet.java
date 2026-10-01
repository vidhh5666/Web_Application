package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Tenthservlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		
		out.print("<b>Tenthservlet : </b><br>");
		out.print("<b>context : </b>"+ context +"<br>");

		String lang1 = context.getInitParameter("lang1");
		String lang2 = context.getInitParameter("lang2");
		String lang3 = context.getInitParameter("lang3");
		String lang4 = context.getInitParameter("lang4");

		out.print("<b>lang1 : </b>" + lang1+"<br>");
		out.print("<b>lang2 : </b>" + lang2+"<br>");
		out.print("<b>lang3 : </b>" + lang3+"<br>");
		out.print("<b>lang4 : </b>" + lang4+"<br>");
	}
}
