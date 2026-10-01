package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SixthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("SixthServlet: service(HttpServletrequest requset , HtppServletResponse response)");
		
		RequestDispatcher rd = request.getRequestDispatcher("SeventhServlet");
		
//		rd.forward(request,response);
		rd.include(request, response);
	}
}
