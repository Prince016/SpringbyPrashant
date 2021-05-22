<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="resources/css/test.css"  rel="stylesheet">

</head>
<body  >




<h1 >----- Login Successful -----</h1>
<br>
<br>

<h1>   Hello  :  <c:out value="${UserModel.userid}"></c:out> </h1>
<br>
<h1> Password :-> <c:out value="${UserModel.pwd}"></c:out></h1>
<br>
<h1> Email Id :->  <c:out value="${UserModel.email}"></c:out></h1>
<br>
<h1> Age      :->  <c:out value="${UserModel.age}"></c:out></h1>
<br>
<h1> Gender   :->  <c:out value="${UserModel.gender}"></c:out></h1>
<br>
<br>
<h1> Area      :->  <c:out value="${UserModel.area}"></c:out></h1>
<br>
<h1> State      :->  <c:out value="${UserModel.state}"></c:out></h1>
<br>
<h1> Country      :->  <c:out value="${UserModel.country}"></c:out></h1>
<br> 
<h1> CourseCode       :->  <c:out value="${UserModel.courseCode}"></c:out></h1>
<br> 


<br>
<br>






















</body>
</html>