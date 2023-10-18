<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 
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
<li class="nav-item"><a class="nav-link" href="LoanApply.jsp">LoanApply</a>
<li class="nav-item"><a class="nav-link" href="LoanApplyDisplay.jsp">LoanApplyDisplay</a>
</li>
</ul>
</div>
</div>
</nav>
<form action="loan" method="post" class="container">
<h1>Loan Application</h1>
<div class="bank">
<label for="name">Name</label>
<input type="text" class="form-control" id="floatingInput" name="name" placeholder="Enter name">
</div>
<div class="bank">
<label for="amount">Amount</label>
<input type="number" class="form-control" id="floatingInput" name="amount" placeholder="Ex.10000000">
</div>
<div class="bank">
<label for="working">Working</label>
<input type="text" class="form-control" id="floatingInput" name="working" placeholder="Enter here">
</div>
<div class="bank">
<label for="interest">Interest</label>
<input type="number" class="form-control" id="floatingInput" name="interest" placeholder="Ex.10%">
</div>
<div class="bank">
<label for="surity">Surity</label>
<input type="text" class="form-control" id="floatingInput" name="surity" placeholder="Enter here">
</div>
<div class="bank">
<label for="company">Company</label>
<input type="text" class="form-control" id="floatingInput" name="company" placeholder="Company name" >
</div>
<div class="bank">
<label for="tenure">Loan Tenure</label>
<input type="number" class="form-control" id="floatingInput" name="loanTenure" placeholder="in years">
</div>
<div class="bank">
<label for="floatingInput">Loan Type</label>
<select class="form-select" name="type">
<option selected>Choose type</option>
<option>House Loan</option>
<option>Vehicle Loan</option>
<option>Student Loan</option>
<option>Agriculture Loan</option>
<option>Land Loan</option>
<option>Gold Loan</option>
</select>
</div>
<div>
<input type="checkbox" id="loanId" name="accept" value="Yes">
           <label for="vehicle1"> I accept terms and conditions </label>
           </div><br>
<input type="submit" value="Send" class="btn btn-primary">
   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
 
</body>
</html>