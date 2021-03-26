package com.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.View_BookDao;
import com.library.model.Books;


@WebServlet("/View_Book")
public class View_Book extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		View_BookDao dao = new View_BookDao();
		ArrayList<Books> Book = new ArrayList<Books>();
		Book = dao.viewBooks();
		
		PrintWriter out = response.getWriter();
		out.println("<TABLE BORDER><TR><TH>BOOK ID<TH>BOOK NAME <TH>BOOK AUTHOR <TH> BOOK GENRE <TH> BOOK STATUS</TR>");
		
		for(Books i: Book)
		{
			out.println("<TR ALIGN=RIGHT><TD>"+ i.getBook_Id() + "<TD>" + i.getBook_Name() +"<TD>" + i.getBook_Author()+"<TD>"+i.getBook_Genre()+"<TD>"+i.getBook_Status());
			
		}
		out.println("</TABLE>");
		
		
	}

}
