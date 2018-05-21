<%@page import="com.oop.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
    <link href="css/login.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="login">
    <div class="container">

        <div class="col-lg-8 col-lg-offset-2 login-box" >

            <div class="col-lg-6 right-box">
                <h1>Update Student</h1>
                
                <%Student student = (Student) request.getAttribute("student");%>
				
				<form method="POST" action="UpdateStudentServlet">
                <div class="form">

                    <div class="form-group">
                        <label for="studentName">Name </label>
                        <input type="text" name="studentName" class="form-control" value="<%=student.getName()%>">
                    </div>

                    <div class="form-group">
                        <label for="emailAddress">Email</label>
                        <input type="email" name="emailAddress" class="form-control" value="<%=student.getEmail()%>">
                    </div>
                    
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" name="username" class="form-control" value="<%=student.getUsername()%>">
                    </div>

                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" name="password" class="form-control" value="<%=student.getPassword()%>">
                    </div>


                    <div class="login-button">
                        <button class="btn btn-success">Update</button>
                    </div>

                    <br />
                    <br />

                </div>
                </form>

            </div>  <!-- right-box -->

            <div class="col-lg-6 left-box">
                <h1>Update Student</h1>
                <br>
            </div>

        </div> <!--col-lg-8-->

    </div>
</div>

	
</body>
</html>