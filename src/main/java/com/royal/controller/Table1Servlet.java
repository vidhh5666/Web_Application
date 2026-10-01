package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Table1Servlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Scanner sc = new Scanner(System.in);

		PrintWriter out = response.getWriter();
		System.out.println("Enter a number : ");
		int num =sc.nextInt();
		
		for(int i = 1 ; i <= 10 ;i++)
		{
			out.println(num + " * " + i  +" = " + num * i );
		}
	}
}