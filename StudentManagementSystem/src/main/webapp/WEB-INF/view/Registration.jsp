<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="/Ragistration/fonts/icomoon/style.css">

    <link rel="stylesheet" href="/Ragistration/css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/Ragistration/css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="/Ragistration/css/style.css">

    <title>Sign Up</title>
  </head>
  <body>
  <div class="content">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <img src="/Ragistration/images/undraw_remotely_2j6y.svg" alt="Image" class="img-fluid">
        </div>
        <div class="col-md-6 contents">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="mb-4">
              <h3>Sign Up</h3>
              
            </div>
            <form:form action="/NewRegistration" method="post" modelAttribute="Registration" name="Registration" onsubmit="return validation()">
            <form:hidden path="id"/>
              <div class="form-group first">
                <label for="username">User name</label>
                <form:input type="text" class="form-control" id="username" path="username"></form:input>

              </div>
              <div class="form-group">
                <label for="email">Email</label>
                <form:input type="email" class="form-control" id="email" path="email"></form:input>

              </div>
              <div class="form-group">
                <label for="password">Password</label>
                <form:input type="password" class="form-control" id="password" path="password"></form:input>
                
              </div>
              <div class="form-group last mb-4">
                <label for="re-password">Re-Type Password</label>
                <input type="password" class="form-control" id="re-password" name="repassword">
                
              </div>
              

              <input type="submit" value="Register" class="btn btn-block btn-primary">

             
            </form:form>
            </div>
          </div>
          
        </div>
        
      </div>
    </div>
  </div>
<script type="text/javascript" src="/Ragistration/js/passwordvalidate.js"></script>
  
    <script src="/Ragistration/js/jquery-3.3.1.min.js"></script>
    <script src="/Ragistration/js/popper.min.js"></script>
    <script src="/Ragistration/js/bootstrap.min.js"></script>
    <script src="/Ragistration/js/main.js"></script>
  </body>
</html>