<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2 style="text-align: center;">Customer Details</h2>
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">${subHeaderMessage}</h3>
					</div>
					
					<div class="panel-body">
						<form:form role="form" id="registrationform" action="addCustomer"
							modelAttribute="customer" method="post">
							<form:hidden path="id"/>
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<form:input type="text" path="fname" id="fname"
											class="form-control input-sm" placeholder="First Name" />
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<form:input type="text" path="lname" id="lname"
											class="form-control input-sm" placeholder="Last Name" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:input type="email" path="email" id="email"
									class="form-control input-sm" placeholder="Email Address" />
							</div>


							<input type="submit" value="save" class="btn btn-info btn-block">

							<a class="btn btn-success" href="list" role="button">Back to
								List</a>
						</form:form>
					</div>
				</div>
			</div>

		</div>
	</div>
	<br />


</body>
</html>