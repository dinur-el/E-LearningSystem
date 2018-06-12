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
 * Servlet implementation class AddCourseServlet
 */
@WebServlet("/AddCourseServlet")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
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
		
		String name=(request.getParameter("name"));
		String category=(request.getParameter("category"));
		String lecturer=(request.getParameter("lecturer"));
		String description=(request.getParameter("description"));
		
		course.setName(name);
		course.setCategory(category);
		course.setLecturerId(lecturer);
		course.setDescription(description);
		System.out.println(name);
		System.out.println(category);
		System.out.println(lecturer);
		
		ICourseService iCourseService = new CourseServiceImpl();
		iCourseService.addCourse(course);

		request.setAttribute("course", course);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminHome.jsp");
		dispatcher.forward(request, response);
	}

}
