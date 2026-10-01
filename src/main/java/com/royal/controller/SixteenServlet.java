package com.royal.controller;

import java.io.IOException;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SixteenServlet extends HttpServlet 
{	
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(false);
		
		System.out.println(
				"sixteenServlet : session : " + session);
		if(session == null)
		{
			request.getRequestDispatcher("login.html").forward(request ,response);
		}else
		{
			String userName = (String)session.getAttribute("usserName");
			String lang1 = (String)session.getAttribute("lag1");
			
			System.out.println("SixteenServlet --userName : " + userName);
			System.out.println("SexteenServlet --lang1 : " + lang1);
		}
	}
}
