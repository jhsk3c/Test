<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="participationWritePro" method="post" enctype="multipart/form-data" name="frm" commandName="participationCommand">
	<form:hidden path="contestNum"/>
		<table border="1" id="insertTable">
			<tr>
				<th>참가자명</th>
				<td>${authInfo.name }</td>
			</tr>
			<tr>
				<th>작품명</th>
				<td><form:input path="workName"/></td>
			</tr>
			<tr>
				<th>작품개요</th>
				<td><form:input path="workOutline"/></td>
			</tr>
			<tr>
				<th>작품이미지</th>
				<td><input type="file" name="workImage" multiple="multiple"/></td>
			</tr>
			<tr>
				<th>작품내용</th>
				<td><form:textarea path="workContent" cols="50" rows="20"/></td>
			</tr>
			<tr align="center">
				<td colspan=2>
					<input type="submit" value="신청" />
					<input type="button" value="취소" onclick="history.go(-1)" />
				</td>
			</tr>
	</table>
	
	</form:form>
</body>
</html>