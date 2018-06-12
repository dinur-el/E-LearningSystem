package com.oop.courseServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Course;
import com.oop.service.ICourseService;
import com.oop.service.CourseServiceImpl;

/**
 * Servlet implementation class UpdateCourseServlet
 */
@WebServlet("/UpdateCourseServlet")
public class UpdateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCourseServlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		Course course = new Course();
		String courseID = request.getParameter("courseID");	
		course.setID(courseID);
		course.setName(request.getParameter("courseName"));
		course.setCategory(request.getParameter("category"));
		course.setLecturerId(request.getParameter("lecturerId"));
		course.setDescription(request.getParameter("description"));
		
		ICourseService iCourseService = new CourseServiceImpl();
		iCourseService.updateCourse(courseID, course);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListCourse.jsp");
		dispatcher.forward(request, response);
	}

}
