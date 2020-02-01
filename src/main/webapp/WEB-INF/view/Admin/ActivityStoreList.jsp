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
<title> 혜윰_활동_대여상점</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


</head>
<body>
<jsp:include page="../Main/admintop.jsp" />

<!-- 중단 -->

<div style="padding-left:30px;padding-right:30px;padding-top:130px">
<div class="jumbotron" style="background:white;border-radius:35px;border:1px solid lightgrey">
	<!-- 가운데 정렬  -->
	<div style="margin:40px auto;width:90%;padding-top:30px; padding-right: 30px; padding-bottom: 50px; padding-left: 80px;">
	<div style="padding-top:30px;padding-bottom:20px;">
		<font size=30 style="display:inline"> 상점 </font>
		<a href="ActivityStoreInsert" style="margin-top:40px;float:right;text-decoration:none;color:black">
			<span>상점 등록</span>
			<img alt="viewMore" src="img/next.png" width=15 height=13/>
		</a>
	</div>

<table  class="table">
		<thead>
			<tr>		
				<td colspan="5" align="right"> 상점 수 : ${Count} </td>
			</tr>
		</thead>
      		<tr class="w3-light-grey">
				<th> 위치 </th>
				<th> 상점 이름 </th>
				<th>  </th>
			</tr>
		<c:forEach var="list" items="${list}"  varStatus="status">
			<tr>
				<td> ${list.storeLoc1 } </td>
				<td> <a href="StoreDetail?stNum=${list.storeNum }"> ${list.storeName } </a> </td>
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
					<a href = "comMana?page=${page	 +1}">[다음]</a>&nbsp;
				</c:if>
				</td>
			</tr>
		</tfoot>
</table>
</div>
</div>
</div>


</body>
</html>