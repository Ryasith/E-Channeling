<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach var="usr" items="${usrDetails}">
	
	<c:set var="id" value="${usr.id}"/>
	<c:set var="name" value="${usr.name}"/>
	<c:set var="email" value="${usr.email}"/>
	<c:set var="phone" value="${usr.phone}"/>
	<c:set var="gender" value="${usr.gender}"/>
	<c:set var="username" value="${usr.userName}"/>
	<c:set var="password" value="${usr.password}"/>
	<c:set var="age" value="${usr.age}"/>
	
	<tr>
		<td>Customer ID</td>
		<td>${usr.id}</td>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td>${usr.name}</td>
	</tr>
	<tr>
		<td>Customer Email</td>
		<td>${usr.email}</td>
	</tr>
	<tr>
		<td>Customer Phone</td>
		<td>${usr.phone}</td>
	</tr>
	<tr>
		<td>Customer Gender</td>
		<td>${usr.gender}</td>
	</tr>
	<tr>
		<td>Customer Username</td>
		<td>${usr.userName}</td>
	</tr>
	<tr>
		<td>Customer Age</td>
		<td>${usr.age}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updateuser.jsp" var="usrupdate">
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
		<c:param name="age" value="${age}"/>
	</c:url>
	
	<a href="${usrupdate}">
	<input type ="button" name ="update" value="Update My Data">
	</a>
	
</body>
</html>