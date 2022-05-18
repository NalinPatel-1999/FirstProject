package com.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/signout")
public class SignOut extends HttpServlet{

	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
	
		
	 //  Cookie ck=new Cookie("User","");
	  // ck.setMaxAge(0);
	   //resp.addCookie(ck);
		
		
		
	//	Cookie c[]=req.getCookies();
		//String name=c[0].getValue();
		
		//pw.print(name);
		//req.getRequestDispatcher("index1.jsp").include(req, resp);
		
		
		
		HttpSession ht=req.getSession();
		
		ht.invalidate();
		
	
		req.getRequestDispatcher("index.jsp").include(req, resp);
		
		
		
		
		
		
	}
}
