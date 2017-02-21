<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="<c:url value="/resources/css/style.css" />" rel='stylesheet'
	type='text/css'>

<title>List of Customers</title>
</head>
<body>
	<center>
		<h2>Customer Management System</h2>

	</center><br/>
<a class="btn btn-default" href="customerForm" role="button">Add New Customer</a>
<br/><br/>
	<table class="table table-bordered">
		<thead class="thead-default">
			<tr class="active">
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempCustomer" items="${customers}">
				<c:url var="updateCustomerRef" value="updateCustomer">
					<c:param name="customerId" value="${tempCustomer.id}"></c:param>
				</c:url>
				<c:url var="deleteCustomerRef" value="deleteCustomer">
					<c:param name="customerId" value="${tempCustomer.id}"></c:param>
				</c:url>
				<tr>
					<td>${tempCustomer.fname}</td>
					<td>${tempCustomer.lname}</td>
					<td>${tempCustomer.email}</td>
					<td><a class="btn btn-default" href="${updateCustomerRef}" role="button">Update</a>&nbsp;|&nbsp;<a class="btn btn-default" href="${deleteCustomerRef}" onclick="return confirm('Are you sure?')" role="button">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

