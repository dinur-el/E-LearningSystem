package com.oop.studentServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Student;
import com.oop.service.IStudentService;
import com.oop.service.StudentServiceImpl;

/**
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		Student student = new Student();
		String studentID = request.getParameter("studentID");	
		student.setID(studentID);
		student.setName(request.getParameter("studentName"));
		student.setEmail(request.getParameter("emailAddress"));
		student.setUsername(request.getParameter("username"));
		student.setPassword(request.getParameter("password"));
		
		IStudentService iStudentService = new StudentServiceImpl();
		iStudentService.updateStudent(studentID, student);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListStudents.jsp");
		dispatcher.forward(request, response);
	}

}
