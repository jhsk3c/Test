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
<h2>차 등록  목록</h2>
<label>번호</label>
<label>이름</label>
<label>종류</label>
<label>차량이름</label>
<label>시간</label>
<label>승인 여부</label>
<br />
<c:forEach var="list" items="${list}" >
<a href="carDetail?driveNum=${list.driveNum}">
<c:if test="${memLev == 1}">
<c:if test="${list.carApproval == 0}">
${list.driveNum}
${list.driveName}
${list.carKinds}
${list.carName}
${list.carRegist}
승인중
<c:if test="${list.carApproval == 1}">
승인완료
</c:if>
<c:if test="${list.carApproval == 2}">
승인거절
</c:if>
</c:if>
</c:if>
</a>
<br />
<a href="carDetail?driveNum=${list.driveNum}">
<c:if test="${memLev == 4}">
<c:if test="${list.carApproval == 0}">
${list.driveNum}
${list.driveName}
${list.carKinds}
${list.carName}
${list.carRegist}
승인중
</c:if>
</c:if>
</a>
</c:forEach>
<a href="carWriter">등록</a>
</body>
</html>