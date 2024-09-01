<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H2>Find a Booking by Id</H2>
	
	<form action="findbookingbyid" method="get">
	
		<div>
			<p>Enter Booking id to find</p>
			<input type="number" name="bookingId"/>
		</div>
		
		<input type="submit" value="Get Details"/>
	
	</form>

</body>
</html>