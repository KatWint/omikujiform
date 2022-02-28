<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/submit" method="post">

		<label for="city">Enter the name of any city.</label><br>
 		 <input type="text" id="city" name="city"><br>
		<label for="name">Enter the name of any real person</label><br>
 		 <input type="text" id="name" name="name"><br> 
		<label for="hobby">Enter professional endeavor or hobby:</label><br>
 		 <input type="text" id="hobby" name="hobby"><br> 
		<label for="thing">Enter any type of living thing.</label><br>
 		 <input type="text" id="thing" name="thing"><br>
		<label for="comment">Say something nice to someone:</label><br>
 		 <input type="text" id="comment" name="comment"><br> 
 		 <p>Send and show a friend</p>
 		 <input type="submit" value="Submit">		 		 											 
	</form>
</body>
</html>