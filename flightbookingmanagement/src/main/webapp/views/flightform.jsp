<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Flight Details</h1>
	<form action="/addflight" method="post">
		FlightNumber:<input type="text" name="flightNumber"/><br>
		Origin:<input type="text" name="origin"/><br>
		Destination:<input type="text" name="destination"/><br>
		
		<input type="submit" value="submit">
	
	</form>
	
	
</body>
</html>