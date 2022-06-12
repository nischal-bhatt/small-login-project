package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	    String uname = request.getParameter("uname");
	    String pass = request.getParameter("pass");
	    
	    if (uname.equals("telusko") && pass.equals("learnings"))
	    {
	    	HttpSession session = request.getSession();
	    	session.setAttribute("username", uname);
	    	
	    	response.sendRedirect("welcome.jsp");
	    }else
	    {
	    	response.sendRedirect("login.jsp");
	    }
	
	}

	

}
