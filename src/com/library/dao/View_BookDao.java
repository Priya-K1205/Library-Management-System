package com.library.dao;

import java.sql.Connection;
import com.library.model.Books;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class View_BookDao {
	public ArrayList<Books> viewBooks()
	{
		
		ArrayList<Books> books = new ArrayList<Books>();
		
		
	    String url = "jdbc:mysql://localhost:3306/library";
	    String username = "root";
	    String password = "#priya@12";
	    
	
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("SELECT * FROM Books");
			ResultSet rs = st.executeQuery();
		    while(rs.next()){
		    	
		    	 Books book = new Books();
		    	 
		         book.setBook_Id(rs.getInt("book_id"));
		         book.setBook_Name(rs.getString("book_name"));
		         book.setBook_Author(rs.getString("book_author"));
		         book.setBook_Genre(rs.getString("book_genre"));
		         book.setBook_Status(rs.getString("book_status"));
		         
		         books.add(book);

		         /*System.out.println("ID :  " + id);
		         System.out.print(", BOOK NAME : " + book_name);
		         System.out.print(", BOOK AUTHOR : " + book_author);
		         System.out.print(", BOOK GENRE: " + book_genre);
		         System.out.print(", BOOK STATUS:" + book_status);
		         */
		         
		         
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
