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
<b>VIEW BOOK STATUS HERE..</b>
<br>
<br>
<form action="View_BookStatus">
	      <input type="submit" value="VIEW STATUS">
	</form>

<form action="Logout">
	      <input type="submit" value="Logout">
	</form>
	
</body>
</html>