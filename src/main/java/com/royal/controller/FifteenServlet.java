package com.royal.controller;

import java.io.IOException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FifteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		System.out.println("FifteenServlet : session : " + session);
		
		if(session == null)
		{
			request.getRequestDispatcher("login.html").forward(request,response);

		}else
		{
			String userName = (String)session.getAttribute("usserName");
			session.setAttribute("lang1", "Jsp-Servlet");
			
			System.out.println("FifteenServlet --userName : " + userName);
		}
	}
}
