package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		StudentBean sbean = (StudentBean)request.getAttribute("student");
		
		System.out.println("ThirteenServlet service() : " + sbean.getRno()+" " +sbean.getName()+" " + sbean.getStd()+" "+ sbean.getMarks());
		
		request.removeAttribute("student");
		
		RequestDispatcher rd = request.getRequestDispatcher("");
		rd.forward(request, response);
	}
}
