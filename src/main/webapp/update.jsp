<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Fifth Wheels</title>
</head>
<body>
<h1>Update the available fifth wheels below:</h1>

	<form action="updateFifthWheel" method="post">
		<p>Model Name to Update: <input type="text" name="oldName" size="25"> </p>
		<p>___________________________________________</p>
		<p>New Manufacturer: <input type="text" name="manufacturer" size="25" /></p>
		<p>New Brand: <input type="text" name="brand" size="25" /> </p>
		<p>New Model: <input type="text" name="model" size="25" /></p>
		<p>New Rating: <input type="text" name="rating" size="25" /></p>
			<p><input type="submit" value="Update" /></p>
	</form>
</body>
</html>