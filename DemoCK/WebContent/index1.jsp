<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
  
  
<body bgcolor="beige">



	<div align="center">

		<h1 style="color: black">LogIn Page</h1>

		<marquee
			style="color: yellow; background-color: black; font-size: 28px">Welcome
			to LogIn Page</marquee>

		<form action="LoginCtl">

			<br />
			<table align="center" border="4px">




				<tr>
					<th>Enter your Gmail <input type="text" name="gm"></th>

				</tr>

				<tr>

					<th>Enter Password <input type="Password" name="pass" ></th>
				</tr>

				<tr>
					<th><button name="operation" value="login">Submit</button> <a
						href="NewFile.html">SignIn</a></th>

				</tr>


			</table>



		</form>


	</div>
	
	<%
	      if(request.getAttribute("info") != null){
       	
 	%>
	
	<h3 style="color:red; " align="center"><%=request.getAttribute("info") %></h3>
  <%
	      }
  %>
  
</body>
</html>