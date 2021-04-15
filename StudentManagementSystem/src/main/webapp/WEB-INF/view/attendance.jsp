<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="/NewStudent/css/style3.css">
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
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

<!-- Vendor JS-->
<script src="/NewStudent/vendor/select2/select2.min.js"></script>
<script src="/NewStudent/vendor/datepicker/moment.min.js"></script>
<script src="/NewStudent/vendor/datepicker/daterangepicker.js"></script>

<!-- Main CSS-->
<link href="/NewStudent/css/main.css" rel="stylesheet" media="all">
<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>
<title>Student Attendance</title>
</head>
<body>
	<h1 align="center">Student Attendance</h1>
	<fm:form modelAttribute="attendance" action="/saveAtt/${param.date}">
		<%-- <input type="hidden" name="standard" value="${standard}">
<input type="hidden" name="classname" value="${classname}">
<input type="hidden" name="date" value="${date}"> --%>
		<div class="w3-table w3-blue">

			<table class="table table-striped">

				<thead align="center" title="Student List">
					<tr>

						<th scope="col">Student ID</th>
						<th scope="col">Student name</th>
						<th scope="col">Standard</th>
						<th scope="col">Class</th>
						<th scope="col">Present</th>
						<th scope="col">Absent</th>
					</tr>
				</thead>
				<tbody align="center">
					<c:forEach items="${attendence.student}" var="cst"
						varStatus="status">
						<tr>
							<td><input name="student[${status.index}].studentid"
								value="${cst.studentid}" /></td>
							<td><input name="student[${status.index}].studentname"
								value="${cst.studentname}" /></td>
							<td><input name="student[${status.index}].standard"
								value="${cst.standard}" /></td>
							<td><input name="student[${status.index}].classname"
								value="${cst.classname}" /></td>

							<td><input type="checkbox" class="check_class" name="attendence" value="Present"   /></td>
							<td><input type="checkbox" class="check_class" name="attendence" value="Absent"  /></td>
							<%--    <a href="/saveAttendance/${cst.studentid}/${param.standard}/${param.classname}/${param.date}"><button type="button" id="btnOUs" class="btn btn-primary" >Present</button></a>
          <a href="/saveAttendanceOfAbsent/${cst.studentid}/${param.standard}/${param.classname}/${param.date}"><button type="button" class="btn btn-primary" >Absent</button></a> --%>


						</tr>
					</c:forEach>
				</tbody>

			</table>
			<script type="text/javascript" src="/Attendance/js/attcheckbox.js"></script>
		</div>
		<button class="btn btn--radius-2 btn btn-danger text-white"
			type="submit" style="margin: 0px 20px">SUBMIT</button>

	</fm:form>

</body>
</html>