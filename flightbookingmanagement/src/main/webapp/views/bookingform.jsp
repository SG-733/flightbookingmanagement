<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Booking Form</h1>

<form action="/handlebookingform" method="post">
	Passenger Name:<input type="text" name="passengerName"/><br>
	Seat No:<input type="text" name="seatNumber"><br>
	FlightNo:<input type="text" name="flightNumber"/><br>
	
	<input type="submit" value="Submit">

</form>
</body>
</html>