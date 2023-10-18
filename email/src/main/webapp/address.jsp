<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Home</a>
<h1>Welcome ,${userId}</h1>

<form action="AttachAddress" method="post">
<div>
<label>BuildingNo</label> <input type="text" placeholder="Number"
name="number"><br> 
<label>Street</label> <input type="text"
placeholder="Street" name="street"><br>
</div>
<div>
<label>State</label> <input type="text"
placeholder="Enter The State" name="state"><br> <label>Country</label>
<input type="text" placeholder="Country"><br>
</div>
<div>
<label>City </label> <input type="text" placeholder="Enter The City"
name="city"><br>
</div>
<br> <div>

<input type="submit" placeholder="save">
</div>
</form>
</body>
</html>
    