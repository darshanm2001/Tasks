<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>

<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="DaysSuccess.jsp">Home</a></li>
			</div>
		</div>
	</nav>
	<h1>Add Days Here.............</h1>
	<form action="day.jsp">

		
			<div class="col">
				<label for="Date" class="form-label">Date</label>
				<input type="text" class="form-control" placeholder="Enter"
					aria-label="Date" name="date">
			</div>
			<div class="col">
			<label for="Month" class="form-label">Month</label>
				<input type="text" class="form-control" placeholder="Enter"
					aria-label="Month" name="month">
			
			<div class="col">
			<label for="Year" class="form-label">Year</label>
				<input type="text" class="form-control" placeholder="Enter"
					aria-label="Year" name="yaer">
			</div>
			<div class="col">
			<label for="Day" class="form-label">Day</label>
				<input type="text" class="form-control" placeholder="Enter"
					aria-label="Day" name="day">
			

			

			<input type="submit" value="Send" class="btn btn-primary">
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

</body>
</html>