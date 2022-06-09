<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String age = request.getParameter("age");
		
	%>

	<form action="#" method="post">
	Name <input type="text" name="name" value="<%= name %>"><br>
	Email <input type="text" name="email" value="<%= email %>"><br>
	Phone <input type="text" name="phone" value="<%= phone %>"><br>
	User Name <input type="text" name="uname" value="<%= username %>"><br>
	Password <input type="text" name="pass" value="<%= password %>"><br>
	Age <input type="text" name="age" value="<%= age %>"><br>
	
	<input type="submit" name="submit" value="Update My Data">
	
	</form>

</body>
</html>