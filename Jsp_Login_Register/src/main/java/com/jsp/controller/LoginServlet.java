package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.StudentDetails;

public class LoginServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String un = request.getParameter("username");
        String pw = request.getParameter("password");

        if (un.equals("admin") && pw.equals("admin")) {
            response.sendRedirect("Login_success.jsp");
            return;
        } else {
            response.sendRedirect("error.jsp");
            return;
        }
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Servlet");

		String type = request.getParameter("type");

		if (type.equals("getDetails")) {

			StudentDetails stuDetails = new StudentDetails(0, 0, type, type);

			stuDetails.getStudentDetails();

			request.setAttribute("StuList", stuDetails.getStudentDetails());

			request.getRequestDispatcher("studentDetails.jsp").forward(request, response);
		}
	}
}
