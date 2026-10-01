package com.royal.controller;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestHeaderInfoServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Enumeration<String> e = request.getHeaderNames();
		
		while(e.hasMoreElements())
		{
			String headerName = e.nextElement();
			
			String headerValue = request.getHeader(headerName);
			
			System.out.println(headerName+ " : " +headerValue);
		}
		
		System.out.println("request.getRemoteAddr() : " + request.getRemoteAddr());
		System.out.println("request.getRemoteHost() : " + request.getRemoteHost());
		System.out.println("request.getRemoteUser() : " + request.getRemoteUser());

	}
}
