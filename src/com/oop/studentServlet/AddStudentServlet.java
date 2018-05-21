package com.oop.studentServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		
		String msg="";
		Student student = new Student();
		
		String name=(request.getParameter("studentName"));
		String email=(request.getParameter("emailAddress"));
		String username=(request.getParameter("username"));
		String password=(request.getParameter("password"));
		String passConf=(request.getParameter("password_confirm"));
		
//		if(name==null) msg="student name is required\n";
//		if(email==null) msg+="email address is required\n";
//		if(username==null) msg+="username is required\n";
//		if(password==null) msg+="password is required\n";
//		if(passConf==null) msg+="password confirmation is required\n";
//		
//		if(msg=="") {
		
			student.setName(name);
			student.setEmail(email);
			student.setUsername(username);
			student.setPassword(password);
		
			IStudentService iStudentService = new StudentServiceImpl();
			iStudentService.addStudent(student);

		
			Cookie ck=new Cookie("username",username);//creating cookie object  
			response.addCookie(ck);//adding cookie in the response  
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/StudentHome.jsp");
			dispatcher.forward(request, response);
//		}
		
//		else {
//			out.println("");
//		}
	}

}
