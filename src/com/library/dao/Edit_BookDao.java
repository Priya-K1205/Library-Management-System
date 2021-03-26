package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Edit_BookDao {
	public boolean editBooks(String b_id,String b_name, String b_author, String b_genre)
	{
	String url = "jdbc:mysql://localhost:3306/library";
	String username = "root";
	String password = "#priya@12";
	
	//String status = "Avail";
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("UPDATE Books SET book_name = ?, book_author = ?, book_genre = ? WHERE book_id= ? ;");
			st.setString(1,b_name);
			st.setString(2,b_author);
			st.setString(3,b_genre);
			st.setString(4,b_id);
			
			st.executeUpdate();
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		return false;
	}

}
