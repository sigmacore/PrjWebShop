<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Amazon : Login</title>
</head>
<body>
	<%@ include file="/html/header.html"%>
	<form action="/Amazon/Controller">
	<h3>Login to Amazon</h3>
	<% String message = (String) request.getAttribute("errorMessage");
	if( message == null){ message = "";} %>
	<%= message %>
	<br>
		User Name <input type="text" maxlength="10" name="uname"><br>
		Password <input type="password" maxlength="10" name="pword"><br>
		<input type="hidden" name="action" value="login"><br>
		<input value="Login" type="submit">
	</form>


</body>
</html>