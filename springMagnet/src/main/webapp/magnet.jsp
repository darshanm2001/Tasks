<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student</title>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Xworkz</a>
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
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
<body>
<span style='color:red';>${errors}</span>
<c:forEach var="objectErrors" items="${errors}"> ${objectErrors.defaultMessage}<br></c:forEach>

 <form action="push" method="post" >

    <div class="col">
      <label for="strength">Strength</label>
      <input type="number" class="form-control" name="strength" id="strength" placeholder="Strength" value="${dto.strength}">
    </div>
    <div class="form-group">
    <label for="color">Field</label>
    <select class="form-control" id="color" name="color">
    <option selected value=" ">Selected</option>
      <option value="blue" <c:if test="${dto.color=='blue'}">selected="selected"</c:if>>Blue</option>
      <option value="red" <c:if test="${dto.color=='red'}">selected="selected"</c:if>>Red</option>
      <option value="green" <c:if test="${dto.color=='green'}">selected="selected"</c:if>>Green</option>
      <option value="black" <c:if test="${dto.color=='black'}">selected="selected"</c:if>>Black</option>
      <option value="yellow" <c:if test="${dto.color=='yellow'}">selected="selected"</c:if>>Yellow</option>    
      <option value="grey" <c:if test="${dto.color=='grey'}">selected="selected"</c:if>>Greyy</option>         
        <option value="orange" <c:if test="${dto.color=='orange'}">selected="selected"</c:if>>Orange</option>         
     </select>
  </div><br>
    <div class="col">
      <label for="shape">Shape</label>
      <input type="text" class="form-control" name="shape" id="shape" placeholder="Enter shape type" value="${dto.shape}">
    </div>
	   <div class="row">
    <div class="col">
      <label for="material">Material</label>
      <input type="text" class="form-control" name="material" id="material" placeholder="Enter material name" value="${dto.material}">
    </div>
    <div class="col">
    <label for="weight">Weight</label>
    <input type="number" class="form-control" name="weight" id="weight" placeholder="Enter weight" value="${dto.weight}" >
    </div><br>
   <button type="submit" value="save" class="btn btn-success">Submit</button>
   </div>
</form>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</html>