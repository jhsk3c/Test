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

<style type="text/css">
	table { 
		border-spacing: 30px;		
		width : 80%;
		align : center;
	}
</style>
</head>
<body>
	<jsp:include page="../Main/top.jsp" />
		<table align="center">
		<c:set var="i" value="0" />
		<c:set var="j" value="4" />
		<c:forEach var="list" items="${list}" varStatus="status"> 

			<c:if test="${i%j == 0 }" >
				<tr>
			</c:if>	
					<td> 
						<c:forTokens items="${list.vspotStore}" delims="-" var="store" end="0">
							<a href="vspotListDetail?num=${list.vspotNum}">
								<img src="Spot/upload/${store}" alt="X"  width="300" height="300">
							</a>
						</c:forTokens> <br>
						${list.vspotTitle} <br>
						${list.vspotLoc}
					</td> 
			<c:if test="${i%j == j-1 }" > 
				</tr>
			</c:if> 
			<c:set var="i" value="${i+1 }" />
		</c:forEach>
	</table>

</body>
</html>