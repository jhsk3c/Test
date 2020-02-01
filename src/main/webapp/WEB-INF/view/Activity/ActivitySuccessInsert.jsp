<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>  1차 등록 성공 </title>
</head>
<body>
<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />

<!-- 중단 -->
<div style="margin:40px auto;background:lightgrey;padding-top: 50px; padding-right: 30px; padding-bottom: 50px; padding-left: 80px;">	<!-- 가운데 정렬  -->
	<div style="">
		<h2 class="w3-xLarge"> 등록이 완료되었습니다! </h2>
		<button class="w3-btn w3-light-green" onclick="location.href='main'"> 메인으로 가기 </button>
	</div>
</div>

<!-- 하단 -->


</body>
</html>