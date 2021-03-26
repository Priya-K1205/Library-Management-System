package com.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.Edit_BookDao;




@WebServlet("/Edit_Book")
public class Edit_Book extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		String book_id = request.getParameter("edit_book_id");
		String book_name = request.getParameter("edit_book_name");
		String book_author = request.getParameter("edit_book_author");
		String book_genre = request.getParameter("edit_book_genre");
		
		Edit_BookDao dao = new Edit_BookDao();
		
		boolean state;
		state = dao.editBooks(book_id, book_name, book_author, book_genre);
		if(state)
		{
			out.println("Book Edited Successfully..!");
			response.sendRedirect("home.jsp");
		}
		else
		{
			out.println("Please Try Again.");
		}
	}

	

}
