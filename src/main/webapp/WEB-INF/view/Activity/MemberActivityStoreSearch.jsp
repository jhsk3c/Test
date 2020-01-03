<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 상점 검색 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>	<!-- 제이커리 -->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>
<body>


<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />



	<!-- 본격 -->
	<div style="margin:30px auto; align:middle; witdh:80%">
		<table class="w3-table-all w3-hoverable">
			<thead>
				<th> 위치 </th>
				<th> 상점명 </th>
				<th> 주로 다루는 물품 </th>
			</thead>
			<c:forEach var="list" items="${search }" varStatus="status">	
				<tr>				
					<td width="30%"> ${list.storeLoc1 } </td>
					<td> <a href="StoreDetail?stNum=${list.storeNum }">${list.storeName } ㅋㅋㅋ </a> </td>
					<td> ${list.storeMainProduct } </td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>