package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EighteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ServletContext applicationScope = getServletContext();
		
		StudentBean s= (StudentBean)context.getAttribute("Student");
		
		System.out.println("EighteenServlet service() : " +s.getRno()+ " " + s.getName()+ " " + s.getStd() + " " +s.getMarks());
		
		context.removeAttribute("student");
		
		System.out.println("EighteenServlet : Student data removed from ServletContext(Application Level Scope)");
	}
}
