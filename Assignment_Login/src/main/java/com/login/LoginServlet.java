package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/dis")
public class LoginServlet implements Servlet{

	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		PrintWriter pw=res.getWriter();
		if(name.equals("sweta")&&password.equals("12345"))
		{
			pw.println("<br> welcome "+name);
			
		}
		else
		{
			pw.println("<br> sorry username and password error..");
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
