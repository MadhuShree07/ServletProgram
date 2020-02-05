package org.mad.madapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondFlipcart")
public class SecondFlipcartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String product = req.getParameter("pr");
		int quantity = Integer.parseInt(req.getParameter("qt"));

		double price = 12000.00;
		double total = quantity * price;

		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print("total amount is" + total);
	}
}
