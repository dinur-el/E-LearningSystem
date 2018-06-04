<%@ page contentType="application/pdf"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="net.sf.jasperreports.engine.*"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.FileNotFoundException"%>
<%@ page import="java.io.InputStream"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.SQLException"%> 


<%
	Connection conn = null;
	
	try{
		//Connecting to the MySQL database
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?user=root&password=");
		
		//Loading Jasper Report File from Local file system
		String jrxmlFile = session.getServletContext().getRealPath("Student_Grades.jrxml");
		InputStream input = new FileInputStream(new File(jrxmlFile));
		
		//Generating the report
		JasperReport jasperReport = JasperCompileManager.compileReport(input);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
				
		//Exporting the report as a PDF
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
				
		response.getOutputStream().flush();
		response.getOutputStream().close();
		
	} 
	catch(Exception e){
		e.printStackTrace();
	} 
	finally{
		if(conn != null){
			conn.close();
		}
	}
%>