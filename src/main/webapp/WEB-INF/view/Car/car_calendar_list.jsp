<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
<table border="1">
		<tr>
			<td>일정 번호</td>
			<td>차 이름</td>
			<td>출발 날짜</td>
			<td>도착 날짜</td>
			<td>출발 지역</td>
			<td>도착 지역</td>
			<td>출발 시간</td>
			<td>도착 시간</td>
			<td>예상 소요시간</td>
			<td>예상 금액</td>
			<td>참가인원</td>
			<td>모집인원</td>
			<td>일정 등록 시간</td>
			<td>예약 여부</td>
		</tr>
	<c:forEach var="calendarList" items="${calendarList}">
		<tr>
			<td>${calendarList.carCalendarDTO.calendarNumber}</td>
			<td><a href="carCalendarDetail?calendarNumber=${calendarList.carCalendarDTO.calendarNumber}">
			${calendarList.carDTO.carName}</a></td>
			<td>${calendarList.carCalendarDTO.calendarDepartureDate}</td>
			<td>${calendarList.carCalendarDTO.calendarArrival}</td>
			<td>${calendarList.carCalendarDTO.calendarStartingpoint}</td>
			<td>${calendarList.carCalendarDTO.calendarDestination}</td>
			<td>${calendarList.carCalendarDTO.startTime}</td>
			<td>${calendarList.carCalendarDTO.destinationTime}</td>
			<td>${calendarList.carCalendarDTO.predictionTime} 시간</td>
			<td>${calendarList.carCalendarDTO.predictionPrice} 원</td>
			<td>${calendarList.carCalendarDTO.calendarParticipant}</td>
			<td>${calendarList.carCalendarDTO.calendarRecruitment}</td>
			<td>${calendarList.carCalendarDTO.calendarRegist}</td>
			<td>예약여부부부부부부부부</td>
		</tr>
	</c:forEach>
</table>
	<a href="carCalendarWriter">일정 등록</a> 
	<a href="../main">메인</a>
</body>
</html>