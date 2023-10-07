<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Fifth Wheel</title>
</head>
<body>
<h1> Add a fifth wheel below:</h1>
<form action="addFifthWheel" method="post">
		<p>Manufacturer: <input
			type="text" name="manufacturer" size="25"/> </p>
		
		<p>Brand: <input
			type="text" name="brand" size="25"/> </p>
		
		<p>Model: <input
			type="text" name="model" size="25"> </p>
			
		<p>Rating out of 10: <input
			type= "text" name="rating" size="25"></p>
			
		<p><input type="submit" value="Submit" /></p>
	</form>
</body>
</html>