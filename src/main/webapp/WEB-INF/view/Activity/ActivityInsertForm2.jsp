<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 활동 2차 양식 </title>
</head>
<body>
<form:form action="ActivityInsertPro2" method="post" commandName="activityCommand2" enctype="multipart/form-data">
<table>
	<tr>
		<td> 금액 </td>
		<td> <input type="text" id="activityCost" name="activityCost"> </td>
	</tr>
	<tr>
		<td> 물품을 선택하세요. </td>
		<td>
			<input type="radio" value="1" id="activityProduct" name="activityProduct"> 주체회원(본인) 개인 물품 
			<input type="radio" value="2" id="activityProduct" name="activityProduct"> 참여회원의 개인 물픔
			<input type="radio" value="3" id="activityProduct" name="activityProduct"> 헤윰에서 물품 대여
		</td>
	</tr>
</table>

</form:form>
</body>
</html>