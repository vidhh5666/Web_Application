package com.royal.controller;

import java.io.IOException;

import org.apache.coyote.Request;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("SeventhServlet : service(HttpServletrequest requset , HtppServletResponse response)");
		
		
	}
}
