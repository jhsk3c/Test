<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="member.register" /></title>


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
                document.getElementById('memAddr1').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('memAddr2').value = fullAddr;
                document.getElementById('memAddr3').focus();
            }
        }).open();
    }
</script>

<script type ="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	
</script>

</head>
<body>
	<form:form action="memberInfoPro" name="frm" id="frm" method="post" commandName="memberCommand"><!-- 컨틑롤러로부터 날라온걸 폼에다가 주게되면 이 페이지가 열릴때 커맨드 객체에 이이름과 같은게 있다면 커맨드 객체이 있는것을 얘한테 준다. -->
		<table width= 600 align="center" border="1">
			<tr>
				<td width = "200"> <spring:message code="member.info" /> </td>
				<td width = "400">
					<form:input path="memId" size="12" maxlength="10" id="memId" />
					<input type="button" name="userConfirm" id="userConfirm" value="중복확인" />
					<form:errors path="memId" />
					<div class="checkrsw2+21`_font" id="id_check"></div>
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="password" /> </td>
				<td width = "400">
					<form:password path="memPw" id="memPw" size="12" maxlength="10" /><!-- 커맨드객체의 멤버필드명하고 무조건 같게 준다고 생각을 하자!!!! path="값"을 -->
					<form:errors path="memPw" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="password.confirm" /> </td>
				<td width = "400">
					<form:password path="memPwCon" id="memPwCon" size="12" maxlength="10" />
					<form:errors path="memPwCon" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="name" /> </td>
				<td width = "400">
					<form:input path="memName" id="memName" size="12" maxlength="10" />
					<form:errors path="memName" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="birth" /> </td>
				<td width = "400"> <!-- 패턴 주기 -->
					<form:input  path="memBirth" id="memBirth" size="12" maxlength="10" />
					<form:errors path="memBirth" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="gender" /> </td>
				<td width = "400">
					남자 : <input type="radio" name="memSex" id="memSex" value="M" checked="checked" />
					여자 : <input type="radio" name="memSex" id="memSex" value="F"  />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="nationality" /> </td>
				<td width = "400"> <!-- 국가 -->
					<form:select path="memNationality" id="memNationality">
					    <option value="">-----선택해주세요-------</option>
					    <form:options items="${memNationality}" />
					</form:select>
					<form:errors path="memNationality" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="loc" /> </td>
				<td width = "400"> <!-- 지역 -->
					<form:select path="memLoc" id="memLoc">
					    <option value="">-----선택해주세요-------</option>
					    <form:options items="${memLoc}" />
					</form:select>
					<form:errors path="memLoc" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="email" /> </td>
				<td width = "400">
					<form:input path="memEmail" id="memEmail" size="30" maxlength="30" />
					<form:errors path="memEmail" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="addr" /> </td>
				<td width = "400"> 
					<form:input path="memAddr1" id="memAddr1" size="13" maxlength="30" />
					<input type="button" name="zipCode" id="zipCode" value="우편번호 찾기"  onclick="sample6_execDaumPostcode()" > <br/>
					<form:input path="memAddr2" id="memAddr2" size="30" maxlength="25"/>&nbsp;<form:errors path="memAddr2" />
					<form:input path="memAddr3" id="memAddr3" size="30" maxlength="25" />
				</td>
			</tr>
		
			<tr>
				<td width = "200"> <spring:message code="phone" /> </td>
				<td width = "400"> <!-- 패턴 주기 -->
					<form:input path="memTel" id="memTel" size="30" maxlength="20" />
					<form:errors path="memTel" />
				</td>
			</tr>
			
			<tr>
				<td width = "200"> <spring:message code="preference" /> </td>
				<td width = "400"> <!-- 선호 여행법 -->
					<form:select path="memPreferTrip" id="memPreferTrip">
					    <option value="">-----선택해주세요-------</option>
					    <form:options items="${memPreferTrip}" />
					</form:select>
					<form:errors path="memPreferTrip" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="<spring:message code="register.btn" />" />
					<input type="reset" value="다시 입력" />
					<input type="button" value="가입 안함" />
				</td>
			</tr>
			
			
		</table>
	</form:form>
</body>
</html>