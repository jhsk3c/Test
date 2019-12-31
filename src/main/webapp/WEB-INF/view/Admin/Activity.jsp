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
<title>활동 관리</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
<!-- 상단 -->
<jsp:include page="../Main/admintop.jsp" />

<!-- 중단 -->
	<table class="w3-table-all w3-hoverable" style="width:80%;" align="center">
		<thead>
			<tr>
				<td colspan="8" align="right"> 글 개수 : ${Count} </td> 
			</tr>
		
			<tr>
				<th> 번호 </th>
				<th> 활동 제목	 </th>
				<th> 활동 종류 </th>
				<th> 회원 번호 </th>	
				<th> 구분 </th>
			</tr>
		</thead>
		
		<c:forEach var="list" items="${list}" varStatus="status"> 
			<tr align="center">
				<td> <a href="Detail?num=${list.activityNum }">${status.count } </a></td>
				<td> ${list.activityName} </td>
				<td> ${list.sortOfActivity} </td>
				<td> ${list.memNum } </td>
				
				<td>
					<a href="activityListTrue?num=${list.activityNum}&page=${page}">승인</a>
					<a href="activityListFalse?num=${list.activityNum}&page=${page}">미승인</a>
				</td>
			</tr>
		</c:forEach>
	
		<tfoot>
		 	<tr align=center height=20 >
				<td colspan = 8>
				<c:if test="${page <= 1}">
					[이전]&nbsp; <!-- 첫 페이지  -->
				</c:if>
				<c:if test="${page > 1}">
					<a href = "activity?page=${page -1}">[이전]</a>&nbsp;
				</c:if>
				
				<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
					<a href = "activity?page=${i}">[ ${i} ]</a>&nbsp;
				</c:forEach>
				
				<c:if test="${page >= maxPage}">	
					[다음]&nbsp; <!-- 마지막 페이지  -->
				</c:if>
				<c:if test="${page < maxPage}">	
					<a href = "activity?page=${page +1}">[다음]</a>&nbsp;
				</c:if>
				</td>
			</tr> 
		</tfoot>
	</table>



<input type="button" value="활동 승인" onClick="location.href='activityAccept?&page=${page}';"/> 	<!-- Controller에 적을 필요? -->

<!-- 하단 -->


</body>
</html>