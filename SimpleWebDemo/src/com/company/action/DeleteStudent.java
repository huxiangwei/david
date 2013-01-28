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
 * Servlet implementation class DeleteStudent
 */
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = 0;

		request.setCharacterEncoding("UTF-8");
		if (request.getParameter("id") != null) {
			id = Integer.parseInt(request.getParameter("id"));
		}
		DemoBo db = new DemoBo();

		db.deleteStudent(id);
		response.setContentType("type=text/html; charset=utf-8");
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/ListStudent");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
