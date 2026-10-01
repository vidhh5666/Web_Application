package com.royal.controller;

import java.io.IOException;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num =sc.nextInt();
		
		for(int i = 1 ; i <= 10 ;i++)
		{
			System.out.println(num + " * " + i  +" = " + num * i );
		}
	}
}
