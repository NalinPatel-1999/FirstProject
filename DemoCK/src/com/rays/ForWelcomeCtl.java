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

@WebServlet(urlPatterns="/welcome")
public class ForWelcomeCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		req.getRequestDispatcher("Diff.jsp").include(req, resp);
		
	
		
		//Cookie c[]=req.getCookies();
		
	//	String name=c[1].getValue();
		
		
		HttpSession ht=req.getSession(false);
		
		//pw.print("<h1 style='color:red'>welcome, "+name+"</h1>");
		
		if(ht!=null){
			
			String name=(String)ht.getAttribute("User");
			
		
			
			if(name!=null){
			
			pw.print("<h1 style='color:red' align='center'>welcome, "+name+"</h1>");
			
			}
			else {
				
				req.setAttribute("info", "Plz Login First");
				req.getRequestDispatcher("index1.jsp").forward(req, resp);
				
			}
		}
		
	/*else {
		
		pw.print("<h3 style='color:red' align='center'>Please Login First</h3>");
		req.getRequestDispatcher("index1.jsp").forward(req, resp);
		
	}*/
	}

}
