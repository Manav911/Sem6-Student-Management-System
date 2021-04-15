<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">

<!-- Title Page-->
<title>Admin Registration</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- Icons font CSS-->
<link
	href="/Admin/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="/Admin/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="/Admin/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="/Admin/vendor/datepicker/daterangepicker.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="/Admin/css/main.css" rel="stylesheet" media="all">
</head>

<body>
	<div class="page-wrapper bg-blue p-t-100 p-b-100 font-robo">
		<div class="wrapper wrapper--w680">
			<div class="card card-1">
				<div class="card-heading"></div>
				<div class="card-body">

					<h2 class="title">Admin Registration</h2>

					<form:form method="post" action="/saveadmin" modelAttribute="admin"
						name="admin" onsubmit="return validation()">
						<form:hidden path="id" />
						<div class="input-group">
							<form:input class="input--style-1" type="text" path="adminname"
								name="adminname" placeholder="Name" />
						</div>
						<div class="row row-space">
							<div class="col-6">
								<div class="input-group">
									<form:input class="input--style-1" type="email"
										path="adminemail" name="adminemail" placeholder="E-Mail" />
								</div>
							</div>
							<div class="col-6">
								<div class="input-group">
									<div class="rs-select2 js-select-simple select--no-search">
										<form:select path="admingender" name="admingender">
											<option disabled="disabled" selected="selected">Gender</option>
											<option>Male</option>
											<option>Female</option>
											<option>Other</option>
										</form:select>
										<div class="select-dropdown"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="input-group">
							<div class="row-space">
								<form:input class="input--style-1" type="mobile"
									name="adminmobilenumber" placeholder="Mobile Number"
									path="adminmobilenumber" />
							</div>
						</div>

						<div class="input-group">
							<div class="row-space">

								<form:input class="input--style-1" type="password"
									name="adminpassword" placeholder="Password"
									path="adminpassword" />

							</div>
						</div>

						<c:if test="${empty id}">
							<div class="input-group">
								<div class="row-space">

									<input class="input--style-1" type="password"
										placeholder="Re-Enter Password" name="repassword" />

								</div>
							</div>
						</c:if>
						<div class="p-t-20">
							<button class="btn btn--radius-2 btn btn-danger text-white"
								style="height: 50px; width: 150px;" type="submit">SUBMIT</button>
							<a href="/listadmin"><button class="btn btn--radius-2 btn btn-danger text-white"
								style="height: 50px; width: 150px; margin-left: 30
								px;" type="button">BACK</button></a>

						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="/Admin/vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="/Admin/vendor/select2/select2.min.js"></script>
	<script src="/Admin/vendor/datepicker/moment.min.js"></script>
	<script src="/Admin/vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="/Admin/js/global.js"></script>
	<script src="/Admin/js/adminregi.js"></script>

</body>

</html>
