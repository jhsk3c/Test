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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>차 등록증</title>
<script type ="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<h2>차 등록 서류</h2>
	<form:form action="carWriterPro" method="post" commandName="carWriterCommand"
	enctype="multipart/form-data"  >
				<label>운전자 이름</label>
					<form:input path="driveName" id="driveName" />
					<form:errors path="driveName" />
				 <br />
				<label>운전자 나이</label>
					<form:input path="driveAge" id="driveAge" /> <br />
				<label>운전 면허 종류</label>
					<form:select path="driveLicenseInfo">
						<form:option value="선택하세요" />
						<form:option value="1종" />
						<form:option value="2종" />
						<form:option value="1종 대형" />
					</form:select><br />
				<label>운전 면허증</label>
					<input type="file" name = "driveLicense" id="driveLicense" multiple="multiple"><br />
				<label>보험 증명서</label>
					<input type="file" name = "driveInsurance" id="driveInsurance" multiple="multiple"><br />
				<label>자차 확인서</label>
					<input type="file" name = "driveCarCheck"id="driveCarCheck" multiple="multiple"><br />
				<label>차량 이름</label>
					<form:input path="carName" id="carName" /><br />
				<label>차량 번호</label>
					<form:input path="carNum" id="carNum" /><br />
				<label>차량 사진</label>
					<input type="file" name="carImage" id="carImage" multiple="multiple"><br />
				<label>차량 크기</label>
					<form:input path="carSize" id="carSize" /><br />
				<label>차량 종류</label>
					<form:select path="carKinds" id="carKinds" >
						<form:option value="선택하세요" />
						<form:option value="소형" />
						<form:option value="중형" />
						<form:option value="대형" />
					</form:select><br />
				<label>소개</label><br />
					<form:textarea  path="carContent" rows="10" cols="30" ></form:textarea><br />
					<input type ="submit" value="등록" >
					<input type ="reset" value="취소" >
	</form:form>
</body>
</html>