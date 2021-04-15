<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Admin</title>

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="/Admin/css/style3.css">

<!-- Scrollbar Custom CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
<link href="/Admin/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="/Admin/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="/Admin/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="/Admin/vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Jquery JS-->

<script src="/Admin/vendor/jquery/jquery.min.js"></script>


<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>

<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>

</head>
<body>
	<h1 align="center">Admin List</h1>
	<fm:form modelAttribute="alist" name="/adminlist">
		<div class="w3-table w3-blue">
			<div
				style="display: flex; justify-content: space-between; margin: 0px 20px">
				<div class="lbutton">
					<a href="/home"><button
							class="btn btn--radius-2 btn btn-danger" type="button">Back</button></a>
				</div>
				<div class="rbutton">
					<a href="/addadmin"><button
							class="btn btn--radius-2 btn btn-danger" type="button">Add
							Admin</button></a>
				</div>
			</div>
			<table class="table table-striped mt-3">
				<tbody>
				<thead align="center" title="Admin List">
					<tr>
						<th scope="col">Admin ID</th>
						<th scope="col">Name</th>
						<th scope="col">Mobile Number</th>
						<th scope="col">Operation</th>
					</tr>
					<c:forEach items="${alist}" var="alist">
						<tr>
							<td>${alist.id}</td>
							<td>${alist.adminname}</td>
							<td>${alist.adminmobilenumber}</td>
							<td><a href="/deleteadmin/${alist.id}"><button
										type="button" class="btn btn-primary">Delete</button></a> 
										<a href="/editadmin/${alist.id}"><button type="button"
										class="btn btn-secondary">Edit</button></a></td>
						</tr>
					</c:forEach>
				</thead>
			</table>
		</div>
	</fm:form>
</body>
</html>