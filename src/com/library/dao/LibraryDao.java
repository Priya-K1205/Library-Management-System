package com.library.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibraryDao {
	public boolean check(String uname, String pass)
	{
		String url = "jdbc:mysql://localhost:3306/library";
		String username = "root";
		String password = "#priya@12";
		
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement st = con.prepareStatement("select * from Login where uname = ? and pass = ?;");
				st.setString(1,uname);
				st.setString(2,pass);
				ResultSet rs = st.executeQuery();
				if(rs.next())
				{
					return true;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
 		return false;
	}
}
