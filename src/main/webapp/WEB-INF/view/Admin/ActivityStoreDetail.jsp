<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 관리자_상점 상세보기 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<!-- 상단 -->
<jsp:include page="../Main/admintop.jsp" />

<!-- 중단 -->
<div style="margin:40px auto;background:lightgrey;padding-top: 50px; padding-right: 100px; padding-bottom: 50px; padding-left: 100px;">	<!-- 가운데 정렬  -->

<div class="w3-container">
	<!-- 활동 정보 : 사지인!!! -->
	<div class="row" >
		<table class="w3-table w3-border">
			<tr>
				<td> 상점 명 </td>
				<td> ${list.storeName } 
			</tr>		
			<tr>
				<td> 상점 번호</td>
				<td> ㅎㄷ${list.storeNum }
			</tr>
			<tr>
				<td> 상점 지역 및 주소 </td>
				<td> ${list.storeLoc1 } / ${list.storeLoc2 } </td>
			</tr>
			<tr>
				<td> 상점 전화번호 </td>
				<td> ${list.storeTel } </td>
			</tr>
		</table>
	</div>
</div>
</div>

<div style="margin:40px auto;padding-top: 50px; padding-right: 80px; padding-bottom: 50px; padding-left: 80px;">	<!-- 가운데 정렬  -->
<h2> 물품 </h2>

	<table class="w3-table-all w3-hoverable">
			<thead>
				<tr>
					<th> 사진 </th>
					<th> 상품 번호 </th>
					<th> 상품 이름 </th>
				    <th> 상품 가격 </th>
				</tr>
			</thead>
		<c:forEach var="aa" items="${product }">
			<tr>
			   <td> <img src="${aa.storeFilename }" alt="${aa.originalFilename }" style="width:100%"> </td>
			   <td> ${aa.productNum } </td>
			   <td> ${aa.productName } </td>
			   <td> ${aa.productPrice } </td>
			</tr>
		</c:forEach>
	</table>
	
</div>



<!-- 하단 -->



</body>
</html>