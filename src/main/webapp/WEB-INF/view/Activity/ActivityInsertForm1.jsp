<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 활동 생성 </title>
</head>
<body>
<div style="align:center">
<form:form action="ActivityInsertPro" commandName="activityCommand1" method="post" enctype="multipart/form-data">
<table>

	<tr>
		<td> 활동 종류를 선택해주세요! </td>
		<td>
			<select id="sortOfActivity"  name="sortOfActivity" multiple="multiple">
				<option> 실내 </option>
					<option> 혼자 해요 </option>
					<option> 함께 해요 </option>
				<optgroup label="실 외">
					<option> 산에서 </option>
					<option> 바다에서 </option>
					<option> 길에서 </option>
					<option> 동물과 </option>
					<option> 먹어요 </option>
					<option> 속도를 즐겨요 </option>
					<option> 배워요! </option>
				</optgroup>
			</select>
		</td>
	</tr>
	
	<tr>
		<td> 한 줄 소개 </td>
		<td> <input type="text" name="activityName" id="activityName"/> </td>
	</tr>
	<tr>
		<td> 지역 </td>
		<td> <input type="text" name="activityCity" id="activityCity" /> </td>
	</tr>
	<tr>
		<td> 모집기간 </td>
		<td>  </td>
	</tr>
	<tr>
		<td> 활동일 </td>
		<td>  </td>
	</tr>
	<tr>
		<td> 모집 인원 </td>
		<td> <input type="text" name="recruitPeople" id="recruitPeople" /> </td>
	</tr>
	<tr>
		<td> 사용할 활동 물품 </td>
		<td> <input type="text" id="whichProduct" name="whichProduct" /> </td>
	</tr>
	
	<tr>
		<td> 참여 가능 나이 </td>
		<td> <input type="text" name="limitAge" id="limitAge" /> </td>
	</tr>
	<tr>
		<td> 사진 </td>
		<td> <input type="file" name="actiImage" id="actiImage" multiple="multiple" />  </td>
	</tr>
	<tr>
		<td> 활동 소개 </td>
		<td> <form:textarea rows="60" cols="60" path="activityText" id="activityText"/> </td>
	</tr>	
	<tr>
		<td><input type="submit" value="제출"  /></td>
	</tr>
</table>
</form:form>
</div>

</body>
</html>