<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
			<td colspan="9" align="right"> 글 개수 : ${Count} </td> 
		</tr> 
		<tr>
			<th> 번호 </th>
			<th> 상점 분류 </th>
			<th> 상점 위치 </th>
			<th> 상점 이름 </th>	
			<th> 상품 이름 </th>
			<th> 상품 가격</th>
			<th> 신청 날짜 </th>
			<th> 구분 </th>
		</tr>
		
		
		<c:forEach var="list" items="${list}" varStatus="status">
			
			<tr>
				<td>${status.count }</td>
				<td>${list.shopCategory }</td>
				<td>${list.shopLoc }</td>
				<td>${list.shopName }</td>
				<td>${list.goodsName }</td>
				<td>${list.goodsPrice }</td>
				<td><fmt:formatDate value="${list.goodsDate }" pattern="yyyy-MM-dd"/></td>
				<td>
					<a href="shopManaTrue?num=${list.shopNum}&page=${page}">승인</a>
					<a href="shopManaFalse?num=${list.shopNum}&page=${page}">미승인</a>
				</td>
			</tr>
		</c:forEach>
		
		
		
		<tr align=center height=20 >
			<td colspan = "9">
			<c:if test="${page <= 1}">
				[이전]&nbsp; <!-- 첫 페이지  -->
			</c:if>
			<c:if test="${page > 1}">
				<a href = "shopMana?page=${page -1}">[이전]</a>&nbsp;
			</c:if>
			
			<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
				<a href = "shopMana?page=${i}">[ ${i} ]</a>&nbsp;
			</c:forEach>
			
			<c:if test="${page >= maxPage}">	
				[다음]&nbsp; <!-- 마지막 페이지  -->
			</c:if>
			<c:if test="${page < maxPage}">	
				<a href = "shopMana?page=${page +1}">[다음]</a>&nbsp;
			</c:if>
			</td>
		</tr> 
		
		
	</table>

	
</body>
</html>