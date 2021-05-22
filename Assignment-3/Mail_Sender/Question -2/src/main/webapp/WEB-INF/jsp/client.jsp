<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css" rel="stylesheet">




<title>Insert title here</title>

</head>
<body>

	<img src="resources/image/welcome.jfif" />
	<br>

 <a id="en" href="/Inter_local/init?lang=en">English</a>
			| <a id="fr" href="/Inter_local/init?lang=fr">French</a>
			<div>&nbsp;</div>


	<div align="center">


		<!-- <h1>Welcome Page </h1> -->

		<div id="welcome_text">

			<h1>Welcome to the Login Page</h1>
			<spring:message code="welcome.message" />
			
			
			<br> <br>
			

			<form:form action="login" method="post" modelAttribute="UserModel">

<spring:message code="welcome.username" /> :-> <form:input path="userid" name="uname" />
				<form:errors path="userid" cssClass="error" />
				<br>
				<br>
<spring:message code="welcome.password" />   :-><form:input path="pwd" />
				<form:errors path="pwd" cssClass="error" />

				<br>
				<br>
  <spring:message code="welcome.emailid" />  :->  <form:input path="email" />
				<form:errors path="email" cssClass="error" />

				<br>
				<br>
     <spring:message code="welcome.age" />  :-> <form:input path="age" />
				<br>
				<br>

   <spring:message code="welcome.gender" />   :->  
<spring:message code="welcome.male" /> :  <form:radiobutton path="gender" value="Male"/>
<spring:message code="welcome.female" /> :  <form:radiobutton path="gender" value="Female"/>

<br>
<br>
  <spring:message code="welcome.area" />    :->  <form:textarea path="area" />
<form:errors path="area"   cssClass="error" />
<br>
<br>
  <spring:message code="welcome.state" />    :->  <form:input path="state" />
<form:errors path="state"   cssClass="error" />
<br>
<br>
  <spring:message code="welcome.country" />     :->  <form:input path="country" />
<form:errors path="country"   cssClass="error" />
<br>
<br>

  <spring:message code="welcome.coursecode" />    :->  <form:input path="courseCode" />
<form:errors path="courseCode"   cssClass="error" />
<br>
<br>




				<form:button> <spring:message code="welcome.login" /></form:button>
			</form:form>

		</div>
	</div>
</body>
</html>





