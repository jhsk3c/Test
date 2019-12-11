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
<jsp:include page="../Main/admintop.jsp" />
	<table border="1" width="80%" align="center">
		<tr>
		<td colspan="8" align="right"> 글 개수 : ${Count} </td>
		</tr>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>대표자 이름</th>
			<th>사업자 번호</th>
			<th>담당자 이름</th>
			<th>담당자 번호</th>
			<th>가입일</th>
			<th>구분</th>
		</tr>
		
	<c:forEach var="list" items="${list}"  varStatus="status">
		<tr align="center">
			<td> ${status.count } </td>
			<td> ${list.comId} </td>
			<td> ${list.comRepName} </td>
			<td> ${list.licenseNumber} </td>
			<td> ${list.comName} </td>
			<td> ${list.contactPhoneNum} </td>
			<td><fmt:formatDate value="${list.comDate}" pattern="yyyy-MM-dd"/></td>
			<td>
				<a href="listTrue?num=${list.comNum}&page=${page}">승인</a>
				<a href="listFalse?num=${list.comNum}&page=${page}">미승인</a>
			</td>
		</tr>
	</c:forEach>
	
		<tr align=center height=20 >
			<td colspan = 8>
			<c:if test="${page <= 1}">
				[이전]&nbsp; <!-- 첫 페이지  -->
			</c:if>
			<c:if test="${page > 1}">
				<a href = "comMana?page=${page -1}">[이전]</a>&nbsp;
			</c:if>
			
			<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
				<a href = "comMana?page=${i}">[ ${i} ]</a>&nbsp;
			</c:forEach>
			
			<c:if test="${page >= maxPage}">	
				[다음]&nbsp; <!-- 마지막 페이지  -->
			</c:if>
			<c:if test="${page < maxPage}">	
				<a href = "comMana?page=${page +1}">[다음]</a>&nbsp;
			</c:if>
			</td>
		</tr>
		
	</table>
</body>
</html>