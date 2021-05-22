<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css"  rel="stylesheet">




<title>Insert title here</title>

</head>
<body>

<img src="resources/image/welcome.jfif"/>	
<br>

<div align="center">


<!-- <h1>Welcome Page </h1> -->
<h1> Welcome to the Login Page </h1>
<br>
<br>


<form:form action="login" method="post" modelAttribute="UserModel">

UserName* :->  <form:input path="userid" name="uname"/>
<form:errors path="userid"   cssClass="error" />
<br>
<br>
Password :->  <form:input path="pwd" />
<form:errors path="pwd"   cssClass="error" />

<br>
<br>
Email Id :->  <form:input path="email" />
<form:errors path="email"   cssClass="error" />

<br>
<br>
Age      :->  <form:input path="age" />
<br>
<br>
Gender   :->  
Male: <form:radiobutton path="gender" value="Male"/>
Female: <form:radiobutton path="gender" value="Female"/>

<br>
<br>
Area     :->  <form:textarea path="area" />
<form:errors path="area"   cssClass="error" />
<br>
<br>
State     :->  <form:input path="state" />
<form:errors path="state"   cssClass="error" />
<br>
<br>
Country      :->  <form:input path="country" />
<form:errors path="country"   cssClass="error" />
<br>
<br>

CourseCode     :->  <form:input path="courseCode" />
<form:errors path="courseCode"   cssClass="error" />
<br>
<br>




<form:button>Login</form:button>
</form:form>

</div>


</body>
</html>








