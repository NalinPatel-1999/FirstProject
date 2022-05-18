package com.rays;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel {

	public void add(User u) {

		try {

			PreparedStatement ps = null;
			Connection con = null;

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo_database", "root", "");

			ps = con.prepareStatement("Insert into User values(?,?,?,?,?)");

			ps.setString(1, u.getfName());
			ps.setString(2, u.getlName());
			ps.setString(3, u.getGmail());
			ps.setString(4, u.getPass());
			ps.setString(5, u.getAddress());

			ps.executeUpdate();
		//	System.out.println("number of rows affected : " + ps.executeUpdate());

			ps.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public User validate(String un, String pass) {

		User u = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root", "");

			Statement st = con.createStatement();

			String query = "select * from User where gmail='" + un + "' and pass='" + pass + "'";

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				u = new User();
				u.setfName(rs.getString(1));
			    u.setGmail(rs.getString(3));
			    u.setPass(rs.getString(4));
			}

			st.close();
			con.close();

		}

		catch (Exception e) {
               
			System.out.println("exception aayi hai");
			e.printStackTrace();
		}

		return u;

	}

}
