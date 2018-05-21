package com.oop.adminServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Student;
import com.oop.model.User;
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		IAdminService iAdminService = new AdminServiceImpl();
		String loginValue = iAdminService.login(username, password);
		User student = new Student();
		
		//request.setAttribute("student", student);
		Cookie ck=new Cookie("username",username);//creating cookie object  
		response.addCookie(ck);//adding cookie in the response  
		ck.setMaxAge(5);
		
		if(loginValue=="student") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/StudentHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="lecturer") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/LecturerHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="admin") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/AdminHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else {
			//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListStudents.jsp");
			//dispatcher.forward(request, response);
		}
	}

}
