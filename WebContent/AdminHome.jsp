<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Admin Page</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">E-Learning</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <div class="row">
        <div class="col-md-8 col-xs-12 col-md-offset-2">

            <h3>Admin <br /> <small>Options</small></h3>

            <br />

            <!-- a row of course details -- 3 courses -->
            <div class="row">

                <div class="col-xs-4">
                    <a href="/WEB-INF/views/addCourse.jsp">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Add a new Course</h3>
                            </div>
                            <div class="panel-heading">
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-xs-4">
                    <a href="/WEB-INF/views//addLecturer.jsp">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Add a new Lecturer</h3>
                            </div>
                            <div class="panel-heading">
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-xs-4">
                    <a href="/ListStudents.jsp">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Student List</h3>
                            </div>
                            <div class="panel-heading">
                            </div>
                        </div>
                    </a>
                </div>
                
       
            </div>


            <div class="row">

                <div class="col-xs-4">
                    <a href="#">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Course List</h3>
                            </div>
                            <div class="panel-heading">
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-xs-4">
                    <a href="#">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Lecturer List</h3>
                            </div>
                            <div class="panel-heading">
                            </div>
                        </div>
                    </a>
                </div>
                

            </div>

           
    </div>

</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>