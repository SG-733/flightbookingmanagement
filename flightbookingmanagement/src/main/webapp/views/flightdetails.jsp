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
<h1>Flight Details</h1>
<div>
	FlightId:${flight.id }<br>
	FlightNumber:${flight.flightNumber}<br>
	Origin:${flight.origin }<br>
	Destination:${flight.destination}<br>
</div>
</body>
</html>