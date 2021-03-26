package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_BookStatusDao {
	public boolean editStatus(String b_id,String book_status)
	{
	String url = "jdbc:mysql://localhost:3306/library";
	String username = "root";
	String password = "#priya@12";
	
	
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("UPDATE Books  SET Book_status = ? WHERE Book_id = ?;");
			st.setString(1,book_status);
			st.setString(2, b_id);
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
