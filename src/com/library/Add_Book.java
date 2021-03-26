package com.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.Add_BookDao;


@WebServlet("/Add_Book")
public class Add_Book extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String book_id = request.getParameter("add_book_id");
		String book_name = request.getParameter("add_book_name");
		String book_author = request.getParameter("add_book_author");
		String book_genre = request.getParameter("add_book_genre");
		
		Add_BookDao dao = new Add_BookDao();
		
		System.out.println(book_id);
		System.out.println(book_name);
		
		boolean state;
		state = dao.addBooks(book_id, book_name, book_author, book_genre);
		if(state)
		{
			out.println("Book Added Successfully..!");
			response.sendRedirect("home.jsp");
		}
		else
		{
			out.println("Please Try Again.");
		}
		
		
	}

	

}
