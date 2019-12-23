<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function givingPrize() {
		var result = confirm("ㄹㅇ?");
		if (result) {
			location.href = "aduit?pNum=${participation.participationNum }"
		} else {

		}
	}
</script>
<script type="text/javascript">
	var locked = 0;
	function show(start) {
		if(locked)
			return;
		var i;
		var image;
		var el;
		var e = document.getElementById('startext');
		var stateMsg;
		
		for(i = 1; i <= star; i++){
			image = 'image' + i;
			el = document.getElementById(image)
		}
	}

</script>
</head>
<body>
	<table>
		<tr>
			<td>참가번호</td>
			<td>${participation.participationNum }번</td>
		</tr>
		<tr>
			<td>회원 아이디</td>
			<td>${participation.memId}</td>
		</tr>
		<tr>
			<td>참가자 이름</td>
			<td>${participation.memName }</td>
		</tr>
		<tr>
			<td>작품명</td>
			<td>${participation.workName }</td>
		</tr>
		<tr>
			<td>작품개요</td>
			<td>${participation.workOutline }</td>
		</tr>
		<tr>
			<td>상세내용</td>
			<td>${participation.workContent }</td>
		</tr>
		<tr>
			<td>작품사진</td>
			<td>${participation.workImage }사진으로 바꾸자</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="취소" onclick="history.go(-1)" />
				<c:if test="${memLev == 4}">
					<input type="button" value="심사"onclick="givingPrize()" />
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>