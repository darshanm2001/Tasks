<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bakery Application</title>
   
</head>
<style>
    body {
        font-family: Arial, sans-serif;
    }

    .navbar {
        background-color: #333;
        color: #fff;
        text-align: center;
        padding: 10px;
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    label {
        display: block;
        margin-bottom: 5px;
    }

    input[type="text"], input[type="date"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"] {
        background-color: #333;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #555;
    }
</style>

<body>
  
<div class="navbar" >
        <h1>Bakery Application</h1>
    </div>
   	
    

    
    <form action="darshan" method="post">
        <label for="itemName">Item Name:</label>
        <input type="text" id="itemName" name="itemName" required><br>
        
        
       

        <label for="itemPrice">Item Price:</label>
        <input type="text" id="itemPrice" name="itemPrice" required>
        <br>
        <div class="design">
<label for="quantity">Quantity :</label>
<select class="form-select" name="quantity">
<option selected>Choose</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>6</option>
<option>7</option>
<option>8</option>
<option>9</option>
<option>10</option>
</select>
</div>
<br>
<div class="design">
<label for="discount">Discount In % :</label>
<select class="form-select" name="discount" >
<option selected>Choose</option>
<option>5</option>
<option>10</option>
<option>15</option>
<option>20</option>
<option>50</option>
<option>75</option>
<option>100</option>
</select>
</div>
<br>
       

       
        <label for="gst">GST:</label>
        <input type="text" id="gst" name="gst"><br>

        <label for="manufactureDate">Manufacture Date:</label>
        <input type="date" id="manufactureDate" name="manufactureDate" required><br>

        <label for="expireDate">Expire Date:</label>
        <input type="date" id="expireDate" name="expireDate" required><br>

        <input type="submit" value="Add Item">
    </form>

    
</body>
</html>
