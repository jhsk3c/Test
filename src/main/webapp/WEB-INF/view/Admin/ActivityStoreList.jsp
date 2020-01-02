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
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<jsp:include page="../Main/admintop.jsp" />

<!-- 중단 -->

<div class="w3-container">
  <h2> 상점 </h2>

<table  class="w3-table-all w3-hoverable">
		<thead>
			<tr>
				<td colspan="2" align="left"> <a href="ActivityStoreInsert"> 상점 등록 </a> </td>			
				<td colspan="3" align="right"> 글 개수 : ${Count} </td>
			</tr>
		</thead>
      		<tr class="w3-light-grey">
				<th> 위치 </th>
				<th> 상점 이름 </th>
				<th> 상세 주소 </th>
				<th> 상점 전화번호 </th>
				<th>  </th>
			</tr>
		<c:forEach var="list" items="${list}"  varStatus="status">
			<tr>
				<td> ${list.storeLoc1 } </td>
				<td> <a href="StoreDetail?stNum=${list.storeNum }"> ${list.storeName } </a> </td>
				<td> ${list.storeLoc2 } </td>
				<td> ${list.storeTel } </td>
				<td> <input type="button" onclick="location.href='activityProductInsert?stNum=${list.storeNum}'" value="물품 등록">  </td>
			</tr>
			
		</c:forEach>
<!-- 페이징 -->
		<tfoot>
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
		</tfoot>
</table>

</div>


</body>
</html>