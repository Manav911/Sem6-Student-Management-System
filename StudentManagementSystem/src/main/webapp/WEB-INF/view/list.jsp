<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>

<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>SMS</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style3.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>
</head>
</head>
<body>
  	<h1 align="center">Student List</h1>
	<fm:form modelAttribute="List" name="/list" action="/list">
  <div class="w3-table w3-blue">
  <div style="display: flex;justify-content: space-between; margin: 0px 20px">
   
   <div class="rbutton">
   <c:if test="${empty id}">
   <a href="/home"><button class="btn btn--radius-2 btn btn-danger" type="button">BACK</button></a>
   </c:if>
   <c:if test="${not empty id}">
   <a href="/faculty/loadHomePage/${id}"><button class="btn btn--radius-2 btn btn-danger" type="button">BACK</button></a>
   </c:if>
   
   </div>
   
  	</div>
    <table class="table table-striped mt-3">
    <tbody>
        <thead align="center" title="Student List">
          <tr>
            <th scope="col">Student ID</th>
            <th scope="col">Student Name</th>
            <th scope="col">Class name</th>
            <th scope="col">Standard</th>
            <th scope="col">Operation</th>
          </tr>
           <c:forEach items="${st}" var="st">
       <tr>
       	   <td>${st.studentid}</td>
            <td>${st.studentname}</td>
           <td>${st.classname}</td>
           <td>${st.standard}</td>  
           <c:if test="${empty id}">
           <td><a href="/delete/${st.studentid}"><button type="button" class="btn btn-primary">Delete</button></a></td>
           </c:if>
           <c:if test="${not empty id}">
           <td><a href="/faculty/delete/${st.studentid}/${id}"><button type="button" class="btn btn-primary">Delete</button></a></td>
           </c:if>
           
           <%-- <a href="/edit/${st.studentid}" ><button type="button" class="btn btn-secondary">Edit</button></a></td> --%> 
       </tr>
       </c:forEach>
        </thead>
      </table>
    </div>
</fm:form>

</body>
</html>