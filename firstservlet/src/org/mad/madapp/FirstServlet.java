package org.mad.madapp;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns="/register")
public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String name = req.getParameter("nm");
	String email = req.getParameter("email");
	String password = req.getParameter("pw");
		
	//PrintWriter printWriter = resp.getWriter();
	//printWriter.print("<html><body> bgcolor='green'" + <h1>welcome" +name+"</h1>" + "</body></html>");
	
	ServletOutputStream outputStream = resp.getOutputStream();
	outputStream.print("Welcome " + name);
	
	}

	
	
	
}
