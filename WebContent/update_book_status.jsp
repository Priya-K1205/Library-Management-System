<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


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
	
<b>ENTER BOOK ID TO UPDATE STATUS..</b>
<form action="Update_BookStatus">
<br>

<br>
ENTER BOOK ID  : <input type = "number" name = "status_book_id">
<br>
ENETER STATUS  : <input type = "text" name = "status_book_status">

<br>
<br>

	      <input type="submit" value="UPDATE">
	</form>
	<br>
<form action="Logout">
	      <input type="submit" value="Logout">
	</form>

</body>
</html>