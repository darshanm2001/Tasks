<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-red bg-white">
        <a class="navbar-brand" href="#">
            <img src="xworkz.png" width="100" height="40" class="d-inline-block align-top" alt="Logo">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
               
               
            </ul>
        </div>
       
        <!-- Search Box -->
        <form class="form-inline">
            <input class="form-control mr-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
        </form>

        <li class="nav-item">
                    <a class="nav-link" href="profile.jsp">Profile</a>
                </li>
        </a>
    </nav>
<h1>Information</h1>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<h2>Name=${name}</h2>
<h2>MobileNumber=${mobileNumber}</h2>
<h2>Email=${email}</h2>
<h2>Password=${password}</h2>
<h2>Confirm Password=${confirmPassword}</h2>
<h2>DOB=${dob}</h2>
<h2>Location=${location}</h2>
</body>
</html>