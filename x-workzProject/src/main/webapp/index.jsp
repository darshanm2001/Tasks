<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>X-workz</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
   
</head>
<body>
   <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">
            <img src="logo.png" width="100" height="40" class="d-inline-block align-top" alt="Logo">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="home.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="aboutUs.jsp">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="gallery.jsp">Gallery</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact.jsp">Contact</a>
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

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   
    <form action="form" class="container" method="post" onclick="return validate()">
<span id="valid"></span>
<h1>Personal details</h1>
<div class="mb-3">
  <label class="form-label">Name :</label>
  <p id="userName"/>
  <div>
  <input type="text" id="name" placeholder="Name" name="name" onchange="handleName()">
</div>
</div>
<div class="mb-3">
  <label for="mobileNo" class="form-label">Mobile No :</label>
   <p id="phoneNo"/>
  <div>
  <input type="number"  id="mobile" placeholder="Mobile Number" name="mobile" onchange="handleMobile()">
</div>
</div>
<div class="mb-3">
  <label for="email" class="form-label">Email :</label>
   <p id="emailId"/>
  <div>
  <input type="email"  id="email" placeholder="Email" name="email" onchange="handleEmail()">
</div>
</div>
<div class="mb-3">
  <label for="dob" class="form-label">DOB :</label>
   <p id="birth"/>
  <div>
  <input type="date"  id="date" placeholder="DOB" name="dob" onchange="handleDate()">
</div>
</div>



 
<div class="dropdown">
<p id="place"/>
Location :<div><select name="location" id="location" onchange="handleLocation()">
  <option>location</option>
  <option>Banglore</option>
  <option>Mysore</option>
  <option>Shimoga</option>
  <option>Chikkamagaluru</option>
  </select>
</div>
</div>
</div>

<div class="mb-3">
  <label for="password" class="form-label">Password :</label>
   <p id="userPwd"/>
  <div>
  <input type="password"  id="password" placeholder="Password" name="password" onchange="handlePassword()">
</div>
</div>

<div class="mb-3">
  <label for="confirmPassword" class="form-label">Confirm Password :</label>
   <p id="userPwd"/>
  <div>
  <input type="password"  id="confirmPassword" placeholder="Confirm Password" name="confirmPassword" onchange="handlePassword()">
</div>
</div>
<div>
<p id="robot"/>
   <div class="g-recaptcha" data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" name="captcha" onchange="handleRobot()"></div>
</div>

<div><input type="submit" value="Submit" class="btn btn-success"
id="button"/>
<input type="submit" value="Cancel" class="btn btn-danger"
id="button"/> </div>

<div class="card-footer text-body-secondary">
    copyright@2023
  </div>
</form>
<script type="text/javascript">

function handleName(){
var name=document.getElementById("name").value;
var button=document.getElementById("button");
if(name.length>3 && name.length<30){
document.getElementById("userName").innerHTML = "<span style='color:blue'>Name is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("userName").innerHTML = "<span style='color:red'>Please enter Valid name</span>";
button.setAttribute("disabled", "");
return;
}
}

function handleMobile(){
var mobile=document.getElementById("mobile").value;
var button=document.getElementById("button");
if(mobile >1000000000 && mobile<9999999999){
document.getElementById("phoneNo").innerHTML = "<span style='color:blue'>Mobile number is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("phoneNo").innerHTML = "<span style='color:red'>Please enter Valid mobile number</span>";
button.setAttribute("disabled", "");
return;
}
}

function handleDate(){

var date=document.getElementById("date").value;
var button=document.getElementById("button");
if(date !== " "){
document.getElementById("birth").innerHTML = "<span style='color:blue'>date is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("birth").innerHTML = "<span style='color:red'>Please enter Valid date</span>";
button.setAttribute("disabled", "");
return;
}
}

function handleLocation() {
var location = document.getElementById("location");
console.log(location.value)
var button = document.getElementById("button");

if (location.value === 'location') {
document.getElementById("place").innerHTML = "<span style='color:red'>Please Select Valid Option</span>";
button.setAttribute("disabled", "");
} else {
button.removeAttribute("disabled");
return;
}
}

function handleEmail() {
var email = document.getElementById("email").value;
var button = document.getElementById("button");
if (email.length>3  && email.length<40 ) {
document.getElementById("emailId").innerHTML = "<span style='color:blue'>email is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("emailId").innerHTML = "<span style='color:red'>Please enter Valid email</span>";
button.setAttribute("disabled", "");
return;
}
}

function handlePassword(){
var password=document.getElementById("password").value;
var confirmPassword=document.getElementById("confirmPassword").value;
var button=document.getElementById("button");
if(password.length>=8 && password.length<15 && confirmPassword===password){
document.getElementById("userPwd").innerHTML = "<span style='color:blue'>password is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("userPwd").innerHTML = "<span style='color:red'>Please enter Valid password</span>";
button.setAttribute("disabled", "");
return;
}
}



function validate(){
var name=document.getElementById("name").value;
var mobile=document.getElementById("mobile").value;
var location = document.getElementById("location").value;
var email = document.getElementById("email").value;
var password=document.getElementById("password").value;
var confirmPassword=document.getElementById("confirmPassword").value;
var robot=document.getElementById("captcha").value;
var button=document.getElementById("button");
if(name.length>3 && name.length<30 && mobile >1000000000 && mobile<9999999999 && email.length>3 && email.length<40 && date !== " " &&
location.value === 'location' && email.length<40 && password.length>=8 && password.length<15 && confirmPassword===password && robot===true){
document.getElementById("valid").innerHTML = "<span style='color:blue'>info is valid</span>";
button.removeAttribute("disabled");
} else {
document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid info</span>";
button.setAttribute("disabled", "");
return;
}
}

</script>
   </body>


</html>