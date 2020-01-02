<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#banner-list{	/* banner css */
		width: 188px;
	    height: 190px;
	    overflow: hidden;
	    float: left;
	    position: relative;
	    padding: 20px 7px;
	    border-bottom: 1px solid #ddd;
	    font-size: 12px;
	}
	p{ /* p tag css */
		width: 100%;
	    padding: 0;
	    margin: 0;
	    line-height: 160%;
	    cursor: default;
	    display: block;
	}
	#contest-name{
	}
</style>
</head>
<body>
<table>
	<tr>
		<td></td><td></td><td></td>
	</tr>
	<c:forEach var="contest" items="${contest }">
	<div id="banner-list">
	<a href="contestDetail?contestNum=${contest.contestNum }">
		<p id="img">
			<c:forTokens items="${contest.contestStorePoster}" delims="-" var="aa">
				<img src="Contest/upload/${aa}" />
			</c:forTokens>
		</p>
		<p id="contest-name"><h4>${contest.contestName }</h4></p>
	</a>
		<p id="contest-time"><fmt:formatDate value="${contest.contestStart }" pattern="yyyy.MM.dd"/> ~ <fmt:formatDate value="${contest.contestEnd }" pattern="yyyy.MM.dd"/></p>
		<p id="contest-organizer">${contest.contestOrganizer }</p>
	</div>
	</c:forEach>
</table>
</body>
</html>