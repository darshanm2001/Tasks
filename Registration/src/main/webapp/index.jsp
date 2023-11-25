<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>X-workz</title>
<link
href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
rel="stylesheet">
<!-- <script
src="https://www.google.com/recaptcha/api.js?render=reCAPTCHA_site_key"></script>

<script src="https://www.google.com/recaptcha/api.js"></script> -->


</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a class="navbar-brand" href="#"> <img src="logo.png"
width="100" height="40" class="d-inline-block align-top" alt="Logo">
</a>
<button class="navbar-toggler" type="button" data-toggle="collapse"
data-target="#navbarNav" aria-controls="navbarNav"
aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarNav">
<ul class="navbar-nav">
<li class="nav-item"><a class="nav-link" href="RegistrationDisplay.jsp">Registration Form</a>
</li>
</ul>
</div>
<form action="form" method="post" class="container" name="myForm"
onSubmit="return validateForm()">
<h1>Registrarion</h1>
<div class="design">
<label for="siNo">SiNo</label><br> <span id="siNoError"
style='color: red;'></span> <input onblur="nameValidaiton()"
type="text" name="siNo" class="form-control" id="siNo"
placeholder=" Enter siNo">
</div>
<br>  
<div class="design">
<label for="Fname">First Name</label><br> <span id="FnameError"
style='color: red;'></span> <input onblur="FnameValidaiton()"
type="text" name="Fname" class="form-control" id="Fname"
placeholder=" Enter Fname">
</div>
<br>  
<div class="design">
<label for="Lname">Last Name</label><br> <span id="LnameError"
style='color: red;'></span> <input onblur="LnameValidaiton()"
type="text" name="Lname" class="form-control" id="Lname"
placeholder=" Enter Lname">
</div>
<br>  
<div class="design">
<label for="Mname">Middle Name</label><br> <span id="MnameError"
style='color: red;'></span> <input onblur="LnameValidaiton()"
type="text" name="Mname" class="form-control" id="Mname"
placeholder=" Enter Mname">
</div>
<br>  
<div class="design">
<label for="Email">Email</label><br> <span id="EmailError"
style='color: red;'></span> <input type="Email" name="Email"
id="email" onchange="EmailValidation()"
onkeypress="EmailValidation()" placeholder=" Enter email">
</div>
<div class="gender">
<label for="gender">Gender</label><br> <span
id="genderError" style='color: red;'></span> <select id="gender"
class="form-select" name="gender" onchange="genderValidation()"
onkeypress="genderValidation()">
<option selected value="Choose...">Choose...</option>
<option>Male</option>
<option>Female</option>
</select>
</div>
<br>
<div class="design">
<label for="contactNo">Contact number</label><br> <span
id="contactNoError" style='color: red;'></span> <input
type="contactNo" name="contactNo" id="contactNo"
onchange="mobileNumberValidation()"
onkeypress="contactNoValidation()"
placeholder=" Enter Contact Number">
</div>
<br>
<div class="distic">
<label for="distic">Distic</label><br> <span
id="disticError" style='color: red;'></span> <select id="distic"
class="form-select" name="distic" onchange="disticValidation()"
onkeypress="disticrValidation()">
<option selected value="Choose...">Choose...</option>
<option>Dharwd</option>
<option>Davanagere</option>
<option>Kodagu</option>
<option>Mysuru</option>
<option>Vijayanagara</option>
<option>Bidar</option>
<option>Belagavi</option>
<option>Female</option>
<option>Mandya</option>
<option>Bengaluru</option>
</select>
</div>
<br>
<div class="design">
<label for="pincode">Pin Code</label><br> <span
id="pincodeError" style='color: red;'></span> <input
type="pincode" name="contactNo" id="pincode"
onchange="mobileNumberValidation()"
onkeypress="pincodeValidation()"
placeholder=" Enter Pin Code">
</div>
<br>

<div class="button">
<button value="Submit" type="Submit" class="btn btn-primary"
id="submitButton">Submit</button>
<button type="reset" value="Cancel"class="cancel" id="cancelButton">Cancel</button>
</div>


</form>
<script>

function emailValidation(){}
function siNoValidaiton()
{
    
var submitButton = document.getElementById("submitButton");

var siNo = document.getElementById('siNo').value;
console.log('siNo>>>',siNo);
if (siNo.length < 3 || siNo.length > 20) {

document.getElementById('siNoError').innerHTML='si No 2 and 5 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")

document.getElementById('siNoError').innerHTML='';
}
}
function FnameValidaiton()
{
    
var submitButton = document.getElementById("submitButton");

var Fname = document.getElementById('Fname').value;
console.log('Fname>>>',Fname);
if (Fname.length < 3 || Fname.length > 20) {

document.getElementById('FnameError').innerHTML='Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")

document.getElementById('FnameError').innerHTML='';
}
}

function LnameValidaiton()
{
    
var submitButton = document.getElementById("submitButton");

var Lname = document.getElementById('Lname').value;
console.log('Lname>>>',Lname);
if (Lname.length < 3 || Lname.length > 20) {

document.getElementById('LnameError').innerHTML='Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")

document.getElementById('FnameError').innerHTML='';
}
}
function MnameValidaiton()
{
    
var submitButton = document.getElementById("submitButton");

var Mname = document.getElementById('Fname').value;
console.log('Mname>>>',Mname);
if (Mname.length < 3 || Mname.length > 20) {

document.getElementById('MnameError').innerHTML='Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")

document.getElementById('MnameError').innerHTML='';
}
}
function contactNoValidation(){
    var submitButton = document.getElementById("submitButton");
    var contactNo = document.getElementById('contactNo').value;
    console.log(contactNo);
    if (contactNo<1000000000 || contactNo>9999999999) {
    document.getElementById("contactNoError").innerHTML = "Please enter the mobileNumber here.."
    return false;
    }
    else{
    document.getElementById("contactNoError").innerHTML ="";
    }
    }
function contactNoValidation(){
    var submitButton = document.getElementById("submitButton");
    var contactNo = document.getElementById('contactNo').value;
    console.log(contactNo);
    if (contactNo<1000000000 || contactNo>9999999999) {
    document.getElementById("contactNoError").innerHTML = "Please enter the mobileNumber here.."
    return false;
    }
    else{
    document.getElementById("contactNoError").innerHTML ="";
    }
    }
function pincodeValidation(){
    var submitButton = document.getElementById("submitButton");
    var pincode = document.getElementById('pincode').value;
    console.log(pincode);
    if (pincode<100000 || contactNo>999999) {
    document.getElementById("pincodeError").innerHTML = "Please enter the mobileNumber here.."
    return false;
    }
    else{
    document.getElementById("pincodeError").innerHTML ="";
    }
    }
    
    function validateForm() {
    console.log('validateForm>>>');
    var name = document.getElementById('siNo').value;
    var name = document.getElementById('Fname').value;
    var name = document.getElementById('Lname').value;
    var name = document.getElementById('Mname').value;
    var name = document.getElementById('contactNo').value;
    var name = document.getElementById('pincode').value;
    var name = document.getElementById('Email').value;
    console.log(response.length);
    console.log(contactNo.length);
    console.log(siNo.length);
    console.log(pincode.length);
    console.log(Email.length);
     if(Fname.length>3 && Fname.length<30 &&Fname.length>3 && Fname.length<30 && contactNo.length >9 && contactNo.length<11 && Email.length>3 && Email.length<40 && dob !== " " &&
location.value != '' && email.length<40 {
    console.log('im in if');
    
    
    </script>