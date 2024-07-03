package in.gopal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstServlet implements Servlet {
	
    static {
    	System.out.println("Servlet Loading.....");
    }
    
    public FirstServlet() {
       System.out.println("Servlet Instantiation.....");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initialization.....");
	}

	
	public void destroy() {
		System.out.println("Servlet DeInstantiation.....");
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

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title> Output </title></head>");
		out.println("<body>");
		out.println("<h1 style = 'color : blue; text-align: conter;'> Coding in eclips..");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}

}
