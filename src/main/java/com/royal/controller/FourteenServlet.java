package com.royal.controller;

import java.io.IOException;

import org.apache.coyote.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		StudentBean sbean = (StudentBean)request.getAttribute("student");
		
		System.out.println("FourteenServlet service() : " + sbean.getRno()+" " +sbean.getName()+" " + sbean.getStd()+" "+ sbean.getMarks());
		
	}
}
