<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%> 
  <!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>View Attendance</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="/Attendance/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="/Attendance/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="/Attendance/css/main.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
        <div class="wrapper wrapper--w960">
            <div class="card card-2">
                <div class="card-heading"></div>
                
                <div class="card-body">
				
				
					<c:url var="gotolist" value="/gotolist"/>
						<c:url var="waytolist" value="/waytolist"/>
                    <h2 class="title">Attendance Information</h2>
                   <%--  <form:form method="POST"  name="studentattendance"  modelAttribute="attendence"> --%>
       				<form:form  modelAttribute="student" name="student">
       					<div class="input-group">
                            <form:input class="input--style-2" readonly="true" type="text" placeholder="Name"  path="studentid"/>
                        </div>
                        
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-2 js-datepicker" type="date" id="date1" placeholder="Select Start Date" name="startdate"/>
                                    <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                </div>
                            </div>
                                <label class="input--style-2">To</label>
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-2 js-datepicker" type="date" id="date2" placeholder="Select End Date" name="enddate"/>
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                        </div>
                        <div class="row row-space">
                        	
                            <div class="col-2">
                               <div class="card">
                                    <div class="card-body">
                                    <!--   <h5 class="input--style-2">Present Days</h5>
                                     --><!--   <p class="input--style-2">
                                          <input class="input--style-2" type="text" placeholder="Present Count" name="presentcount" />
                                      </p> -->
                                 <%--   <a href ="/gotolist/${student.studentid}/<%=date1%>"><button type="button" class="btn btn--radius btn--green">View</button></a>
                                   --%>
                                  <%--   <a href = "javascript:;" onclick = "this.href='/gotolist/${student.studentid}/?startdate=' + document.getElementById('date1').value" /? enddate=' + document.getElementById('date2').value><button type="button" class="btn btn--radius btn--green">View</button></a>  
                                   --%><%--   <a href ="/gotolist/${student.studentid}"><button type="button" class="btn btn--radius btn--green">View</button></a>
                                    --%>
   <%-- <a href="/gotolist/${student.studentid}"><button type="button" class="btn btn--radius btn--green">PresentsList</button></a>
    --%>   
    <a href="" onclick="gotolist()" class="btn btn--radius btn--green" id="myList">Present</a>                              
                                   </div>
                                  </div>
                            </div>	
                            
                            <div class="col-2">
                                <div class="card">
                                    <div class="card-body">
                                  <!--     <h5 class="input--style-2">Absent Days</h5>
                                      <p class="input--style-2">      
                                  --><!--            <input class="input--style-2" type="text" placeholder="Present Count" name="absentcount">
       -->    <%-- <a href="/waytolist/${student.studentid}"><button type="button" class="btn btn--radius btn--green">AbsentList</button></a>
               --%>      
               	<a href="" onclick="waytolist()" class="btn btn--radius btn--green" id="absentList">Absent</a>                              
    
                                </div>
                                  </div> 
                            </div>
                        </div>
                       </form:form>
                </div>
            </div>
        </div>
    </div>
    <!-- Jquery JS-->
    <script src="/Attendance/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="/Attendance/vendor/select2/select2.min.js"></script>
    <script src="/Attendance/vendor/datepicker/moment.min.js"></script>
    <script src="/Attendance/vendor/datepicker/daterangepicker.js"></script>
    <script src="/Attendance/js/global.js"></script>
		
</body>
</html>