package com.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/LoginCtl")

public class LoginCtl extends HttpServlet{

	
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter pw=resp.getWriter();
		
		
		String gm=req.getParameter("gm");
		String pass=req.getParameter("pass");
		
		//System.out.println(gm);
		//System.out.println(pass);
		UserModel um=new UserModel();
		
		User u=um.validate(gm, pass);
		//System.out.println("gmail  "+u.getGmail());
		//System.out.println("pass   "+u.getPass());
		
		//System.out.println("null ke baad ka code");
	
		//String s=null;
		if(u!=null){
		//	System.out.println("iiiii");
			//s=u.getGmail();
	//	System.out.println(s);
		//	System.out.println("kuch");
		
			//if(s!=null){
				
				//System.out.println("s ke not null wala");
				
			
			
			
		if(gm.equals(u.getGmail())&& pass.equals(u.getPass())){
			
			req.getRequestDispatcher("Diff.jsp").include(req, resp);
			//Cookie ck=new Cookie("User",u.getfName());
			//resp.addCookie(ck);
		
			HttpSession ht=req.getSession();
			ht.setAttribute("User", u.getfName());
			pw.print("<h2 style='color:red' align='center'>Welcome, "+u.getfName()+"</h2>");
			
		}
				
	}
        else{
			
        	req.setAttribute("info", "Invalid UserName and Password");
			
			req.getRequestDispatcher("index1.jsp").forward(req, resp);
			
		}
	

	}
	
	
	
}
