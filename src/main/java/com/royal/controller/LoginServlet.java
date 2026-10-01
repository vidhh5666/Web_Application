package com.royal.controller;

import java.io.IOException;
import java.util.Enumeration;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("-----doGet()---LoginServlet -----");
		
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		
		RequestDispatcher rd = null;
		
		HttpSession session = null;
		
		if("admin".equals(UserName) && "admin@123".equals(Password))
		{
			session = request.getSession(true);
			
			session.setAttribute("userName", UserName);
			
			rd = request.getRequestDispatcher("FifteenServlet");
		}
		else
		{
			rd = request.getRequestDispatcher("login.html");
		}
		
		rd.forward(request, response);
//		Enumeration<String> e = request.getParameterNames();
//		
//		while(e.hasMoreElements())
//		{
//			String nameStr = e.nextElement();
//			String nameValue = request.getParameter(nameStr);
//				
//			System.out.println(nameStr + "---" + nameValue);
//		}
//		System.out.println("UserEmailId : " + UserEmailId);
//		System.out.println("Password    : " + Password);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		System.out.println("----- LoginServlet -----");
//		
//		Enumeration<String> e = request.getParameterNames();
//		
//		while(e.hasMoreElements())
//		{
//			String nameStr = e.nextElement();
//			String nameValue = request.getParameter(nameStr);
//			
//			System.out.println(nameStr + "---" + nameValue);
//		}
//		
////		String UserEmailId = request.getParameter("UserEmailId");
////		
////		String Password = request.getParameter("Password");
////		
////		System.out.println("UserEmailId : " + UserEmailId);
////		System.out.println("Password    : " + Password);
////
////		if(UserEmailId.equals("user123@gmail.com")&& Password.equals("user123"))
////		{
////			System.out.println("Well Come");
////		}
////		else {
////			System.out.println("Invalid Credentials");
////		}
//	}
}
