<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/html/header.html"%>
	<form action="/Amazon/Controller" method="get">
		<h3>Enter values to create new Category</h3>
		Customer Name : <input type="text" name="name"><br>
		User Id (Login) : <input type="text" name="uname"><br>
		Password : <input type="password" name="pword"><br>
		Confirm Password : <input type="password" name="pword"><br><br>
		Address : <br>
		Street : <input type="text" name="street"><br>
		City:<input type="text" name="city"><br>
		State : <input type="text" name="state"><br>
		Zip Code : <input type="text" name="zip"><br><br>
		Telephone:<input type="text" name="phone"><br>
	email : <input type="text" name="email"><br>
		Credit Card No : <input type="text" name="ccno"><br>
		valid date:<input type="text" name="vdate"><br>
		<input type="hidden" name="action" value="createNewCustomer"><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>