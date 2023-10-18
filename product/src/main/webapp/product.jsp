<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<style>
label{
font-weight:bold;
}
.container {  
    max-width: 200px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    background-color:aqua;
  } .btn {
    display: block;
    width: 20%;
    background-color: red;
    border: none;
    cursor: pointer;
  }

  .btn:hover {
    background-color:green ;
  }
label{
font-weight:bold;
}
</style>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">

</head>
<body>

<nav class="navbar bg-body-tertiary">
<div class="container-fluid">
<a class="navbar-brand" href="product.jsp">Product</a>
</div>
</nav>

<form action="flipkart" method="post" class="container" name="myForm" onsubmit="return validateForm()">
<h1><span style="color:red;">${errorMsg }</span><br></h1>
<h1>Product details</h1>
<div class="design">
<label for="name" > Name </label><br>
  <input type="text" name="name" class="form-control" id="name" placeholder=" Enter product name">
</div><br>
<div class="design">
<label for="productType" >Product Type</label> <select
id="productType" class="form-select" name="type">
<option selected>Choose...</option>
<option>Physical goods</option>
<option>Digital goods</option>
<option>Simple Product</option>
<option>Virtual Product</option>
<option>Gifts </option>
</select>
</div><br>
<div class="design">
<label for="price" >Price</label><br>
  <input type="number" name="price"  id="price" step="0.01" placeholder="Ex.100000 in rupees" >
</div><br>
<div class="design">
<label for="brand" >Brand</label><br>
  <input type="text" name="brand" class="form-control" id="brand" placeholder=" Enter brand ">
</div><br>
<div class="design">
<label for="quantity" >Quantity</label><br>
  <input type="number" name="quantity" class="form-control" id="quantity" placeholder=" Enter no.of quantity ">
</div><br>
<div class="design">
<label for="floatingTextarea">Description</label>
  <textarea class="form-control" placeholder="Description" id="floatingTextarea" name="description"></textarea>
</div><br>
<div class="button">
    <button type="submit" class="btn btn-primary">Send</button>
  </div>
</form>
<script>
function validateForm() {
var name = document.getElementById('name').value;
var productType = document.getElementById('productType').value;
var price = parseFloat(document.getElementById('price').value);
var brand = document.getElementById('brand').value;
var quantity = parseInt(document.getElementById('quantity').value);
var description = document.getElementById('floatingTextarea').value;
var submitButton = document.querySelector('button[type="submit"]');

if (name.length < 3 || name.length > 20) {
alert('Name must be between 3 and 20 characters.');
return false;
}

if (productType === '') {
alert('Please select a product type.');
return false;
}

if (price <= 0 || price >= 5000) {
alert('Price must be greater than 0 and less than 50.');
return false;
}

if (brand.length < 3 || brand.length > 20) {
alert('Brand must be between 3 and 20 characters.');
return false;
}

if (quantity <= 1 || quantity >= 50) {
alert('Quantity must be greater than 0 and less than 50.');
return false;
}

if (description.length > 30) {
alert('Description cannot exceed 30 words.');
return false;
}

  submitButton.removeAttribute('disabled');
return true;
}
</script>
</body>
</html>