<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>E-Learning</title>

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
            <a class="navbar-brand" href="#">Project name</a>
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

            <h3>Add Lecturer <br /> <small></small></h3>

            <br />

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Add / Edit Course</h3>
                </div>
                <div class="panel-body">

                    <form method="POST" action="AddLecturerServlet">

                        <div class="form-group">
                            <label for="lecturerName">Lecturer Name: </label>
                            <input class="form-control" type="text" name="lecturerName" required="required">
                        </div>

                        <div class="form-group">
                            <label for="educationLevel">Education Level: </label>
                            <input class="form-control" type="text" name="educationLevel" >
                        </div>

                        <div class="form-group">
                            <label for="emailAddress">Email: </label>
                            <input class="form-control" type="text" name="emailAddress" required="required" >
                        </div>
                        
                        <div class="form-group">
                            <label for="specialization">Specialization: </label>
                            <input class="form-control" type="text" name="specialization">
                        </div>

                        <div class="form-group">
                            <label for="username">Username: </label>
                            <input class="form-control" type="text" name="username" required="required">
                        </div>

                        <div class="form-group">
                            <label for="password">Password: </label>
                            <input class="form-control" type="password" name="password" required="required">
                        </div>

                        <button class="btn btn-block btn-primary">Add Lecturer</button>

                    </form>

                </div>
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