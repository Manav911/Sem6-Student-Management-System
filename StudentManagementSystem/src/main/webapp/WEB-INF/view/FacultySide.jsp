<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset="ISO-8859-1">
<title>Faculty Side</title>
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="/NewStudent/css/style3.css">
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>

</head>
<body>

	<div class="wrapper">
		<!-- Sidebar  -->
		<nav id="sidebar">
			<div id="dismiss">
				<i class="fas fa-arrow-left"></i>
			</div>

			<div class="sidebar-header">
				<h3>Faculty</h3>
			</div>

			<ul class="list-unstyled components">
				<li><a href="/faculty/loadHomePage/${id}">Home</a></li>
				<li><a href="/faculty/getlist/${id}">Student</a></li>
				<!-- <li><a href="#facultySubmenu" data-toggle="collapse"
					aria-expanded="false">Faculty</a>
					<ul class="collapse list-unstyled" id="facultySubmenu">

						<li><a href="/addfaculty">Faculty</a></li>
						<li><a href="/findlist">Faculty List</a></li>

					</ul></li> -->

				<li><a href="/faculty/AttFilter/${id}">Attendance</a>
				<li><a href="/faculty/loadAssignmentList/${id}">Assignment</a></li>
				<li><a href="/faculty/loadSubjectList/${id}">Subject</a></li>
				<li><a href="/faculty/loadStandardList/${id}">Standard</a></li>
				<li><a href="/faculty/loadClassList/${id}">Class</a></li>
				<li><a href="/loadExamList">Exam</a></li>
				<!-- <li><a href="/listadmin">Administrator</a></li> -->
			</ul>
		</nav>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-info">
						<i class="fas fa-align-left"></i> <span>Menu</span>
					</button>
					<button class="btn btn-dark d-inline-block d-lg-none ml-auto"
						type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fas fa-align-justify"></i>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="nav navbar-nav ml-auto">

							<li class="nav-item"><a class="nav-link" href="/Login">Logout</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<div id="carouselExampleSlidesOnly" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100" src="/im1.png" alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="/im2.jpg" alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="/im3.jpeg" alt="Third slide">
					</div>
				</div>
			</div>
			<div class="cd">
				<div class="row mt-4">
					<div class="col-sm-10 col-md-8 col-lg-4" style="margin-top: 20px;">
						<div class="card"
							style="width: 100%; background-color: lightskyblue;">
							<div class="card-body">
								<h5 class="card-title">Admin</h5>
								<p class="card-text">
									Total Number Of Admin Are : <label>${admin}</label>
								</p>
								
							</div>
						</div>
					</div>
					<div class="col-sm-10 col-md-8 col-lg-4" style="margin-top: 20px;">
						<div class="card"
							style="width: 100%; background-color: lightskyblue;">
							<!-- <img class="card-img-top" src="..." alt="Card image cap"> -->
							<div class="card-body">
								<h5 class="card-title">Faculty</h5>
								<p class="card-text">
									Total Number Of Faculty Are : <label>${faculty}</label>
								</p>
								
							</div>
						</div>
					</div>
					<div class="col-sm-10 col-md-8 col-lg-4" style="margin-top: 20px;">
						<div class="card"
							style="width: 100%; background-color: lightskyblue;">
							<div class="card-body">
								<h5 class="card-title">Student</h5>
								<p class="card-text">
									Total Number Of Student Are : <label>${student}</label>
								</p>
								
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="footer"
				style="background-color: black; height: 50px; margin-top: 10px">
				<p>copy 2020 all Rights are reserved</p>
			</div>
		</div>
	</div>

	<!--  <div class="overlay"></div> -->

	<!-- jQuery CDN - Slim version (=without AJAX) -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<!-- Popper.JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<!-- Bootstrap JS -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<!-- jQuery Custom Scroller CDN -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#sidebar").mCustomScrollbar({
				theme : "minimal"
			});

			$('#dismiss, .overlay').on('click', function() {
				$('#sidebar').removeClass('active');
				$('.overlay').removeClass('active');
			});

			$('#sidebarCollapse').on('click', function() {
				$('#sidebar').addClass('active');
				$('.overlay').addClass('active');
				$('.collapse.in').toggleClass('in');
				$('a[aria-expanded=true]').attr('aria-expanded', 'false');
			});
		});
	</script>
</body>
</html>