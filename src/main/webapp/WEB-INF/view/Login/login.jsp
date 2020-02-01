<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>
<body>
<!-- 상단 -->
<jsp:include page="../Main/top.jsp" />



<!-- 중단 -->









<div style="width:50%">
	<form:form id="frm" name="frm" action="login" method="post" commandName="loginCommand">
			<table class="w3-tabl3-all w3-hoverable" align=center>
				<tr>
					<td colspan="2"> 일반회원 </td>
					<td colspan="2"><a href="comLogin" >기업회원 </a></td>
				</tr>
				
					<tr>
						<td>아이디</td>
							<td>
							    <form:input id="memId" path="memId" /> <form:errors path="memId"/>
							</td>
						<td>
							<form:checkbox path="inputIdStore" value="store" /> 아이디체크
						</td>
					</tr>
						
					<tr>
						<td>비밀번호</td>
							<td>
								<form:password  id="memPw" path="memPw" /> <form:errors path="memPw"/>
							</td>
						<td>
							<input type="submit" id="btn" value="로그인" />
						</td>
					</tr>
				
				<tr>
					<td colspan=2 style="align:center;">
						<a href="#">아이디 찾기</a>
						
						<a href="#">비밀번호 찾기</a>
				    </td>
				</tr>
			</table>
		</form:form> 
	</div>
		
		
		
		
		

</body>
</html>