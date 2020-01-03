<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
th {
	font-size: 15px;
	width: 100px;
	height: 27px;
	text-align: left;
}

#header {
	width: 100%;
	height: 49px;
	line-height: 20px;
	padding: 14px;
	border-bottom: 1px solid #ddd;
	font-size: 15;
}

#contest-detail {
	width: 100%;
	height: auto;
	overflow: hidden;
	position: relative;
	padding: 30px 16px 50px 16px;
}
</style>
<script type="text/javascript">
	function goModify(){
		location.href="contestModify?contestNum=${contest.contestNum}";
	}
	
	function goDelete(){
		location.href="contestDelete?contestNum=${contest.contestNum}";
	}

	function goParticipation(){
		if(<%=session.getAttribute("memLev")%> == null){
			alert("로그인 후 사용가능합니다.");
			location.href="login";
		} else{
			location.href="participation?contestNum=${contest.contestNum}";
		}
	}
</script>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1>공모전 상세보기</h1>
		</div>
		<div id="contest-detail">
			<table border="1" style="width: 520px; height: 224px;">
				<tr>
					<th>● 주최자</th>
					<td>${contest.contestOrganizer}</td>
				</tr>
				<tr>
					<th>● 접수방법</th>
					<td>${contest.contestEntryWay}</td>
				</tr>
				<tr>
					<th>● 참가자격</th>
					<td>${contest.contestCondition}</td>
				</tr>
				<tr>
				<th>● 접수기간</th>
					<td>
						<fmt:formatDate value="${contest.contestStart }" pattern="yyyy-MM-dd"/> ~ 
						<fmt:formatDate value="${contest.contestEnd }" pattern="yyyy-MM-dd"/>
					</td>
				</tr>
				<tr>
					<th>● 시상종류</th>
					<td>${contest.contestPrizeWay}</td>
				</tr>
				<tr>
					<th>● 시상금</th>
					<td>${contest.contestPrize}원</td>
				</tr>
			</table>
		</div>
		<input type="button" value="목록" onclick="history.go(-1);"/>
		<c:if test="${memLev != 4 }"><!-- 관리가자 아닐경우 참가가능 -->
		<input type="button" value="참가" onclick="goParticipation();"/>
		</c:if>
		<c:if test="${memLev == 4 }"><!-- 관리자만 수정&삭제가능 -->
		<input type="button" value="수정" onclick="goModify();"/>
		<input type="button" value="삭제" onclick="goDelete();"/>
		</c:if>
	</div>
</body>
</html>