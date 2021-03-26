package com.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.library.dao.Update_BookStatusDao;


@WebServlet("/Update_BookStatus")
public class Update_BookStatus extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		String book_id = request.getParameter("status_book_id");
		String book_status = request.getParameter("status_book_status");
		
		Update_BookStatusDao dao = new Update_BookStatusDao();
		
		boolean state;
		state = dao.editStatus(book_id, book_status);
		if(state)
		{
			out.println("Book Status updated Successfully..!");
			response.sendRedirect("home.jsp");
		}
		else
		{
			out.println("Please Try Again.");
		}
	}

	
}
