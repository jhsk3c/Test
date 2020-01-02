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
<h1 align="center"> 문의 하기</h1>
<div align="center">
<form:form action="qnaWriterPro" method="POST" commandName="qnaCommand" enctype="multipart/form-data" >
	<table border="1"> 
		<tr>
			<th>제목</th>
			<td><form:input path="qnaSubject" class="w3-input" size="10" maxlength="10" /></td>
		</tr>
		<tr>
			<th>분류</th>
			<td>
			<form:select path="qnaClassiFication">
				<form:option value="기타" />
				<form:option value="휴양지" />
				<form:option value="차 환불" />
				<form:option value="숙소 환불" />
				<form:option value="활동 환불" />
				<form:option value="아토 상품 환불" />
				<form:option value="공모전" />
			</form:select>
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><form:textarea path="qnaContent" class="w3-input" cols="10" rows="10" /></td>
		</tr>
		<tr>
			<th>파일</th>
			<td><input type="file" name="qnaFileName"class="w3-input" multiple="multiple" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="작성" />
				<input type="reset" value="취소" />
			</td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>