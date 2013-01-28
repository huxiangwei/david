package com.company.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bo.DemoBo;
import com.company.model.Student;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = "";
		String memo = "";
		int sex = 0;

		request.setCharacterEncoding("UTF-8");
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		if (request.getParameter("memo") != null) {
			memo = request.getParameter("memo");
		}
		if (request.getParameter("sex") != null) {
			sex = Integer.parseInt(request.getParameter("sex"));
		}
		Student s = new Student(name, sex, memo);
		DemoBo db = new DemoBo();

		db.insertStudent(s);
		response.setContentType("type=text/html; charset=utf-8");
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/ListStudent");
		requestDispatcher.forward(request, response);
	}

}
