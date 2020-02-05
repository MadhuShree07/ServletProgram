package org.mad.madapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


//@WebServlet(urlPatterns="/FoodStreet")
@WebServlet("/FoodStreetServlet")
public class FoodStreetServlet extends GenericServlet{
	

@Override
public void service(ServletRequest req, ServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	String area = req.getParameter("area");
	String noOfItems = req.getParameter("items");
	String stallName = req.getParameter("stallName");
	String type = req.getParameter("type");
		
	
	ServletOutputStream outputStream = resp.getOutputStream();
	outputStream.print("Thank you for visiting " + stallName);
	
	}
}