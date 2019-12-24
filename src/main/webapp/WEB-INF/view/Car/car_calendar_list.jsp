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
			<td>일정 등록 시간</td>
		</tr>
	<c:forEach var="calendarList" items="${calendarList}">
		<tr>
			<td>${calendarList.carCalendarDTO.calendarNumber}</td>
			<td>${calendarList.carDTO.carName}</td>
			<td>${calendarList.carCalendarDTO.calendarDepartureDate}</td>
			<td>${calendarList.carCalendarDTO.calendarArrival}</td>
			<td>${calendarList.carCalendarDTO.calendarStartingpoint}</td>
			<td>${calendarList.carCalendarDTO.calendarDestination}</td>
			<td>${calendarList.carCalendarDTO.startTime}</td>
			<td>${calendarList.carCalendarDTO.destinationTime}</td>
			<td>${calendarList.carCalendarDTO.predictionTime}시간</td>
			<td>${calendarList.carCalendarDTO.predictionPrice}원</td>
			<td>${calendarList.carCalendarDTO.calendarRegist}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>