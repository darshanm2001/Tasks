<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Match</title>
</head>
<style>
.container {
max-width: 100px;
margin: 0 auto;
padding: 20px;
background-color: #f5f5f5;
border-radius: 10px;
background-color: grey;
}

h1 {
text-align: center;
color: #333;
}

.design {
margin-bottom: 20px;
}

label {
font-weight: bold;
display: block;
margin-bottom: 5px;
color: #333;
}

input[type="text"], input[type="date"], select, input[type="number"] {
width: 100%;
padding: 10px;
border: 1px solid #ccc;
border-radius: 5px;
font-size: 16px;
}

select {
height: 40px;
}

.button {
text-align: center;
}

.btn-primary {
display: block;
background-color: red;
border: none;
padding: 10px;
font-size: 18px;
border-radius: 5px;
}

.btn-primary:hover {
background-color: green;
}

#tournamentNameError, #hostingCountryError, #team1Error, #team2Error,
#team1CaptainNameError, #team2CaptainNameError, #umpireNameError,
#thirdUmpireNameError, #stadiumNameError, #stadiumCapacityError {
font-size: 14px;
}
</style>

<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluid">
<a class="navbar-brand" href="index.jsp">Home</a>
</div>
</nav>

<form action="india" method="post" class="container" name="myForm"
onsubmit="return validateForm()">
<h1>Match details</h1>
<div class="design">
<label for="tournamentName"> Tournament Name </label><br> <span
id="tournamentNameError" style='color: red;'></span> <input
onblur="tournamentNameValidaiton()" type="text"
name="tournamentName" class="form-control" id="tournamentName"
placeholder=" Enter tournament name">
</div>
<br>
<div class="design">
<label for="hostingCountry">Hosting Country</label><span
id="hostingCountryError" style='color: red;'></span> <select
id="hostingCountry" class="form-select" name="hostingCountry"
onchange="hostingCountryValidation()">
<option selected value="Choose...">Choose...</option>
<!-- Added value attribute -->
<option value="India">India</option>
<option value="Pakistan">Pakistan</option>
<option value="Australia">Australia</option>
<option value="New Zealand">New Zealand</option>
<option value="South Africa">South Africa</option>
<option value="Netherlands">Netherlands</option>
<option value="Afghanistan">Afghanistan</option>
<option value="England">England</option>
<option value="Sri Lanka">Sri Lanka</option>
<option value="Bangladesh">Bangladesh</option>
</select>
</div>
<br>
<div class="design">
<label for="matchDate">Match date</label><br> <span
id="matchDateError" style='color: red;'></span> <input type="text"
name="matchDate" id="matchDate" onchange="matchDateValidation()"
onkeypress="matchDateValidation()">
</div>
<br>
<div class="team1">
<label for="team1">Team 1</label><br> <span id="team1Error"
style='color: red;'></span> <select id="team1" class="form-select"
name="team1" onchange="team1Validation()"
onkeypress="team1Validation()">
<option selected value="Choose...">Choose...</option>
<option>India</option>
<option>Pakistan</option>
<option>Australia</option>
<option>New Zealand</option>
<option>South Africa</option>
<option>Netherlands</option>
<option>Afghanistan</option>
<option>England</option>
<option>Sri Lanka</option>
<option>Bangladesh</option>
</select>
</div>
<br>
<div class="team2">
<label for="team1">Team 2</label> <span id="team2Error"
style='color: red;'></span><select id="team2" class="form-select"
name="team2" onchange="team2Validation()"
onkeypress="team2Validation()">
<option selected value="Choose...">Choose...</option>
<option>India</option>
<option>Pakistan</option>
<option>Australia</option>
<option>New Zealand</option>
<option>South Africa</option>
<option>Netherlands</option>
<option>Afghanistan</option>
<option>England</option>
<option>Sri Lanka</option>
<option>Bangladesh</option>
</select>
</div>
<br>
<div class="design">
<label for="team1CaptainName"> Team1 Captain Name </label><br> <span
id="team1CaptainNameError" style='color: red;'></span> <input
type="text" name="team1CaptainName" class="form-control"
id="team1CaptainName" placeholder=" Enter Team1 Captain Name"
onchange="team1CaptainNameValidation()"
onkeypress="team1CaptainNameValidation()">
</div>
<br>
<div class="design">
<label for="team2CaptainName"> Team2 Captain Name </label><br> <span
id="team2CaptainNameError" style='color: red;'></span> <input
type="text" name="team2CaptainName" class="form-control"
id="team2CaptainName" placeholder=" Enter Team2 Captain Name"
onchange="team2CaptainNameValidation()"
onkeypress="team2CaptainNameValidation()">
</div>
<br>
<div class="design">
<label for="umpireName">Umpire Name </label><br> <span
id="umpireNameError" style='color: red;'></span> <input type="text"
name="umpireName" class="form-control" id="umpireName"
placeholder="Enter Umpire Name" onchange="umpireNameValidation()"
onkeypress="umpireNameValidation()">
</div>
<br>
<div class="design">
<label for="thirdUmpireName">Third Umpire Name </label><br> <span
id="thirdUmpireNameError" style='color: red;'></span> <input
type="text" name="thirdUmpireName" class="form-control"
id="thirdUmpireName" placeholder="Enter Third Umpire Name"
onchange="thirdUmpireNameValidation()"
onkeypress="thirdUmpireNameValidation()">
</div>
<br>
<div class="design">
<label for="stadiumName">Stadium Name </label><br> <span
id="stadiumNameError" style='color: red;'></span> <input type="text"
name="stadiumName" class="form-control" id="stadiumName"
placeholder="Enter Stadium Name" onchange="stadiumNameValidation()"
onkeypress="stadiumNameValidation()">
</div>
<br>
<div class="design">
<label for="stadiumCapacity">Stadium Capacity </label><br> <span
id="stadiumCapacityError" style='color: red;'></span> <input
type="number" name="stadiumCapacity" class="form-control"
id="stadiumCapacity" placeholder="Ex: 1000000"
onchange="stadiumCapacityValidation()"
onkeypress="stadiumCapacityValidation()">
</div>
<br>
<div class="button">
<button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
</div>
</form>
<script>
function tournamentNameValidaiton()
{
var submitButton = document.getElementById("submitButton");

var tournamentName = document.getElementById('tournamentName').value;
console.log(tournamentName)
if (tournamentName.length < 3 || tournamentName.length > 20) {
//alert('Name must be between 3 and 20 characters.');
document.getElementById('tournamentNameError').innerHTML='Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")

document.getElementById('tournamentNameError').innerHTML='';

}

}
function hostingCountryValidation()
{
var submitButton = document.getElementById("submitButton");
var hostingCountry = document.getElementById('hostingCountry').value;
        console.log(hostingCountry);
if (hostingCountry === 'Choose...') {
     document.getElementById('hostingCountryError').innerHTML = 'Please select a hosting country.';
     submitButton.setAttribute("disabled" ,"")
   
   }
else
{

submitButton.removeAttribute("disabled")
document.getElementById('hostingCountryError').innerHTML='';
}
}

function team1Validation()
{
var submitButton = document.getElementById("submitButton");
var team1 = document.getElementById('team1').value;
        console.log(team1);
if (team1 === 'Choose...') {
     document.getElementById('team1Error').innerHTML = 'Please select a team1';
     submitButton.setAttribute("disabled" ,"")
   
   }
else
{

submitButton.removeAttribute("disabled")
document.getElementById('team1Error').innerHTML='';
}
}
function team2Validation()
{
var submitButton = document.getElementById("submitButton");
var team2 = document.getElementById('team2').value;
        console.log(team2);
if (team2 === 'Choose...') {
     document.getElementById('team2Error').innerHTML = 'Please select a team2';
     submitButton.setAttribute("disabled" ,"")
   
   }
else
{

 submitButton.removeAttribute("disabled")
document.getElementById('team2Error').innerHTML='';
}
}

function matchDateValidation()
{
var submitButton = document.getElementById("submitButton");
var matchDate = document.getElementById('matchDate').value;

if (matchDate.value >0 && matchDate.value<=31) {
document.getElementById('matchDateError').innerHTML='Enter valid date';
submitButton.setAttribute("disabled" ,"")


}
else{

submitButton.removeAttribute("disabled")
document.getElementById('matchDateError').innerHTML='';

}
}

function team1CaptainNameValidation()
{
var submitButton = document.getElementById("submitButton");
var team1CaptainName = document.getElementById('team1CaptainName').value;

if (team1CaptainName.length < 3 || team1CaptainName.length > 20) {
document.getElementById('team1CaptainNameError').innerHTML='Team1 CaptainName must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{

submitButton.removeAttribute("disabled")
document.getElementById('team1CaptainNameError').innerHTML='';

}

}
function team2CaptainNameValidation()
{
var submitButton = document.getElementById("submitButton");
var team2CaptainName = document.getElementById('team2CaptainName').value;

if (team2CaptainName.length < 3 || team2CaptainName.length > 20) {
document.getElementById('team2CaptainNameError').innerHTML='Team2 CaptainName must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{

submitButton.removeAttribute("disabled")
document.getElementById('team2CaptainNameError').innerHTML='';

}
}

function umpireNameValidation()
{
var submitButton = document.getElementById("submitButton");
var umpireName = document.getElementById('umpireName').value;

if (umpireName.length < 3 || umpireName.length > 20) {
document.getElementById('umpireNameError').innerHTML='Umpire Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")
}
else{

submitButton.removeAttribute("disabled")
document.getElementById('umpireNameError').innerHTML='';

}
}
function thirdUmpireNameValidation()
{
var submitButton = document.getElementById("submitButton");
var thirdUmpireName = document.getElementById('thirdUmpireName').value;

if (thirdUmpireName.length < 3 || thirdUmpireName.length > 20) {
document.getElementById('thirdUmpireNameError').innerHTML='Third Umpire Name must be between 3 and 20';
submitButton.setAttribute("disabled" ,"")

}
else{

submitButton.removeAttribute("disabled")
document.getElementById('thirdUmpireNameError').innerHTML='';

}
}
function stadiumNameValidation()
{
var submitButton = document.getElementById("submitButton");
var stadiumName = document.getElementById('stadiumName').value;

if (stadiumName.length < 3 || stadiumName.length > 20) {
document.getElementById('stadiumNameError').innerHTML='Stadium Name must be between 3 and 20 characters';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")
document.getElementById('stadiumNameError').innerHTML='';

}
}
function stadiumCapacityValidation()
{
var submitButton = document.getElementById("submitButton");
var stadiumCapacity = document.getElementById('stadiumCapacity').value;

if (stadiumCapacity<=1000 || stadiumCapacity>=10000000) {
document.getElementById('stadiumCapacityError').innerHTML='Stadium Capacity must be greater than 1000 and less than 10000000';
submitButton.setAttribute("disabled" ,"")

}
else{
submitButton.removeAttribute("disabled")
document.getElementById('stadiumCapacityError').innerHTML='';
}

}


function validateForm() {
var tournamentName = document.getElementById('tournamentName').value;
var hostingCountry = document.getElementById('hostingCountry').value;
var team1 = document.getElementById('team1').value;
var team2 = document.getElementById('team2').value;
var team1CaptainName = document.getElementById('team1CaptainName').value;
var team2CaptainName = document.getElementById('team2CaptainName').value;
var umpireName = document.getElementById('umpireName').value;
var stadiumName = document.getElementById('stadiumName').value;
var thirdUmpireName = document.getElementById('thirdUmpireName').value;
var stadiumCapacity = document.getElementById('stadiumCapacity').value;
var submitButton = document.getElementById("submitButton");

if (tournamentName.length < 3 || tournamentName.length > 20) {
//alert('Name must be between 3 and 20 characters.');
document.getElementById('tournamentNameError').innerHTML='Name must be between 3 and 20 characters';
return false;
}
else{
document.getElementById('tournamentNameError').innerHTML='';

}

if (hostingCountry === 'Choose...') {
     hostingCountryError.innerHTML = 'Please select a hosting country.';
     return false;
   } else {
     hostingCountryError.innerHTML = '';
   }

if (matchDate >0 && matchDate<=31) {
document.getElementById('matchDateError').innerHTML='Enter valid date';
return false
}
else{
document.getElementById('matchDateError').innerHTML='';

}
           
if (team1 === 'Choose...') {
document.getElementById('team1Error').innerHTML='Please select a team1.';
return false;
}
else{
document.getElementById('team1Error').innerHTML='';

}
if (team2 === 'Choose...') {
document.getElementById('team2Error').innerHTML='Please select a team2.';
return false;
}
else{
document.getElementById('team2Error').innerHTML='';

}

if (team1CaptainName.length < 3 || team1CaptainName.length > 20) {
document.getElementById('team1CaptainNameError').innerHTML='Team1 CaptainName must be between 3 and 20 characters';
return false;
}
else{
document.getElementById('team1CaptainNameError').innerHTML='';

}
if (team2CaptainName.length < 3 || team2CaptainName.length > 20) {
document.getElementById('team2CaptainNameError').innerHTML='Team2 CaptainName must be between 3 and 20 characters';
return false;
}
else{
document.getElementById('team2CaptainNameError').innerHTML='';

}
if (umpireName.length < 3 || umpireName.length > 20) {
document.getElementById('umpireNameError').innerHTML='Umpire Name must be between 3 and 20 characters';
return false;
}
else{
document.getElementById('umpireNameError').innerHTML='';

}
if (stadiumName.length < 3 || stadiumName.length > 20) {
document.getElementById('stadiumNameError').innerHTML='Stadium Name must be between 3 and 20 characters';
return false;
}
else{
document.getElementById('stadiumNameError').innerHTML='';

}
if (thirdUmpireName.length < 3 || thirdUmpireName.length > 20) {
document.getElementById('thirdUmpireNameError').innerHTML='Third Umpire Name must be between 3 and 20';
return false;
}
else{
document.getElementById('thirdUmpireNameError').innerHTML='';

}
if (stadiumCapacity<=1000 || stadiumCapacity>=10000000) {
document.getElementById('stadiumCapacityError').innerHTML='Stadium Capacity must be greater than 1000 and less than 10000000';
return false;
}
else{
document.getElementById('stadiumCapacityError').innerHTML='';

}
  submitButton.removeAttribute('submitButton');
return true;
}
</script>
</body>
</html>