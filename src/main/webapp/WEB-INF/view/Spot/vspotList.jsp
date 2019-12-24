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
		<c:set var="i" value="0" />
		<c:set var="j" value="2" />
		<c:forEach var="list" items="${list}" varStatus="status"> 

			<c:if test="${i%j == 0 }" >
				<tr align="center">
			</c:if>	
					<td> 
						<%-- <c:forEach var="store1" items="${Store}" varStatus="status"  >
							<a href="#"> ${Original[status.index] } </a><br/> 	
						</c:forEach> --%>
						<c:forTokens items="${list.vspotStore}" delims="-" var="store" end="0">
							<img src="Spot/upload/${store}" alt="X" width="100" height="100">
						</c:forTokens>
					
					</td>
					<td> ${list.vspotTitle} </td>
					<td> ${list.vspotLoc} </td>
				
					
			<c:if test="${i%j == j-1 }" > 
				 </tr>
			</c:if> 
			
			<c:set var="i" value="${i+1 }" />

		</c:forEach>
	</table>

</body>
</html>