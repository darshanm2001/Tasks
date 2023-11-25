<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <ul class="navbar-nav">
<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
</li>
</head>
<style>
h2{
color:green;
}
</style>
<body>
<h1 style='color:yellow;'> Details submitted successfully..</h1>

<h2>ItemName: ${itemName}<br>
ItemPrice: ${itemPrice}<br>
Quantity: ${quantity}<br>
Discount: ${discount}<br>
GST: ${gst}<br>
ManufactureDate: ${manufactureDate}<br>
ExpireDate: ${expireDate}<br>
Total: ${total}<br>	</h2>
<h2 style='color:red;'>Current Date and Time :<%= new java.util.Date() %><br></h2>
Thank You


</body>

</html>

