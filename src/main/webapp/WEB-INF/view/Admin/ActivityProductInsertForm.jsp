<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 물픔 등록  ActivityProductInsertForm </title>
</head>
<body>
<!-- 상단  -->
<jsp:include page="../Main/admintop.jsp" />


<!-- 중단  -->
<form:form action="activityProductInsertPro" commandName="activityProductCommand" method="post" enctype="multipart/form-data">
<input type="hidden" name="stNum" value="${list.storeNum }"/>

<table>
	<tr>
		<td> 물품 종류 </td>
		<td>
			<form:select path="productOption"  name="productOption">
					<option> 차(자전거) </option>
					<option> 산악용품 </option>
					<option> 바베큐용품 </option>
					<option> 기타용품 </option>
			</form:select>
		</td>
	</tr>
	<tr>
		<td> 물품 이름 </td>
		<td> <input type="text" name="productName" id="productName" /></td>
	</tr>
	<tr>
		<td> 물품 가격 </td>
		<td> <input type="text" name="productPrice" id="productPrice" />
	</tr>
	<tr>
		<td> 사진 </td>
		<td> <input type="file" name="productIamge" id="productIamge" />
	</tr>
	<tr>
		<td> 물품 설명 </td>
		<td> <form:textarea path="productContent" id="productContent" />
	</tr>
	<tr>
		<td colspan="2">  <input type="submit" value="등록" /> </td>
	</tr>
</table>
</form:form>



</body>
</html>