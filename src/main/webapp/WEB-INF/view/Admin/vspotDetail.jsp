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

	<table border="1" width="60%" align="center">
		
		<tr>
			<td> 회원 번호 </td>
			<td> ${list.memNum} </td>
		</tr>
		
		<tr>
			<td> 회원 아이디 </td>
			<td> ${list.memId} </td>
		</tr>
		
		<tr>
			<td> 신청 날짜 </td>
			<td> <fmt:formatDate value="${list.vspotDate}" pattern="yyyy-MM-dd"/> </td>
		</tr>
		
		<tr>
			<td> 신청 제목 </td>
			<td> ${list.vspotTitle} </td>
		</tr>
		
		<tr>
			<td> 휴양지 이름 </td>
			<td> ${list.vspotName} </td>
		</tr>
		
		<tr>
			<td> 휴양지 특장점 </td>
			<td> ${list.vspotFeature} </td>
		</tr>
		
		<tr>
			<td> 휴양지 위치 </td>
			<td> ${list.vspotLocation} </td>
		</tr>
		
		<tr>
			<td> 휴양지 소개 </td>
			<td> ${list.vspotIntroduce} </td>
		</tr>
		
		<tr>
			<td> 휴양지 사진 </td>
			<td> 
				<c:forEach var="store" items="${store}" varStatus="status"  >
					<a href="fileUpload?filename=${original[status.index] }&filename1=${store}"> ${original[status.index] } </a><br/> 
					<%-- <a href="../Spot/upload/${store}"> ${store[status.index] } </a><br/>  --%>
					<img width="300" height="200" src="../Spot/upload/${store}"><br/>
				</c:forEach>
			
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"> 
				<input type="button" value="승인" onClick="location.href='vspotListTrue?num=${list.vspotNum}&page=${page}';"/> 
				<input type="button" value="미승인" onClick="location.href='vspotListFalse?num=${list.vspotNum}&page=${page}';"/>  
				<input type="button" value="뒤로가기" onClick="location.href='memVspot?&page=${page}';"/>  
			</td>

		</tr>
		
	</table>
</body>
</html>