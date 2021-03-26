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
import com.library.dao.View_BookStatusDao;
import com.library.model.Books;

@WebServlet("/View_BookStatus")
public class View_BookStatus extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		View_BookStatusDao dao = new View_BookStatusDao();
		ArrayList<Books> books = new ArrayList<Books>();
		books = dao.viewBookstatus();
		
		PrintWriter out = response.getWriter();
		out.println("<TABLE BORDER><TR><TH>BOOK ID <TH> BOOK STATUS</TR>");
		
		for(Books i: books)
		{
			out.println("<TR ALIGN=RIGHT><TD>"+ i.getBook_Id() +"<TD>"+i.getBook_Status());
			
		}
		out.println("</TABLE>");
	}

	
}
