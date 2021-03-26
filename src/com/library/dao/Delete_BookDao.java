package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_BookDao {
	public boolean deleteBooks(String b_id)
	{
	String url = "jdbc:mysql://localhost:3306/library";
	String username = "root";
	String password = "#priya@12";
	
	//String status = "Avail";
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("DELETE FROM  Books WHERE BOOK_ID = ? ;");
			st.setString(1,b_id);
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
