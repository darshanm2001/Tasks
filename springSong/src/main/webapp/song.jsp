<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<style>
        body {
            background-color: #f8f9fa; /* Light Gray background color */
            font-family: Arial, sans-serif; /* Use a common sans-serif font */
            margin: 20px;
        }

        .container {
            background-color: #ffffff; /* White container background */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        .design {
            margin-bottom: 15px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"],
        select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        button {
            padding: 10px 20px;
            background-color: #28a745; /* Green button color */
            color: #fff; /* White text color */
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #218838; /* Darker green on hover */
        }
    </style>
<meta charset="ISO-8859-1">
<title>X-workz ODC</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Xworkz</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
      </ul>  
    </div>
  </div>
</nav>
<span style='color:red;'>
<c:forEach var="objectErrors" items="${errors}"> ${objectErrors.defaultMessage}<br></c:forEach>
</span>
  <span>${dto}</span>

<form action="music" class="container" method="post">
    <div class="design">
        <label for="name">Name</label><br>
        <input type="text" name="name" id="name" placeholder="Enter name" value="${dto.name}">
    </div><br>
    <div class="design">
        <label for="singer">Singer</label><br>
        <input type="text" name="singer" id="singer" placeholder="Enter singer" value="${dto.singer}">
    </div><br>
    <div class="design">
        <label for="composer">Composer</label><br>
        <input type="text" name="composer" id="composer" placeholder="Enter composer"value="${dto.composer}">
    </div><br>
    <div class="design">
        <label for="duration">Duration</label><br>
        <input type="text" name="duration" id="duration" placeholder="Enter duration"value="${dto.duration}">
    </div><br>
    <div class="design">
        <label for="album">Album</label><br>
        <input type="text" name="album" id="album" placeholder="Enter album"value="${dto.album}">
    </div><br>
    <div class="design">
        <label for="language">Language</label><br>
        <select class="form-control" id="language" name="language">
    <option selected value=" ">Selected</option>
      <option value="Kannada" <c:if test="${dto.language=='Kannada'}">selected="selected"</c:if>>Kannada</option>
      <option value="English" <c:if test="${dto.language=='English'}">selected="selected"</c:if>>English</option>
       <option value="Hindi" <c:if test="${dto.language=='Hindi'}">selected="selected"</c:if>>Hindi</option>
      <option value="Tamil"<c:if test="${dto.language=='Tamil'}">selected="selected"</c:if>>Tamil</option>
        <option value="Marati" <c:if test="${dto.language=='Marati'}">selected="selected"</c:if>>Marati</option>
    </select>
    </div><br>
    <div class="design">
        <label for="releaseDate">Release Date</label><br>
        <input type="text" name="releaseDate" id="releaseDate" placeholder="Select release date"value="${dto.releaseDate}">
    </div><br>
    <div class="design">
        <label for="lyricist">Lyricist</label><br>
        <input type="text" name="lyricist" id="lyricist" placeholder="Enter lyricist"value="${dto.lyricist}">
    </div><br>
    <div class="design">
        <label for="producer">Producer</label><br>
        <input type="text" name="producer" id="producer" placeholder="Enter producer"value="${dto.producer}">
    </div><br>
    <div class="design">
        <label for="director">Director</label><br>
        <input type="text" name="director" id="director" placeholder="Enter director"value="${dto.director}">
    </div><br>
    <div class="design">
        <button type="submit" class="btn btn-success" value="send">Send</button>
    </div>
</form>
</body>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
 
</html>