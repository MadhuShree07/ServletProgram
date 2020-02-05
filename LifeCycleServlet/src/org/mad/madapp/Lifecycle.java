package org.mad.madapp;
//by using config object
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/lifecycle",loadOnStartup=88,
initParams=
{
		@WebInitParam(name="jingalala", value="ulala"),
		@WebInitParam(name="age",value="ulala"),
})

public class Lifecycle extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		ServletConfig cong=getServletConfig();
		String value = cong.getInitParameter("jingalala");
		String age= cong.getInitParameter("age");
		
		System.out.println("service method is executed");
		String appName=req.getParameter("AppName");
		String appsize=req.getParameter("size");
		String appversion=req.getParameter("version");
		
		ServletOutputStream outputStream=resp.getOutputStream();
		outputStream.print("Thank you for visiting"+appName+""+appsize+""+appversion);
	}
public Lifecycle() {
	System.out.println("Servlet object is created");
}
public void destroye() {
	System.out.println("close only costly resources");
}
}
