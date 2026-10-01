package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventeenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ServletContext applicationScope = getServletContext();
		
		StudentBean sben = new StudentBean(1,"Ankur",10,100);
		
		applicationScope.setAttribute("student", sben);
		
		System.out.println("SeventeenServlet : service()");
	}
}
