<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Page Count</title>
</head>
<body>
	<%!
			// Declaration   by using !(declaration tag ) it make count/it global varaible  
			int count=0;
	
	
	%>
	<h2> Page Count is :  <% out.println(count++); %> </h2>
</body>
</html>