<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>공모전 메인</h1>
		<a href="contestList">공모전리스트</a>
	</div>
	<c:if test="${memLev == 4}">
		<a href="contestInsertForm">공모전등록</a>
	</c:if>
</body>
</html>