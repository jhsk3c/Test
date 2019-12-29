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
<h1>car 일정 예약 목록</h1>
<table border="1">
<tr>
	<td>아이디</td>
	<td>차이름</td>
	<td>이용 시작 날짜</td>
	<td>이용 종료 날짜</td>
	<td>이용 시작 시간</td>
	<td>이용 종료 시간</td>
</tr>

<c:forEach var="list" items="${carJoinDTO}">
<c:if test="${memLev == 4}"> <!-- 관리자 예약 관리 -->
<tr>
	<td>${list.memDTO.memId}</td>
	<td>${list.carDTO.carName}</td>
	<td>${list.carCalendarReservationDTO.carStartDate}</td>
	<td>${list.carCalendarReservationDTO.carEndDate}</td>
	<td>${list.carCalendarReservationDTO.carStartTime}</td>
	<td>${list.carCalendarReservationDTO.carEndTime}</td>
</tr>
</c:if>
<c:if test="${memLev == 1}"> <!-- 회원 -->
<tr>
	<td><a href="carCalendarReservationDetail?calenderReservationNum=${list.carCalendarReservationDTO.calenderReservationNum }">${list.memDTO.memId}</a></td>
	<td>${list.carDTO.carName}</td>
	<td>${list.carCalendarReservationDTO.carStartDate}</td>
	<td>${list.carCalendarReservationDTO.carEndDate}</td>
	<td>${list.carCalendarReservationDTO.carStartTime}</td>
	<td>${list.carCalendarReservationDTO.carEndTime}</td>
</tr>
</c:if>
</c:forEach>

</table>
</body>
</html>