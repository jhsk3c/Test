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
			<td>회원 아이디</td>
			<td>참가자 이름</td>
			<td>참가 날짜</td>
			<td colspan="2">참가 공모전</td>
		</tr>
		<c:forEach var="participation" items="${participation }">
			<script type="text/javascript">
				function givingPrize(){
					var result = confirm("ㄹㅇ?");
					if(result){
						location.href="givingPrize?pNum=${participation.participationNum }"
					} else {
						
					}
				}
			</script>
			<tr>
				<td><a href="#회원정보로갑시다">${participation.memId }</a></td>
				<td>${participation.memName }</td>
				<td><fmt:formatDate value="${participation.participationDate }" pattern="yyyy년 MM월 dd일"/></td>
				<td>contestName</td>
				<td><input type="button" value="1등" onclick="givingPrize()" /></td>
			</tr>
			${participation.participationNum }
		</c:forEach>
	</table>
</body>
</html>