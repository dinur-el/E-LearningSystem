package com.oop.adminServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oop.service.AdminServiceImpl;
import com.oop.service.IAdminService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		IAdminService iAdminService = new AdminServiceImpl();
		String loginValue = iAdminService.login(username, password);
		
		if(loginValue=="student") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/dashboard.html");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="lecturer") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListCourses.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="admin") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListCourses.jsp");
			dispatcher.forward(request, response);
			System.out.println("admin");
		}
		
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListStudents.jsp");
			dispatcher.forward(request, response);
		}
	}

}
