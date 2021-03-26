package com.library.model;

public class Books {
	private int book_id;
	private String book_name;
	private String book_author;
	private String book_genre;
	private String book_status;
	
	public Books() {
		super();
	}
	
	public Books(int book_id, String book_name, String book_author, String book_genre, String book_status) {
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_genre = book_genre;
		this.book_status = book_status;
	}
	
	public int getBook_Id()
	{
		return this.book_id;
	}
	public void setBook_Id(int book_id)
	{
		this.book_id = book_id;
	}
	
	public String getBook_Name()
	{
		return this.book_name;
	}
	public void setBook_Name(String book_name)
	{
		this.book_name = book_name;
	}
	
	public String getBook_Author()
	{
		return this.book_author;
	}
	public void setBook_Author(String book_author)
	{
		this.book_author = book_author;
	}
	
	public String getBook_Genre()
	{
		return this.book_genre;
	}
	public void setBook_Genre(String book_genre)
	{
		this.book_genre = book_genre;
	}
	
	public String getBook_Status()
	{
		return this.book_status;
	}
	public void setBook_Status(String book_status)
	{
		this.book_status = book_status;
	}
	
	

}
