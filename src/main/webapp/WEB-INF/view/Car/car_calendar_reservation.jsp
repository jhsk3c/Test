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
<title>일정 예약</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<h2>일정 예약</h2>
	<form:form action="carCalendaReservationPro" id="carReserVationFrm" method="post" commandName="carReserVationCommand" >
		<form:hidden path="calendarNumber" />
		<table border="1">
			<tr>
				<td>차량 이름</td>
				<td><form:input path="carName" id="carName" /></td>
			</tr>
			<tr>
				<td>이용 시작 날짜</td>
				<td><input type="date" name="carStartDate" /></td>
			</tr>
			<tr>
				<td>이용 종료 날짜</td>
				<td><input type="date" name="carEndDate" /></td>
			</tr>
			<tr>
				<td>이용 시작 시간</td>
				<td><input type="time" name="carStartTime" /></td>
			</tr>
			<tr>
				<td>이용 종료 시간</td>
				<td><input type="time" name="carEndTime" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="예약" id ="suBmit"> 
					<input type="button" value="취소">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>