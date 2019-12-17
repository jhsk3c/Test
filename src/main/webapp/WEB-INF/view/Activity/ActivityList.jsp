<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 활동 </title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />


<!-- 중단 -->
<a href="ActivityInsert"> 활동 생성 </a>

<h2>활동을 찾아보세요 !</h2>
<div>
	<c:if test="${activity_lev eq 2}">
		<h2></h2>
		<div class="w3-container">
		  <div class="w3-card-4 w3-round-xlarge" style="width:50%;">
		    <img src="" alt="Alps" style="width:100% ">
		    <div class="w3-container w3-center">
				<p>한줄소개</p>
				<p>날짜&시간</p>
				<p>금액</p>
		    </div>
		  </div>
		</div>
	</c:if>
</div>

<br/>




</body>
</html>