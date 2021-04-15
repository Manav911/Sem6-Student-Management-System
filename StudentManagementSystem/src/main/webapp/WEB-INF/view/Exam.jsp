  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <title>Examination</title>

    <!-- Icons font CSS-->
    <link href="exam/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="exam/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="exam/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="exam/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="exam/css/main.css" rel="stylesheet" media="all">
</head>

<body>

    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
               
                    <h2 class="title"><b>Examination</b></h2>
                   
                    <form:form method="POST" action = "/saveexam"  enctype="multipart/form-data" modelAttribute = "exam" onsubmit="return validation()">
                        <div class="col col-space">
                            <div class="col-8">
                                <div class="input-group">
                                    <label class="label"><b>Exam Name</b></label>
                                    <form:input class="input--style-4" type="text" path="examname"/>
                                </div>
                            </div>
                        </div>
                        <div class="col col-space">
                            <div class="col-8">
                                <div class="input-group">
                                    <label class="label"><b>Exam Date</b></label>
                                   <div class="form-row">
                            
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-5" type="date" path="examdate"/>
                                </div>
                            </div>
                        </div>	
                                </div>
                            </div>
                        </div>
                        <div class="input-group">
                            <label class="label"><b>Standard</b></label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <form:select path="standard">
                                  <c:forEach items="${standard}" var="st">
                                  <option>${st.standard}</option>
                                  </c:forEach>
                                </form:select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        <div class="col col-space">
                            <div class="col-8">
                                <div class="input-group">
                                    <label class="label"><b>Exam File</b></label>
                                    <div class="input-group-icon">
                                        <form:input  class="form-control"  type="file" path="" name="files" />
                                    </div>
                                </div>
                            </div> 
                        </div>

                        <div class="p-t-15">
                       
                            <form:button class="btn btn--radius-2 btn--blue" type="submit" name = "action">Submit</form:button>
                        
                        
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="/exam/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="/exam/vendor/select2/select2.min.js"></script>
    <script src="/exam/vendor/datepicker/moment.min.js"></script>
    <script src="/exam/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="/exam/js/global.js"></script>

</body>
</html>
