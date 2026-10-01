package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Table2Servlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter No :");
		int no = sc.nextInt();
		
		out.print("<table border ='1'>");
		
		for(int i = 1; i <=10 ; i++)
		{
			out.print("<tr>");
			out.print("<td>"+no+"</td>"+"<td>"+" * "+" </td><td> " + i + "</td><td> = </td><td> " + (no*i)+"</td>");
			out.print("</td>");
		}
		out.print("</table>");
	}
}
