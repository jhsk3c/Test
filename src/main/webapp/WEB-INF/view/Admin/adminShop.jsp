<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="../Main/admintop.jsp" />
	
	
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
	                document.getElementById('shopLocation1').value = data.zonecode; //5자리 새우편번호 사용
	                document.getElementById('shopLocation2').value = fullAddr;
	                document.getElementById('shopLocation3').focus();
	            }
	        }).open();
	    }
	    
	</script>
	 

	<form:form action="adminshopPro" method="post" enctype="multipart/form-data" commandName="shopCommand">
		<input type="hidden" name="num" value="${vspot.vspotNum }" />
		<table>
		
			<tr>
				<td> 상점 분류 </td>
				<td> 
					<input type="radio" id="shopCategory1" value="맛집" name="shopCategory" checked="checked" />맛집
					<input type="radio" id="shopCategory2" value="카페" name="shopCategory" />카페 
				</td>
			</tr>
			
			<tr>
				<td> 상점 이름 </td>
				<td> <form:input path="shopName" id="shopName" size="20" /> </td>
			</tr>
			
			<tr>
				<td> 상점 영업 시간 </td>
				<td> <input type="time" id="shopTime1" name="shopTime1"> - <input type="time" id="shopTime2" name="shopTime2"> </td>
			</tr>
			
			<tr>
				<td> 상점 휴무 </td>
				<td> <form:input path="shopClosed" id="shopClosed" size="30" /> </td>
			</tr>
			
			<tr>
				<td> 상점 지역 </td>
				<td>  
					<input name="shopLoc" id="shopLoc" size="20" value="${vspot.vspotLoc }" readonly />
				</td>
			</tr>
			
			<tr>
				<td> 상점 위치 </td>
				<td> 
					<form:input path="shopLocation1" id="shopLocation1" size="12" maxlength="30" />
					<input type="button" name="zipCode" id="zipCode" value="우편번호 찾기"  onclick="sample6_execDaumPostcode()" > <br/>
					<form:input path="shopLocation2" id="shopLocation2" size="30" maxlength="25"/>
					<form:input path="shopLocation3" id="shopLocation3" size="30" maxlength="25" />
				</td>
			</tr>
			
			<tr>
				<td> 상점 한줄 소개 </td>
				<td> <form:input path="goodsIntro" id="goodsIntro" size="20" /> </td>
			</tr>
	
			<tr>
				<td> 상점 사진 </td>
				<td> <input type="file" id="goodsReport" name="goodsReport" multiple="multiple"/> </td>
			</tr>
			
			<tr>
				<td> 상점 소개 </td>
				<td> <form:textarea path="goodsContext" cols="30" rows="30"  /> </td>
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