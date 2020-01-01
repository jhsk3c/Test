<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />

<!-- 중단 -->
<div style="margin:40px auto;background:#0c3300">	<!-- 가운데 정렬  -->
	<div class="w3-container " style="width:100%">
		<div style="width:80%;margin:40px auto;">
			<c:forEach var="store1" items="${store }">
				<img src="Activity/upload/${store1 }" alt="X" width="100%" height="100%" >
			</c:forEach>
		</div>
	</div>
</div>

<div style="margin:40px auto; background:#e6ffee; text-align:center">	<!-- 가운데 정렬  -->
	
		<p style="font-size: font-size:60px;"> <strong> ${result.activityName } </strong></p>
		<P>활동기간:  ${result. activityStartDate} ~ ${result.activityEndDate }</P>
		<p>모집기간:  ${result.recruitStartDate } ~${result.recruitEndDate } </p>
		<p>활동 물품: ${result.activityProduct } </p>
		<p>활동 지역: ${result.activityCity } </p>
		<p>모집 인원: ${result.recruitPeople } / activityCurrentPeople </p>
		<p>모집 상태: ${result.actiState } </p> <!-- 이거 어케 나타낼꺼야? -->
		<p>나이 제한: ${result.limitAge } </p>
	
	
	<div id="activityText">
		<hr color="lightGreyS" />
		<p>활동 가격: ${result.activityCost } </p>
		<p> 활동 설명: ${result.activityText } </p>
	</div>
</div>

<!-- 하단 -->



</body>
</html>