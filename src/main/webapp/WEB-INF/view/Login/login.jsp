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

		<form:form id="frm" name="frm" action="login" method="post" commandName="loginCommand">
			<table border =1 align=center>
				<tr>
					<td colspan="2"> 일반 회원 </td>
					<td colspan="2"><a href="comLogin" >기업 회원 </a></td>
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
					<td colspan=2>
						<a href="#">아이디 찾기</a>
						|
						<a href="#">비밀번호 찾기</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="member/memberInfo">회원가입</a>
				    </td>
				</tr>
			</table>
		</form:form>

</body>
</html>