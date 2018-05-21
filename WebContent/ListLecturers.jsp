<%@page import="com.oop.model.Lecturer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.oop.service.LecturerServiceImpl"%>
<%@page import="com.oop.service.ILecturerService"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	
	  <div align="left">
		<table border="1" cellpadding="12">
		 <caption><h2>List of Lecturers</h2></caption>
		 
		  <tr>
                <th>Lecturer ID</th>		
                <th>Lecturer Name</th>
                <th>Education Level</th>
                <th>Email</th>
                <th>Specialization</th>
                <th>Username</th>
                <th>Password</th>
            </tr>
            <%
            ILecturerService iStudentService = new LecturerServiceImpl();
			ArrayList<Lecturer> arrayList = iStudentService.getLecturers();
			
			for(Lecturer lecturer : arrayList){
			%>
			 <tr>
				<td> <%=lecturer.getID() %> </td>
				<td> <%=lecturer.getName() %> </td>
				<td> <%=lecturer.getEducationLevel() %> </td>
				<td> <%=lecturer.getEmail() %> </td>
				<td> <%=lecturer.getSpecialization() %> </td>
				<td> <%=lecturer.getUsername() %> </td>
				<td> <%=lecturer.getPassword() %> </td>
				<td> 
				<form method="POST" action="GetLecturerServlet">
				<input type="hidden" name="lecturerID" value="<%=lecturer.getID()%>"/>
				 <input type="submit" value= "Update Lecturer" class="select-button" /> 
				 </form>
				 </td>	
				 <td> 
				<form method="POST" action="DeleteLecturerServlet">
				<input type="hidden" name="lecturerID" value="<%=lecturer.getID()%>"/>
				 <input type="submit" value= "Delete Lecturer" class="select-button" /> 
				 </form>
				 </td>	
				</tr>			
			<%	
			   }
            %>     
		</table>
		</div>
		
</body>
</html>