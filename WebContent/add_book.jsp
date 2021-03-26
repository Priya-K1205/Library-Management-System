<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >

<%
	    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");  
	    response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires","0");
	
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<h2 align = "center"><b>LIBRARY MANAGEMENT SYSTEM</b></h2>
	<br>
	Welcome ${username} !
	<br>
	<hr>
	<br>
<form action = "Add_Book" align ="center" >	
<div border="2px">
<h4><b>ENTER BOOK DETAILS TO ADD..</b></h4>
<br>
<br>
ENTER BOOK ID    :<input type="number" name = "add_book_id">
<br>
ENTER BOOK NAME  :<input type = "text" name = "add_book_name">
<br>
ENTER AUTHOR     :<input type = "text" name = "add_book_author">
<br>
ENTER GENRE      :<input type = "text" name = "add_book_genre">
<br>
<br>


<input type = "submit" value = "ADD">
</div>
</form>


	<br>

<form action="Logout" align = "center">
	      <input type="submit" value="Logout" >
	</form>

</body>
</html>