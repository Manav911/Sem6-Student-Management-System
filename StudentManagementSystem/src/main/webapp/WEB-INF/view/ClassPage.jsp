<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add New Class</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="/ClassPage/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ClassPage/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/ClassPage/css/util.css">
<link rel="stylesheet" type="text/css" href="/ClassPage/css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">
				<form:form class="login100-form validate-form flex-sb flex-w"
					method="POST" action="saveClass" modelAttribute="classdata">
					<form:hidden path="classid" />
					<span class="login100-form-title p-b-32"> Class Information
					</span>
					<span class="txt1 p-b-15"> <b>Class Name</b>
					</span>
					<div class="wrap-input100 validate-input m-b-36"
						data-validate="Class Name is required">
						<form:input class="input100" type="text" name="classname"
							path="classname" />
						<span class="focus-input100"></span>
					</div>

					<span class="txt1 p-b-15"> <b>Class Standard</b>
					</span>
					<div class="wrap-input100 validate-input m-b-36"
						data-validate="Class Standard is required">
						<form:select class="input100" path="classstandard">
							<c:forEach items="${standard}" var="st">
								<option>${st.standard}</option>
							</c:forEach>
						</form:select>
						<span class="focus-input100"></span>
					</div>
					<div class="container-login100-form-btn">
						<c:if test="${empty id}">
							<button class="login100-form-btn" onclick="this.form.action='/saveClass';">Save</button>
						</c:if>
						<c:if test="${not empty id}">
							<button class="login100-form-btn" onclick="this.form.action='/faculty/saveClass/${id}';">Save</button>
						</c:if>
						
						<c:if test="${empty id}">
							<a href="/loadClassList"><button type="button" class="login100-form-btn">Back</button></a>
						</c:if>
						
						<c:if test="${not empty id}">
							<a href="/faculty/loadClassList/${id}"><button type="button" class="login100-form-btn">Back</button></a>
						</c:if>
					</div>

				</form:form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/bootstrap/js/popper.js"></script>
	<script src="/ClassPage/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/daterangepicker/moment.min.js"></script>
	<script src="/ClassPage/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="/ClassPage/js/main.js"></script>

</body>
</html>