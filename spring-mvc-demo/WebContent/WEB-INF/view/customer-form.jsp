<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details Form</title>

<style>
.error {
	color: red
}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">

First name :
<form:input path="firstName" />
		<br>
		<br>
Last name (*) :
<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
Postal Code :
		<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
Expected package (*) :
		<form:input path="expectedPackage" />
		<form:errors path="expectedPackage" cssClass="error" />
		<br>
		<br>
Customer Code :
		<form:input path="customerCode" />
		<form:errors path="customerCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Register" />
	</form:form>

</body>
</html>