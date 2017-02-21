<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="resources/js/jquery.min.js"></script>
<c:url value="resources/js/jqueryValidate.js" var="url" />
<script src="<c:out value='${url}'/>"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/bootstrap-combined.min.css"></script>
<script src="resources/js/additional-methods.js"></script>
<link rel="stylesheet" href="resources/styles/bootstrap.min.css" />
<title>List of Customers</title>
</head>
<body>
	<center>
		<h2>Customer Management System </h2>
		
	</center>

	<table class="table">
		<thead>
			<tr>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="tempCustomer" items="customers">
			<tr>
				<td>${tempCustomers.fname}</td>
				<td>${tempCustomers.lname}</td>
				<td>${tempCustomers.email}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
>
