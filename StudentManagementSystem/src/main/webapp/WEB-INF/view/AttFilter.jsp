<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<!-- Title Page-->
<title>Attendance</title>

<!-- Icons font CSS-->
<link
	href="/AttFilter/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="/AttFilter/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="/AttFilter/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="/AttFilter/vendor/datepicker/daterangepicker.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="/AttFilter/css/main.css" rel="stylesheet" media="all">
</head>

<body>
	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Attendance</h2>
					<form:form method="GET" modelAttribute="AttFilter" name="AttFilter"
						action="/attendance" onsubmit="return validation()">

						<div class="input-group">
							<label class="label"><b>Standard</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="subject" path="standard">
									<c:forEach items="${standard}" var="st">
										<option>${st.standard}</option>
									</c:forEach>

								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="input-group">
							<label class="label"><b>Class</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="subject" path="classname">
									<c:forEach items="${class}" var="cs">
										<option>${cs.classname}</option>
									</c:forEach>
								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="input-group">
							<label class="label"><b>Attendance Date</b></label>
							<form:input type="date" path="date" name="date"></form:input>
						</div>
						<div class="p-t-15">
							<c:if test="${empty id}">
								<a href="/attendance"><form:button
										class="btn btn--radius-2 btn--blue">Submit</form:button></a>
							</c:if>
							<c:if test="${not empty id}">
								<a href="/faculty/attendance/${id}"><form:button
										class="btn btn--radius-2 btn--blue">Submit</form:button></a>
							</c:if>
							<c:if test="${empty id}">
								<a href="/home"><button class="btn btn--radius-2 btn--blue"
										type="button">Back</button></a>
							</c:if>
							<c:if test="${not empty id}">
								<a href="/faculty/loadHomePage/${id}"><button class="btn btn--radius-2 btn--blue"
										type="button">Back</button></a>
							</c:if>

						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="/AttFilter/vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="/AttFilter/vendor/select2/select2.min.js"></script>
	<script src="/AttFilter/vendor/datepicker/moment.min.js"></script>
	<script src="/AttFilter/vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="/AttFilter/js/global.js"></script>
	<script type="text/javascript" src="/AttFilter/js/filtervalidation.js"></script>

</body>

</html>
<!-- end document-->