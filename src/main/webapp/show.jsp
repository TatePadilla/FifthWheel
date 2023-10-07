<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fifth Wheels</title>
</head>
<body>
	<h1><u>List of all fifth wheels: </u></h1>
	
	<table>
		<c:forEach items="${requestScope.allFifthWheels}" var="currentfifthwheel">
			<tr>
	
				<td>Manufacturer: ${currentfifthwheel.manufacturer} | <p>__________________________</p></td>
				<td>Brand: ${currentfifthwheel.brand} | <p>__________________________</p></td>
				<td>Model: ${currentfifthwheel.model} | <p>__________________________</p></td>
				<td>Rating: ${currentfifthwheel.rating} <p>__________________________</p></td>
				
			</tr>
		</c:forEach>
		
	</table>
	
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>