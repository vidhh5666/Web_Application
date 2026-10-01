package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("---Student registration---");
		
		String FirstName = request.getParameter("FirstName");
		String UserEmail = request.getParameter("UserEmail");
		String Password = request.getParameter("Password");
		String City = request.getParameter("City");
		
		System.out.println("FirstName    : " + FirstName);
		System.out.println("UserEmail    : " + UserEmail);
		System.out.println("Password    : " + Password);
		System.out.println("City    : " + City);

		if ("FirstName".equals(FirstName) && "Password".equals(Password))	
		{
			System.out.println("Wellcome");
		}
		else {
			System.out.println(" Invalid Registration");
		}
	}
}
