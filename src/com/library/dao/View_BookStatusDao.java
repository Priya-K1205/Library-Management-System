package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.library.model.Books;

public class View_BookStatusDao {
	public ArrayList<Books> viewBookstatus()
	{
		ArrayList<Books> books = new ArrayList<Books>();
		
		String url = "jdbc:mysql://localhost:3306/library";
		String username = "root";
		String password = "#priya@12";
		
	
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("SELECT book_id, book_status FROM Books");
			ResultSet rs = st.executeQuery();
		    while(rs.next()){
		    	
		    	 Books book = new Books();
		    	 
		         book.setBook_Id(rs.getInt("book_id"));
		         book.setBook_Status(rs.getString("book_status"));

		         books.add(book);
		      }
		      rs.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		return books;
	}

}
