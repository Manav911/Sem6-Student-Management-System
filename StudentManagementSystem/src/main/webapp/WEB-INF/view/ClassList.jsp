<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Class-List</title>

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="/Common/css/style3.css">

<!-- Scrollbar Custom CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
<link
	href="/Common/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="/Common/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="/Common/vendor/select2/select2.min.css" rel="stylesheet"
	media="all">
<link href="/Common/vendor/datepicker/daterangepicker.css"
	rel="stylesheet" media="all">

<!-- Jquery JS-->

<script src="/Common/vendor/jquery/jquery.min.js"></script>


<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>

<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>

</head>
<body>
	<h1 align="center">Class List</h1>
	<fm:form modelAttribute="classList" name="/classList">
		<div class="w3-table w3-blue">
			<div
				style="display: flex; justify-content: space-between; margin: 0px 20px">
				<div class="lbutton">
					<c:if test="${empty id}">
						<a href="/home"><button
								class="btn btn--radius-2 btn btn-danger" type="button">Back</button></a>
					</c:if>
					<c:if test="${not empty id}">
						<a href="/faculty/loadHomePage/${id}"><button
								class="btn btn--radius-2 btn btn-danger" type="button">Back</button></a>
					</c:if>
				</div>
				<div class="rbutton">
					<c:if test="${empty id}">
						<a href="/loadClassPage"><button
								class="btn btn--radius-2 btn btn-danger" type="button">New
								Class</button></a>
					</c:if>
					<c:if test="${not empty id}">
						<a href="/faculty/loadClassPage/${id}"><button
								class="btn btn--radius-2 btn btn-danger" type="button">New
								Class</button></a>
					</c:if>
				</div>
			</div>
			<table class="table table-striped mt-3">
				<tbody>
				<thead align="center" title="Class List">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Class Name</th>
						<th scope="col">Standard</th>
						<th scope="col">Operation</th>

					</tr>
					<c:forEach items="${classList}" var="cl">
						<tr>
							<td>${cl.classid}</td>
							<td>${cl.classname}</td>
							<td>${cl.classstandard}</td>
							<td><c:if test="${empty id}">
									<a href="/deleteClass/${cl.classid}"><button type="button"
											class="btn btn-primary">Delete</button></a>
								</c:if> <c:if test="${not empty id}">
									<a href="/faculty/deleteClass/${cl.classid}/${id}"><button type="button"
											class="btn btn-primary">Delete</button></a>
								</c:if></td>
						</tr>
					</c:forEach>
				</thead>
			</table>
		</div>
	</fm:form>
</body>
</html>