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
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
function carCalendaReservation() {
	location.href="carCalendaReservation?calendarNumber=${calendarDTO.carCalendarDTO.calendarNumber}";
}



/* var url = "carCalendaReservation?calendarNumber=${calendarDTO.carCalendarDTO.calendarNumber}";
$(function(){ //예약 페이지 팝업 창
	$("#reserVationBtn").click(function(){
		open(url,"reserVationBtn","width=500, height=500" );	
	});
}); */

</script>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>${calendarDTO.memberDTO.memId}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${calendarDTO.memberDTO.memName}</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${calendarDTO.carDTO.driveAge}</td>
		</tr>
		<tr>
			<td>차 이름</td>
			<td>${calendarDTO.carDTO.carName}</td>
		</tr>
		<tr>
			<td>차 이미지</td>
			<td>
				<c:forEach var="store" items="${stores}" varStatus="status">
					<img src="upload/${store}" width="100" height="100">
				</c:forEach> 
			</td>
		</tr>
		<tr>
			<td>출발 날짜</td>
			<td>${calendarDTO.carCalendarDTO.calendarDepartureDate}</td>
		</tr>
		<tr>
			<td>도착 날짜</td>
			<td>${calendarDTO.carCalendarDTO.calendarArrival}</td>
		</tr>
		<tr>
			<td>출발 지역</td>
			<td>${calendarDTO.carCalendarDTO.calendarStartingpoint}</td>
		</tr>
		<tr>
			<td>도착 지역</td>
			<td>${calendarDTO.carCalendarDTO.calendarDestination}</td>
		</tr>
		<tr>
			<td>출발 시간</td>
			<td>${calendarDTO.carCalendarDTO.startTime}</td>
		</tr>
		<tr>
			<td>도착 시간</td>
			<td>${calendarDTO.carCalendarDTO.destinationTime}</td>
		</tr>
		<tr>
			<td>예상 소요시간</td>
			<td>${calendarDTO.carCalendarDTO.predictionTime} 시간</td>
		</tr>
		<tr>
			<td>예상 금액</td>
			<td>${calendarDTO.carCalendarDTO.predictionPrice} 원</td>
		</tr>
		<tr>
			<td>참가인원</td>
			<td>${calendarDTO.carCalendarDTO.calendarParticipant}</td>
		</tr>
		<tr>
			<td>모집인원</td>
			<td>${calendarDTO.carCalendarDTO.calendarRecruitment}</td>
		</tr>
		<tr>
			<td>일정 등록 시간</td>
			<td>${calendarDTO.carCalendarDTO.calendarRegist}</td>
		</tr>
		<tr>
			<td colspan="3" >
				<a href="carCalendarList">목록</a>
				<a href="../main">메인</a>
				<a href="#">참가 신청</a>
				<input type="button" id="reserVationBtn" value="예약" onclick="carCalendaReservation()" />
			</td>
		</tr>
	</table>
</body>
</html>