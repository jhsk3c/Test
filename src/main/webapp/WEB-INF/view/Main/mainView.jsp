<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="top.jsp" />
	
	<c:if test="${Lev eq 1}">
	asdasdsa 일반
		<a href ="logout">로그아웃</a>
	</c:if> 
	
	<c:if test="${Lev eq 2}">
	asdasdsa 선생님
		<a href ="logout">로그아웃</a>
	</c:if> 
	
	<c:if test="${Lev eq 4}">
	asdasdsa  관리자
		<a href ="logout">로그아웃</a>
	</c:if> 
	
</body>
</html>