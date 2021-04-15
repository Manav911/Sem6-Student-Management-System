<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty List</title>

<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

   

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style3.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
	<link href="/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
	
	 <!-- Vendor CSS-->
    <link href="/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">
    
     <!-- Jquery JS-->
     
    <script src="/vendor/jquery/jquery.min.js"></script>
    
	
    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" ></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"></script>

</head>
</head>
</head>
<body>
<h1 align="center">FACULTY  LIST</h1>                
<fm:form modelAttribute="fst" name="/FacultyList" >
  
  <div class="w3-table w3-blue">
  <div style="display: flex;justify-content: space-between; margin: 0px 20px">
   
   <div class="rbutton"><a href="/home"><button class="btn btn--radius-2 btn btn-danger" type="button">Back</button></a></div>
  	</div>
    <table class="table table-striped mt-3">
    <tbody>
      
        <thead align="center" title="faculty List">
          <tr>
            <th scope="col">FACULTY ID</th>
            <th scope="col"> NAME</th>
            <th scope="col">SUBJECT</th>
            <th scope="col">OPERATIONS</th>
          </tr>
           <c:forEach items="${fst}" var="fst">
       <tr>
       	   <td>${fst.facultyid}</td>
            <td>${fst.facultyname}</td>
           <td>${fst.subject}</td>  
           <td><a href="/deletefaculty/${fst.facultyid}"><button type="button" class="btn btn-primary">Delete</button></a>
           <a href="/editfaculty/${fst.facultyid}" ><button type="button" class="btn btn-secondary">Edit</button></a></td> 
       </tr>
       </c:forEach>
        </thead>
      </table>
    </div>
</fm:form>  
</body>
</html>