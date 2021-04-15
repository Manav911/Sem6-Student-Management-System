<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Student Management System</title>

  <!-- Bootstrap core CSS -->
  <link href="/StudentSide/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="StudentSide/css/small-business.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Student Management System</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  

  <div class="container">
	  <form:form action="/checkprofile/{email}" name="student" method="post" modelAttribute="student">
       <form:form action="/getId/{email}" name="student" method="post" modelAttribute="student">
        <form:hidden path="studentid"/>
    <!-- Heading Row -->
    <div class="row align-items-center my-5">
      <div class="col-lg-7">
        <img class="img-fluid rounded mb-4 mb-lg-0" src="D:\student.jpg" alt="">
      </div>
      <!-- /.col-lg-8 -->
      <div class="col-lg-5">
        <div class="card" style="width: 18rem">
         
          <div class="card-body">
            <h5 class="card-title">Student Profile</h5>
          </div>
         	<ul class="list-group list-group-flush">
    		<li class="list-group-item">Student ID<form:input type="readonly" path="studentid" readonly="true"/></li>
            <li class="list-group-item">Student Name<form:input type="readonly" path="studentname" readonly="true"/></li>
            <li class="list-group-item">Standard <form:input path="standard" readonly="true"/></li>
            <li class="list-group-item">Address / City<form:input  path="address" readonly="true"/></li>
          	<li class="list-group-item">Birth Date<form:input type="readonly" readonly="true" path="bdate"/></li>
            <li class="list-group-item">E-Mail ID<form:input name="email" path="email" readonly="true"/></li>
            <li class="list-group-item">Mobile Number<form:input readonly="true" path="mobilenumber"/></li>
   		  </ul>
         
          <div class="card-body">
            <a href="#" class="card-link">View Attendance</a>
            <a href="#" class="card-link">View  Profile</a>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
    </div>
    <!-- /.row -->

    <!-- Call to Action Well -->
    <div class="card text-white bg-secondary my-5 py-4 text-center">
      <div class="card-body">
        <p class="text-white m-0">Important Notification</p>
      </div>
    </div>

    <!-- Content Row -->
    <div class="row">
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">Student Assignment</h2>
            <p class="card-text">Select Your file and click on upload  for submit</p>
          </div>
          <div class="card-footer">
            <a href="/a" class="btn btn-primary btn-sm">Go For Submission</a>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
      <a>

      </a>
     
      <!-- /.col-md-4 -->
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">View Test Result</h2>
            <p class="card-text">You can view your Test Result Here
            </p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">View Result</a>
          </div>
        </div>
      </div>

       <!-- /.col-md-4 -->
       <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">View Attendance</h2>
            <p class="card-text">You can view your Attendance Here
            </p>
          </div>
          		<div class="card-footer">
           			 <a href="/seeprofile/${email}" type="submit" class="btn btn-primary btn-sm">View Attendance</a>
          		</div>
        </div>
      </div>
      <!-- /.col-md-4 -->

    </div>
    </form:form>
    <!-- /.row -->
 </form:form>
  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Student Management System</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="/StudentSide/vendor/jquery/jquery.min.js"></script>
  <script src="/StudentSide/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>

</html>
