package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bo.DemoBo;
import com.company.model.Student;

/**
 * Servlet implementation class SelectStudent
 */
public class ListStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DemoBo db = new DemoBo ();
        List<Student> list = db.selectStudent();
        request.setCharacterEncoding("utf-8"); 
        request.setAttribute("list", list);
        response.setContentType("type=text/html; charset=utf-8");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/studentList.jsp");   
		requestDispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
	}

}
