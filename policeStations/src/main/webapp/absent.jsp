<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">

</head>
<body>
<nav class="navbar bg-dark border-bottom border-body"
data-bs-theme="dark">
<div class="container-fluid">
<a class="navbar-brand" href="#">Navbar</a>
<button class="navbar-toggler" type="button"
data-bs-toggle="collapse" data-bs-target="#navbarNav"
aria-controls="navbarNav" aria-expanded="false"
aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarNav">
<ul class="navbar-nav">
<li class="nav-item"><a class="nav-link active"
aria-current="page" href="index.jsp">Home</a></li>
<li class="nav-item"><a class="nav-link" href="index.jsp">Absent</a>
</li>

<li class="nav-item"><a class="nav-link" href="displayabsent.jsp">Display</a></li>
</ul>
</div>
</div>
</nav>
<form action="darshan" method="POST" class="container">
<h2>Form</h2>
<label for="name" class="data">Name:</label> <input type="text"
id="name" name="name"><br> <label for="fromDate"
class="data">From Date:</label> <input type="date" id="fromDate"
name="fromDate"><br> <label for="toDate" class="data">From
Date:</label> <input type="date" id="toDate" name="toDate"><br>
<label for="reason">Reason:</label>
<textarea id="reason" name="reason" rows="4" cols="50">
</textarea>
<br> <label>Informed:</label> <br> <input type="radio"
id="informed" name="informed" value="yes"> <label>Yes</label>
<input type="radio" id="notInformed" name="informed" value="no">
<label>No</label> <br>
<input type="submit" value="Submit" class="btn btn-primary">

<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
crossorigin="anonymous"></script>
</body>
</html>