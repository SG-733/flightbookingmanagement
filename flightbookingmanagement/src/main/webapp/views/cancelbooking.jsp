<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Cancel booking by Id</h1>
<form action="cancelbookingbyid" method="get">
		<div>
			<p>Enter Booking id to Cancel</p>
			<input type="number" name="bookingId"/>
		</div>
		<input type="submit" value="Cancel Booking"/>
	</form>
</body>
</html>