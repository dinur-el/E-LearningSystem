<%@page import="com.oop.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.oop.service.StudentServiceImpl"%>
<%@page import="com.oop.service.IStudentService"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "Employee.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Learning</title>
</head>
<body>
	<h3>List of Students</h3>
	SLIIT Employee Management App for OOP jsp servlet.
	<br>
	<br>
	  <div align="left">
		<table border="1" cellpadding="12">
		 <caption><h2>List of Students</h2></caption>
		 <a href="homeView.jsp">Add Student</a>
		  <tr>
                <th>Student ID</th>		
                <th>Student Name</th>
                <th>Address</th>
                <th>Select</th>
            </tr>
            <%
            IStudentService iStudentService = new StudentServiceImpl();
			ArrayList<Student> arrayList = iStudentService.getStudents();
			
			for(Student student : arrayList){
			%>
			 <tr>
				<td> <%=student.getID() %> </td>
				<td> <%=student.getName() %> </td>
				<td> <%=student.getEmail() %> </td>
				<td> 
				<form method="POST" action="GetStudentServlet">
				<input type="hidden" name="studentID" value="<%=student.getID()%>"/>
				 <input type="submit" value= "Select Student" class="select-button" /> 
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