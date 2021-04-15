<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags-->
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Title Page-->
<title>Faculty Information</title>

<!-- Icons font CSS-->
<link
	href="/NewStudent/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link
	href="/NewStudent/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="/NewStudent/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="/NewStudent/vendor/datepicker/daterangepicker.css"
	rel="stylesheet" media="all">

<!-- Jquery JS-->

<script src="/NewStudent/vendor/jquery/jquery.min.js"></script>
<!-- Main CSS-->
<link href="/NewStudent/css/main.css" rel="stylesheet" media="all">
</head>
<body>

	<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
		<div class="wrapper wrapper--w790">
			<div class="card card-5">
				<div class="card-heading">
					<c:if test="${empty id}">
						<h2 class="title">Faculty Register</h2>
					</c:if>
				</div>

				<div class="card-body">
					<form:form action="/savefaculty" name="faculty" method="post"
						modelAttribute="faculty" onsubmit="return validation()">
						<form:hidden path="facultyid" />
						<div class="form-row">
							<div class="name">Faculty Name</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" path="facultyname"  />
								</div>
							</div>
						</div>

						<div class="form-row">
							<div class="name">Subject</div>
							<div class="value">
								<div class="input-group">
									<div class="rs-select2 js-select-simple select--no-search">
										<form:select name="subject" path="subject">
											<c:forEach items="${subject}" var="st">
												<option>${st.subname}</option>
											</c:forEach>
										</form:select>
										<div class="select-dropdown"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Phone</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" type="text"
										path="mobilenumber"></form:input>
								</div>
							</div>
						</div>


						<div class="form-row">
							<div class="name">Email</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" type="email" path="email"></form:input>
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Address</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" path="address" />
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Birth Date</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" type="date" path="bdate" />
								</div>
							</div>
						</div>

						<div class="form-row p-t-20">
							<label class="label label--block">Gender</label>
							<div class="p-t-15">
								<label class="radio-container m-r-55">Male <form:radiobutton
										checked="checked" path="gender" value="Male"></form:radiobutton>
									<span class="checkmark"></span>
								</label> <label class="radio-container">Female <form:radiobutton
										path="gender" value="Female"></form:radiobutton> <span
									class="checkmark"></span>
								</label>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Password</div>
							<div class="value">
								<div class="input-group">
									<form:input class="input--style-5" type="password"
										path="password" />
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Confirm Password</div>
							<div class="value">
								<div class="input-group">
									 <input name = "repassword" class="input--style-5" type="password"/>
								</div>
							</div>
						</div>
						<div></div>
						<c:if test="${empty id}">
							<form:button class="btn btn--radius-2 btn--red" type="submit"
								name="action">Register</form:button>
						</c:if>


						<a href="/home"> <form:button
								class="btn btn--radius-2 btn--red" type="button">Back</form:button></a>
					</form:form>

				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="/NewStudent/js/studentregistration.js"></script>
	<!-- Jquery JS-->
	<script src="/NewStudent/vendor/jquery/jquery.min.js"></script>

	<!-- Vendor JS-->
	<script src="/NewStudent/vendor/select2/select2.min.js"></script>
	<script src="/NewStudent/vendor/datepicker/moment.min.js"></script>
	<script src="/NewStudent/vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="/NewStudent/js/global.js"></script>
	<script type="text/javascript" src="/Faculty/js/facultyRegi.js"></script>
</body>
</html>