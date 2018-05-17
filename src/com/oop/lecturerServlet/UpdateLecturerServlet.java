package com.oop.lecturerServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Lecturer;
import com.oop.service.ILecturerService;
import com.oop.service.LecturerServiceImpl;

/**
 * Servlet implementation class UpdateLecturerServlet
 */
@WebServlet("/UpdateLecturerServlet")
public class UpdateLecturerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLecturerServlet() {
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

		Lecturer lecturer = new Lecturer();
		String lecturerID = request.getParameter("lecturerID");	
		lecturer.setID(lecturerID);
		
		lecturer.setName(request.getParameter("lecturerName"));
		lecturer.setEmail(request.getParameter("emailAddress"));
		lecturer.setEducationLevel(request.getParameter("educationLevel"));
		lecturer.setSpecialization(request.getParameter("specialization"));
		lecturer.setUsername(request.getParameter("username"));
		lecturer.setPassword(request.getParameter("password"));
		
		ILecturerService iLecturerService = new LecturerServiceImpl();
		iLecturerService.updateLecturer(lecturerID, lecturer);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListLecturers.jsp");
		dispatcher.forward(request, response);
	}

}
