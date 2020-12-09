<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1 >get One</h1>
	<form action="getOnePeople">
		<label>Enter your id:</label>
		<input type="text" name="id" /><br/>
		<input type="submit" /><br/>
	</form>
</div>
	<h1 >add One</h1>
	<form action="add-people">
		<label>Enter your name:</label>
		<input type="text" name="name" /><br/>
		<label>Enter your age:</label>
		<input type="number" name="age" /><br/>
		<input type="submit" /><br/>
	</form>
</body>
</html>