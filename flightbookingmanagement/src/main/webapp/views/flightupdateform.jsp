<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/updateinfo" method="post">
        <input type="hidden" name="id" value="${id}">
        
       
        <div>
            <label for="origin">Origin:</label>
            <input type="text" id="origin" name="origin"  required>
        </div>
        
        <div>
            <label for="exp">Destination:</label>
            <input type="text" id="destination" name="destination"  required>
        </div>
        
        <button type="submit">Update Flight</button>
</form>
</body>
</html>