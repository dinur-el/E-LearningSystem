package com.oop.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Student;
import com.oop.service.StudentServiceImpl;
import com.oop.service.IStudentService;
/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet(description = "servlet to add a student", urlPatterns = { "/AddStudentServlet" })
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		Student student = new Student();
		
		student.setName(request.getParameter("studentName"));
		student.setEmail(request.getParameter("emailAddress"));


		IStudentService iStudentService = new StudentServiceImpl();
		iStudentService.addStudent(student);

		request.setAttribute("student", student);
		//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
		//dispatcher.forward(request, response);
	}

}
