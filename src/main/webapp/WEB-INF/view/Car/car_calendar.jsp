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
<title>일정 등록</title>
</head>
<body>
<h2>일정 등록</h2>
<form:form action="carCalendarWriterPro" method="GET" commandName="carCalendarCommand">
<label>출발 날짜</label>
<input type="date"  name="calendarDepartureDate" />
<br />
<label>출발 시간</label>
<input type="time" name="startTime" id ="startTime" />
<br />
<label>출발 지역</label>
<form:input path="calendarStartingpoint"  id = "calendarStartingpoint" />
<br />
<label>도착 날짜</label>
<input type="date"  name="calendarArrival" />
<br />
<label>도착 지역</label>
<form:input path = "calendarDestination" id = "calendarDestination" />
<br />
<label>도착 시간</label>
<input type="time" name="destinationTime" id="destinationTime" />
<br />
<label>예상 소요시간</label>
<form:input path="predictionTime" id="predictionTime" />
<br />
<label>예상 금액</label>
<form:input path="predictionPrice" id="predictionPrice" />
<br />
<input type ="submit" value="등록" >
<input type ="reset" value="취소" >
</form:form>
</body>
</html>