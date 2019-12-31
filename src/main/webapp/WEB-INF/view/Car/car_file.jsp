<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="" >
	
				<label>운전 면허증</label>
				<input type="file" id="driveLicense" multiple="multiple"><br />
				<label>보험 증명서</label>
				<input type="file" id="driveInsurance" multiple="multiple"><br />
				<label>자차 확인서</label>
				<input type="file" id="driveCarCheck" multiple="multiple"><br />
	
	</form:form>
</body>
</html>