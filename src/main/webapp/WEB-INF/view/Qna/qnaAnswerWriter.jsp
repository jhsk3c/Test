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
	<h2>문의 답변</h2>
	<form:form action="qnaAnswerWriterPro" method="POST" commandName="qnaAnswerReplyCommand">
	<form:hidden path="qnaBoardNum"/>
	<form:hidden path="qnaCommand.qnaSubject"/>
	<form:hidden path="qnaCommand.qnaClassiFication" />
	<form:hidden path="qnaBoardReRef"/>
	<form:hidden path="qnaBoardReLev"/>
	<form:hidden path="qnaBoardReSeq"/>
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><form:input path="qnaCommand.qnaName" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><form:input path="qnaCommand.qnaPassword" /></td>
			</tr>
			<tr>
				<td>분류</td>
				<td>
			 		${qnaAnswerReplyCommand.qnaCommand.qnaClassiFication}
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${qnaAnswerReplyCommand.qnaCommand.qnaSubject}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><form:textarea cols="30" rows="30" path="qnaCommand.qnaContent" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="subBtn" value="작성"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>