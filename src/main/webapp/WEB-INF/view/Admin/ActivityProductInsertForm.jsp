<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 물픔 등록  </title>
</head>
<body>
<!-- 상단  -->
<jsp:include page="../Main/admintop.jsp" />


<!-- 중단  -->


<form:form class="form-inline" action="activityProductInsertPro" commandName="activityProductCommand" method="post" enctype="multipart/form-data">
<input type="hidden" name="stNum" value="${list.storeNum }"/>
<div class="jumbotron" style="background:white;border:1px solid lightgrey;border-radius:25px;padding-left:100px;padding-right:100px;margin:100px auto;width:80%">
	<div class="text-center">
		<h4>${storeName } 의 물품 등록</h4>
	</div>
	
	<table class="table text-center" style="width:90%;margin:50px auto">
		<tr>
			<td class="text-center"> 물품 종류 </td>
			<td>
				<form:select class="form-control" path="productOption"  name="productOption">
						<option> 차 (자전거 포함) </option>
						<option> 산악 </option>
						<option> 바베큐 </option>
						<option> 문화 체험 </option>
						<option> 기타 </option>
				</form:select>
			</td>
		</tr>
		<tr>
			<td> 물품 이름 </td>
			<td> <input class="form-control" type="text" name="productName" id="productName" /></td>
		</tr>
		<tr>
			<td> 물품 가격 </td>
			<td> <input class="form-control" type="text" name="productPrice" id="productPrice" />
		</tr>
		<tr>
			<td> 사진 </td>
			<td> <input style="margin-left:260px" type="file" name="productIamge" id="productIamge" />
		</tr>
		<tr>
			<td> 물품 설명 </td>
			<td> <form:textarea class="form-control" path="productContent" id="productContent" />
		</tr>
		<tr>
			<td colspan="2">  <input class="btn btn-success" style="margin-left:50px;margin-top:20px" type="submit" value="등록" /> </td>
		</tr>
	</table>
</div>

</form:form>



</body>
</html>