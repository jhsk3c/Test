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
	<c:if test="${empty authInfo}">
		<jsp:include page="top.jsp" />
	</c:if>	
	<c:if test="${Lev eq 1}">
	
		<jsp:include page="memtop.jsp" />
		asdasdsa 일반
	</c:if> 
	
	<c:if test="${Lev eq 2}">
	
		<a href ="logout">로그아웃</a>
		asdasdsa 선생님
	</c:if> 
	
	<c:if test="${Lev eq 4}">
	
		<jsp:include page="admintop.jsp" />
		asdasdsa  관리자
	</c:if> 
	
</body>
</html>