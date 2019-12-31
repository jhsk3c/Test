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
<script type="text/javascript" 
	src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
</script>
</head>
<body>
<h2>문의 목록</h2>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>분류</td>
			<td>답변여부</td>
			<td>날짜</td>
		</tr>
	<c:forEach  var="qna" items="${qna}" varStatus="status">
		<tr>
			<td>${qna.qnaBoardNum}</td>
			<td><a href="qnaDetail?num=${qna.qnaBoardNum}">${qna.qnaBoardSubject}</a></td>
			<td>${qna.userId}</td>
			<td>${qna.qnaClassiFication}</td>
			<td>${qna.qnaAnswerCheck}</td>
			<td>${qna.qnaRegist}</td>
		</tr>
	</c:forEach>
		<tr>
			<td><a href="qnaWriter">글쓰기</a></td>	
		</tr>
	</table>
</body>
</html>