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
 * Servlet implementation class GetLecturerServlet
 */
@WebServlet("/GetLecturerServlet")
public class GetLecturerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetLecturerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

 		String lecturerID = request.getParameter("lecturerID");			
		ILecturerService iLecturerService = new LecturerServiceImpl();
		Lecturer lecturer = iLecturerService.getLecturerByID(lecturerID);

		request.setAttribute("lecturer", lecturer);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateLectuer.jsp");
		dispatcher.forward(request, response);
	}

}
