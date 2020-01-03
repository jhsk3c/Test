<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<td>참가번호</td>
			<td>회원 아이디</td>
			<td>참가날짜</td>
			<td colspan="2">평가 상태</td>	
		</tr>
		<c:forEach var="participation" items="${participation }">
		<tr>
			<td>${participation.participationNum }</td>
			<td>${participation.memId }</td>
			<td><fmt:formatDate value="${participation.participationDate }" pattern="yyyy년 MM월 dd일"/></td>
			<td>${participation.aduitStatus }</td>
			<td><a href="participationDetail?memId=${participation.memId }&pNum=${participation.participationNum}">상세보기</a></td>
		</tr>
			<script type="text/javascript">
				function participationDetail(){
					location.href="participationDetail?pNum=${participation.participationNum }"
				}
			</script>
		</c:forEach>
		<tr>
			<td colspan="5" align="center">
				<input type="button" value="뒤로" onclick="history.go(-1)" />
			</td>
		</tr>
	</table>
</body>
</html>