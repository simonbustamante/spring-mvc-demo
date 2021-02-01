
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registation Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		<!-- path="firstName is a property from Student class" -->
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		Country:
			<form:select path="country">
				<form:options items="${theCountryOptions}" />
			</form:select>
		<br><br>
		Favorite Language: 
			<form:radiobuttons path="favoriteLanguage" items="${theLanguageOptions}" />
		<!--  	
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		-->
		<br><br>
		
		Select Operative System: 
			<form:checkboxes items="${theOperatingSystemOptions}" path="operatingSystem"/>
		<br><br>
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>