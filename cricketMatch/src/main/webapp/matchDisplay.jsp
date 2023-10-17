<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">

</head>
<style>
.container-fluid{
word-spacing:10px;
}
h3{
font-weight:bold;
color:green;
}

</style>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluids">
<a class="navbar-brand" href="index.jsp">Home</a>
</div>
<div class="container-fluid">
<a class="navbar-brand" href="match.jsp">Match</a>
</div>
</nav>

</body>
<h1><span style='color:red;'>Match details submitted successfully...</h1>
<h3>
Tournament Name: ${tournamentName}<br>
Hosting Country: ${hostingCountry}<br>
Match Date : ${matchDate}<br>
Team 1: ${team1}<br>
Team 2: ${team2};<br>
Team1 Captain Name: ${team1CaptainName}<br>
Team2 Captain Name: ${team2CaptainName}<br>
Umpire Name: ${umpireName}<br>
Stadium Name: ${stadiumName}<br>
Third Umpire Name: ${thirdUmpireName}<br>
Stadium Capacity:${stadiumCapacity}
</h3>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
