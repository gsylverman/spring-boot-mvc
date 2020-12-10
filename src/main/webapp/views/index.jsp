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
	<h1>Get one person by id</h1>
	<form action="getOnePerson">
		<label>Enter your id:</label>
		<input type="text" name="id" /><br/>
		<input type="submit" /><br/>
	</form>
	<hr/>
</div>
<div>
	<h1>Get one person by name</h1>
	<form action="getOneByName">
		<label>Enter your name:</label>
		<input type="text" name="name" /><br/>
		<input type="submit" /><br/>
	</form>
	<hr/>
</div>
	<h1>Add one person</h1>
	<form action="add-person">
		<label>Enter your name:</label>
		<input type="text" name="name" /><br/>
		<label>Enter your age:</label>
		<input type="number" name="age" /><br/>
		<input type="submit" /><br/>
	</form>
	<hr/>
</body>
</html>