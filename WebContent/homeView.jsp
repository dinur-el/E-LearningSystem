<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Learning Web Application</title>
</head>
<body>
	<h2>Simple Login Web Application using JSP/Servlet</h2>
	
	<form method="POST" action="AddStudentServlet">
		<table>

			<tr>
				<td>Student Name</td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="emailAddress" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Student" class="add-button" /> </td>
			</tr>
			<tr>	
				<td colspan="2"><input type="reset" value="Reset" class="reset-button" /></td>
			</tr>
		</table>
	</form>

	<form method="POST" action="ListStudentServlet">
		<table>
			<tr>
				<td colspan="2"><input type="submit" value="List All Students" class="list-button" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>