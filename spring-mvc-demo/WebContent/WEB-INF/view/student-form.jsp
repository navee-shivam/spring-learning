<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registeration Form</title> Student Registeration Form
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName" />

		<br>
		<br>

Last Name : <form:input path="lastName" />

		<br>
		<br>
country : <form:select path="country">

			<%-- 			<form:option value="Brazil" label="Brazil" /> --%>
			<%-- 			<form:option value="US" label="US" /> --%>
			<%-- 			<form:option value="Germany" label="Germany" /> --%>
			<%-- 			<form:option value="India" label="India" /> --%>
			<form:options items="${student.countryOptions}" />

		</form:select>

		<br>
		<br>
Favorite Language :

		C++ <form:radiobutton path="favoriteLang" value= "C++"/>
		C# <form:radiobutton path="favoriteLang" value= "C#"/>
		JAVA <form:radiobutton path="favoriteLang" value= "JAVA"/>
		SQL <form:radiobutton path="favoriteLang" value= "SQL"/>

		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>

</body>
</html>