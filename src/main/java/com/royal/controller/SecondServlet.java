package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SecondServlet mango");
	}
}
