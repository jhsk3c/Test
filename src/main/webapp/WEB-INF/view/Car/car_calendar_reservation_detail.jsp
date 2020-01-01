<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>예약 상세 정보</h1>
<table>
	<tr>
		<td>아이디</td>
		<td>${carJoinDTO.memDTO.memId}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${carJoinDTO.memDTO.memName}</td>
	</tr>
	<tr>
		<td>차 이름</td>
		<td>${carJoinDTO.carDTO.carName}</td>
	</tr>
	<tr>
		<td>가격</td>
		<td>${carJoinDTO.carPaymentDTO.paymentPrice}</td>
	</tr>
	<tr>
		<td>이용 시작 날짜</td>
		<td>${carJoinDTO.carCalendarReservationDTO.carStartDate}</td>
	</tr>
	<tr>
		<td>이용 종료 날짜</td>
		<td>${carJoinDTO.carCalendarReservationDTO.carEndDate}</td>
	</tr>
	<tr>
		<td>이용 시작 시간</td>
		<td>${carJoinDTO.carCalendarReservationDTO.carStartTime}</td>
	</tr>
	<tr>
		<td>이용 종료 시간</td>
		<td>${carJoinDTO.carCalendarReservationDTO.carEndTime}</td>
	</tr>
<%-- 	<tr>
		<td>예약 등록 시간</td>
		<td>${carJoinDTO.carCalendarReservationDTO.memeId}</td>
	</tr> --%>
	<tr>
		<td colspan="2">
			<a href="carCalendarReservationDelete?">예약 취소</a>
			<a href="#">예약 목록</a>
		</td>
	</tr>
</table>
</body>
</html>