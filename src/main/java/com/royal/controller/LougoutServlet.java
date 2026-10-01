package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LougoutServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		
		System.out.println("LogoutServlet : session : " + session);
		if(session == null)
		{
			request.getRequestDispatcher("login.html").forward(request, response);
		}else
		{
			String userName = (String)session.getAttribute("userName");
		    String lang1 = (String)session.getAttribute("lang1");

		    System.out.println("LogoutServlet -- userName : " + userName);
		    System.out.println("LogoutServlet -- lang1 : " + lang1);

		    System.out.println("LogoutServlet : session Terminated");
		    
		    session.invalidate();
		}
	}
}
