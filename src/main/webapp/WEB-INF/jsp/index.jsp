<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
 
	<center>
		<h2>Hello Spring MVC - Hibernate</h2>
		<h3>
			<a href="customer/list">Click Here to perfom CRUD</a>
		</h3>
	</center>
</body>
</html> -->
<% response.sendRedirect("customer/list");%>