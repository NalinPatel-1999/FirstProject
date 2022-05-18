package com.rays;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/reg")
public class User_Regist extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		

		
		String fName = req.getParameter("fn");
		String lName = req.getParameter("ln");
		String gmail = req.getParameter("gm");
		String pass = req.getParameter("pass");
		String add = req.getParameter("add");
		String op=req.getParameter("operation");

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

	
		User bean = new User();

		bean.setfName(fName);
		bean.setlName(lName);
		bean.setGmail(gmail);
		bean.setPass(pass);
		bean.setAddress(add);

		UserModel um = new UserModel();

		um.add(bean);

		pw.print("<h1 style='color:red'>Successfully Registered...!!!</h1>");
	
		
	
	}

}
	
