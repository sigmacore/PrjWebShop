<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amazon.com</title>
</head>
<body>
	<%@ include file="/html/header.html"%>
	<form action="/Amazon/Controller" method="get">
		<h3>Enter values to create new Category</h3>
		Category Name : <input type="text" name="name"><br>
		Category Desc : <input type="text" name="desc"><br>
		Category Status:<input type="text" name="status"><br>
		<input type="hidden" name="action" value="createNewCategory"><br>
		<input type="submit" value="Create Category">
	</form>
</body>
</html>