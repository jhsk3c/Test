<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css ">
</head>
<body>
	<h1 align="center">문의 사항</h1>
	<table border="1" align="center" >
		<tr>
			<td>제목</td>
			<td>${qna.qnaBoardSubject}</td>
		</tr>
		<tr>
			<td>분류</td>
			<td>${qna.qnaClassiFication}</td>
		</tr>
		<tr>
			<td>답변여부</td>
			<td>${qna.qnaAnswerCheck}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${qna.qnaBoardContent}</td>
		</tr>
		<tr>
			<td>파일</td>
			<td><c:forEach var="qna" items="${store}" varStatus="status">
					<img src="../Qna/upload/${qna}" class="w3-round" alt="Norway" >
		${original[status.index]} <br />
					<!-- 파일이름  -->
				</c:forEach></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="qnaBoardReply?num=${qna.qnaBoardNum}">답변</a>
				<a href="qnaList">목록</a>
			</td>
		</tr>
		</table>
	<c:if test="${qna.qnaAnswerCheck != '문의 접수'}" >
		<!-- 관리자꺼 -->
		<h2 align="center">${qnaAdmin.qnaBoardSubject}</h2>
		<div align="center">
			<label>작성자</label>
			<label>${qnaAdmin.userId}</label><br />
			<label>분류</label>
			<label>${qnaAdmin.qnaClassiFication}</label><br />
			<label>내용</label>
			<label><textarea>${qnaAdmin.qnaBoardContent}</textarea></label><br />
			<label>답변 시간</label>
			<label>${qnaAdmin.qnaRegist}</label><br />
		</div>
	</c:if>
</body>
</html>