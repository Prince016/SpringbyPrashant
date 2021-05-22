<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css"  rel="stylesheet">




<title>Insert title here</title>
</head>
<body>
<h2>Hello World! welcome ${msg }</h2>






<h1> Welcome to the Spring MVC Application </h1>
<br><br><br>
<img src="resources/image/mvc_image2.png"/>	
<br><br><br>
<form action="reg" method="post">
 You want to login :-> <input type="text" name="userId" placeholder="Yes or No">

<button>Go</button>
</form>

</body>
</html>


<!-- ---------------------------------------------------------------- -->
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdmissionPage</title>
</head>
<body>
<h2>${welcome_msg}</h2>
<hr />
<a id="en" href="/SpringMVC2/init?lang=en">English</a> | <a id="fr" href="/SpringMVC2/init?lang=fr">French</a>
<div>&nbsp;</div>

<div id="welcome_text">
<h4><spring:message code="welcome.message" /></h4>
</div>
</body>
</html> --%>