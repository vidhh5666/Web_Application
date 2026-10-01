package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TwelthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		StudentBean sbean = new StudentBean(1,"Salman",10,100);
		
		request.setAttribute("student", sbean);
		
		RequestDispatcher rd = request.getRequestDispatcher("ThirteenServlet");
		
		rd.forward(request, response);
	}
}
