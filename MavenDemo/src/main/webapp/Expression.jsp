<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> JSP Expression</title>
</head>
<body>
	<H2> JSP Expression</H2>
	<UL> 
	 	<LI>Current time : <%= new java.util.Date()   %>
		<LI>Server : <%= application.getserverInfo() %>
		<LI>Session ID : <%= session.getId() %>
		<LI>The <CODE>testParam</CODE> form parameter:
		<%= request.getParameter("testParam") %>
	</UL>
</body>
</html>