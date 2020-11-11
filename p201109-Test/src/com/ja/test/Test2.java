package com.ja.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 */
@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String v1 = request.getParameter("v1");
		System.out.println("v1 value : " + v1);
		String v2 = request.getParameter("v2");
		System.out.println("v2 value : " + v2);
		
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<h1>hello~</h1>");
		
		if(v1 == null) {
			response.getWriter().println("<h2>hello~~~~!!</h2>");
		}else {
			response.getWriter().println("v1 value : " + v1);
		}
		
		response.getWriter().println("<a href='./Test'>link test1</a>");
		
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
