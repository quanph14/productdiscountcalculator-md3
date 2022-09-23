<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/discount" method="post">
    <label>Discount Percent: </label><br/>
    <input type="text" name="discount" placeholder="Percent" value="0"/><br/>
    <label>ListPrice: </label><br/>
    <input type="text" name="price" placeholder="Price" value="0"/><br/>
    <label>Product Description: </label><br/>
    <input type="text" name="product" placeholder="Product"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>