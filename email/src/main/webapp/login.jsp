<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">
<style>
.navbar-brand{
color:white;

}
.container-fluid{
background-color:blue;
}
.container{
max-width:500px;
margin: 0 auto;
padding :20px;
background-color:white;
border=radius:5px;
}

.btn{
background-color:red;
width:60%;
}
label{
font-weight:bold;
}
</style>
</head>
<body>
<nav class="navbar bg-body-tertiary">
<div class="container-fluid">
<a class="navbar-brand" href="index.jsp">Home</a>
</div>
</nav>


<form action="Attach" method="post" class="container"><h1>Login Page..</h1>
<h1><span style="color:red;">${errorMsg }</span><br></h1>

<div class="class">

<label class="conatiner">User Id  :</label>
<input type="text" placeholder="Enter the User Id" name="userId" >
</div>
<br>

<div class="conatiner">
<label>Password :</label>
<input type="password" placeholder="Enter the password" name="password">
</div>
<br>
<input type="submit" placeholder="login" class="btn">
</form>
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
crossorigin="anonymous"></script>
</body>
</html>