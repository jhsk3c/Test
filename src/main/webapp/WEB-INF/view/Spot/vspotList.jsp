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
	<jsp:include page="../Main/top.jsp" />
	<table border="1" width="80%" align="center">
	

		<c:forEach var="list" items="${list}" varStatus="status"> 
			<tr align="center">
				<td> <a href="#">${status.count } </a></td>
				<td> ${list.memId} </td>
				<td> ${list.vspotTitle} </td>
				<td> ${list.vspotName} </td>
				<td> <img alt="ss" src="" /> </td>
			</tr>
		</c:forEach>
	</table>

<%-- <table width="100%" celladding="0" cellspacing="0">	
			<%
			   int j=0;
			for(int i = 0; i < list.size(); i ++) {
				JoinDTO dto1 = list.get(i);
				if(j%4 == 0) {
			
			%>
		
		
		<tr align="center">

			<%}	%>
			<td align="center">
				<a href="TeacherDetail.to?num=<%= dto1.getJoinNum() %>"><img src="Join/upload/<%= dto1.getJoinImage() %>" width="300" height="300"></a>
				<p><%= dto1.getJoinName() %></p>
				<p><%= dto1.getJoinLoc() %></p>
				<p><%= dto1.getJoinPrice() %></p>
				<p><%= dto1.getJoinIntro() %></p>
			</td>
			
			<%j = j+1; } %>
			</tr>
		</table>
		</div>
	<div>		
		<table class="table table-borderless">
			<tr> --%>

</body>
</html>