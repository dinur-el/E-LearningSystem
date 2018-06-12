package com.oop.adminServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Lecturer;
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
		
		IAdminService iAdminService = new AdminServiceImpl();
		String loginValue = iAdminService.login(username, password);
		
		Cookie ck=new Cookie("username",username);//creating cookie object  
		response.addCookie(ck);//adding cookie in the response  
		ck.setMaxAge(5);
		
		if(loginValue=="student") {
			Student student = new Student();
			student.setUsername(username);
			request.setAttribute("user", student);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/StudentHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="lecturer") {
			Lecturer lecturer = new Lecturer();
			lecturer.setUsername(username);
			request.setAttribute("user", lecturer);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/LecturerHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(loginValue=="admin") {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminHome.jsp");
			dispatcher.forward(request, response);
		}
		
		else {
			request.setCharacterEncoding("Invalid Username or Password");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.html");
			dispatcher.forward(request, response);
		}
	}

}
