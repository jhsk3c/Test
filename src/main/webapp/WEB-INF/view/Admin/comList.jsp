<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th><th>이메일</th><th>이름</th><th>가입일</th>
		</tr>
	<c:forEach var="list" items="${list}" >
		<tr>
			<td> ${list.comId} </td>
			<td>${list.contactEmail}</td>
			<td>${list.comName}</td>
			<td><fmt:formatDate value="${list.comDate}"
			   pattern="yyyy-MM-dd"/></td>
		</tr>
	</c:forEach>
		
	</table>
</body>
</html>