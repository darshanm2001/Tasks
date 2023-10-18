<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
<style type="text/css">
.sim{
    color: green;
    text-align: center;
}
.uno{
    text-align: center;  
}
.address{
    text-align: center;
}
.click{
    text-align: center;
    padding-left: 690px;
}
</style>
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
<li class="nav-item"><a class="nav-link active"
aria-current="page" href="product.jsp">Product</a></li>
</nav>
<h1 class="uno">Product Details.. </h1>
<h1>Name=${name}</h1>
<h1>Type=${type}</h1>
<h1>Price=${price}</h1>
<h1>Brand=${brand}</h1>
<h1>Quantity=${quantity}</h1>
<h1>Description=${description}</h1>
<h1>Total=${total}</h1>
    <h2 class="sim">Product details sents succesfully</h2>
     
</body>
</html>
   
</body>
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
crossorigin="anonymous"></script>
</html>