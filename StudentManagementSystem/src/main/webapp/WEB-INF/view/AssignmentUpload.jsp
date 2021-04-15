<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Title Page-->
<title>Assignment Details</title>

<!-- Icons font CSS-->
<link
	href="/AssignmentUpload/vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link
	href="/AssignmentUpload/vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">

<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="/AssignmentUpload/vendor/select2/select2.min.css"
	rel="stylesheet" media="all">
<link href="/AssignmentUpload/vendor/datepicker/daterangepicker.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="/AssignmentUpload/css/main.css" rel="stylesheet" media="all">
</head>

<body>
	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h3 class="title">Assignment Details</h3>
					<form:form method="POST" action="/UploadAssignment"
						modelAttribute="UploadAssignment" enctype="multipart/form-data" name="UploadAssignment" onsubmit="return validation()">

						<div class="col col-space">
							<div class="col-4">
								<div class="input-group">
									<label class="label"><b>Assignment Title</b></label>
									<form:input class="input--style-4" type="text" name="asstitle"
										path="asstitle"></form:input>
								</div>
							</div>
						</div>
						<div class="col col-space">
							<div class="col-4">
								<div class="input-group">
									<label class="label"><b>Assignment Description</b></label>
									<form:textarea rows="5" cols="76" name="assdescription"
										path="assdescription"></form:textarea>

								</div>
							</div>
						</div>
						<div class="input-group">
							<label class="label"><b>Given By</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="givenByName" path="givenbyname">
									<c:forEach items="${faculty}" var="fc">
										<option>${fc.facultyname}</option>
									</c:forEach>
								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="input-group">
							<label class="label"><b>Subject</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="subject" path="subject">
									<c:forEach items="${subject}" var="s">
										<option>${s.subname}</option>
									</c:forEach>
								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="input-group">

							<label class="label"><b>Class</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="classname" path="classname">
									<c:forEach items="${class}" var="cs">
										<option>${cs.classname}</option>
									</c:forEach>
								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="input-group">
							<label class="label"><b>Standard</b></label>
							<div class="rs-select2 js-select-simple select--no-search">
								<form:select name="standard" path="standard">
									<c:forEach items="${standard}" var="st">
										<option>${st.standard}</option>
									</c:forEach>
								</form:select>
								<div class="select-dropdown"></div>
							</div>
						</div>
						<div class="col col-space">
							<div class="col-4">
								<div class="input-group">
									<label class="label"><b>Assignment</b> </label> <input
										class="input--style-4" type="file" name="file">
								</div>
							</div>
						</div>
						<div class="p-t-15">
							<c:if test="${empty id}">
								<button class="btn btn--radius-2 btn--blue" type="submit"
									onclick="this.form.action='/UploadAssignment';">Submit</button>
							</c:if>
							<c:if test="${not empty id}">
								<button class="btn btn--radius-2 btn--blue" type="submit"
									onclick="this.form.action='/faculty/UploadAssignment/${id}';">Submit</button>
							</c:if>
							<c:if test="${empty id}">
							<a href="/loadAssignmentList"><button class="btn btn--radius-2 btn--blue" type="button">Back</button></a>
							</c:if>
							
							<c:if test="${not empty id}">
							<a href="/faculty/loadAssignmentList/${id}"><button class="btn btn--radius-2 btn--blue" type="button">Back</button></a>
							</c:if>
							
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="/AssignmentUpload/vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="/AssignmentUpload/vendor/select2/select2.min.js"></script>
	<script src="/AssignmentUpload/vendor/datepicker/moment.min.js"></script>
	<script src="/AssignmentUpload/vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="/AssignmentUpload/js/global.js"></script>
	<script src="/AssignmentUpload/js/upload.js"></script>


</body>

</html>
<!-- end document-->