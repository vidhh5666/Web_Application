package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeePortalServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");

		ServletConfig config = getServletConfig();

		String CompanyName = config.getInitParameter("CompanyName");
		String Department = config.getInitParameter("Department");
		String SupportEmail = config.getInitParameter("Support Email");
		String OfficeLocation = config.getInitParameter("Office Location");
		String MaximumEmployees = config.getInitParameter("Maximum Employees");

		
		PrintWriter out = response.getWriter();
		out.print("EmployeePortalServlet" + this + "---> EmployeePortalServlet"+config+"<br>");
		out.print("<br>CompanyName" + CompanyName + "<br>");
		out.print("<br>Department" + Department + "<br>");
		out.print("<br>SupportEmail" + SupportEmail + "<br>");
		out.print("<br>OfficeLocation" + OfficeLocation + "<br>");
		out.print("<br>MaximumEmployees" + MaximumEmployees + "<br>");

	}
}
