<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Main/memtop.jsp" />
	
	<!-- 
	
	String vspotName; 이름
	String vspotIntroduce; 소개
	String vspotFeature; 특장점
	String vspotLocation1; 주소
	String vspotLocation2;
	String vspotLocation3;
	
	String[] vspotReport; 사진
	 -->
	 
	 
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<script>
	    function sample6_execDaumPostcode() {
	        new daum.Postcode({
	            oncomplete: function(data) {
	                var fullAddr = ''; // 최종 주소 변수
	                var extraAddr = ''; // 조합형 주소 변수
	                if (data.userSelectedType === 'R') { 
	                    fullAddr = data.roadAddress;
	
	                } else { // 사용자가 지번 주소를 선택했을 경우(J)
	                    fullAddr = data.jibunAddress;
	                }
	                if(data.userSelectedType === 'R'){
	                    if(data.bname !== ''){
	                        extraAddr += data.bname;
	                    }
	                    if(data.buildingName !== ''){
	                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
	                    }
	                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
	                }
	                document.getElementById('vspotLocation1').value = data.zonecode; //5자리 새우편번호 사용
	                document.getElementById('vspotLocation2').value = fullAddr;
	                document.getElementById('vspotLocation3').focus();
	            }
	        }).open();
	    }
	</script>
	 
	 
	 
	<form:form action="vspotPro" method="post" enctype="multipart/form-data" commandName="spotCommand">
		<table>
		
			<tr>
				<td> 신청 제목 </td>
				<td> <form:input path="vspotTitle" id="vspotTitle" size="20" maxlength="25" /> </td>
			</tr>
		
			<tr>
				<td> 휴양지 이름 </td>
				<td> <form:input path="vspotName" id="vspotName" size="20" maxlength="25" /> </td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="Loc" /> </td>
				<td width = "400"> <!-- 지역 -->
					<form:select path="vspotLoc" id="vspotLoc">
					    <option value="">-----선택해주세요-------</option>
					    <form:options items="${vspotLoc}" />
					</form:select>
					<form:errors path="vspotLoc" />
				</td>
			</tr>
			
			<tr>
				<td> 휴양지 소개 </td>
				<td> <form:textarea path="vspotIntroduce" rows="30" cols="35" id="vspotIntroduce"/> </td>
			</tr>
			
			<tr>
				<td> 휴양지 특장점 </td>
				<td> <form:input path="vspotFeature" id="vspotFeature" size="20" maxlength="50" /> </td>
			</tr>
			
			<tr>
				<td> 휴양지 주소 </td>
				<td>  
					<form:input path="vspotLocation1" id="vspotLocation1" size="12" maxlength="30" />
					<input type="button" name="zipCode" id="zipCode" value="우편번호 찾기"  onclick="sample6_execDaumPostcode()" > <br/>
					<form:input path="vspotLocation2" id="vspotLocation2" size="30" maxlength="25"/>
					<form:input path="vspotLocation3" id="vspotLocation3" size="30" maxlength="25" />
				</td>
			</tr>
			
			<tr>
				<td> 휴양지 사진 </td>
				<td> <input type="file" id="vspotReport" name="vspotReport" multiple="multiple"/> </td>
			</tr>
		
			<tr>
				<td colspan="2"> 
					<input type="submit" value="등록" />
					<input type="button" value="뒤로" onclick="javascript:history.back();"/>
				</td>
			</tr>
		
		</table>
	</form:form>
</body>
</html>