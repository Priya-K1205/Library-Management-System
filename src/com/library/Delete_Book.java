package com.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.Delete_BookDao;




@WebServlet("/Delete_Book")
public class Delete_Book extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		String book_id = request.getParameter("del_book_id");
		
		
		Delete_BookDao dao = new Delete_BookDao();
		
		boolean state;
		state = dao.deleteBooks(book_id);
		if(state)
		{
			out.println("Book Deleted Successfully..!");
			response.sendRedirect("home.jsp");
		}
		else
		{
			out.println("Please Try Again.");
		}
	}

	

}
