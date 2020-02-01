<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 혜윰 </title>

	<style type="text/css">
		table { 
			border-spacing: 30px;		
			width : 80%;
			align : center;
		}
		.all {
			position: relative; 
		    left: 0%; 
		    top: 100px;
		}
		.title {
			font-weight: 800 !important;
	    	margin-bottom: 0px !important;
		    font-size: 24px !important;
		    line-height: 30px !important;
		    letter-spacing: normal !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    color: rgb(72, 72, 72) !important;
		    padding-top: 2px !important;
		    padding-bottom: 2px !important;
		    position: relative; 
		    left: 7.4%; 
		    top: 18px;
		}
	</style>
	
	
</head>
<body>


<c:if test="${empty authInfo}">
	<jsp:include page="top.jsp" />
</c:if>	
<c:if test="${Lev eq 1}">
	<jsp:include page="memtop.jsp" />
</c:if> 
<c:if test="${Lev eq 2}">
	<script type="text/javascript">
		alert("승인 대기중인 회원입니다.");
		history.back();
	</script>
</c:if> 
<c:if test="${Lev eq 3}">
	<a href ="logout">로그아웃</a>
</c:if> 
<c:if test="${Lev eq 4}">
	<jsp:include page="admintop.jsp" />
</c:if> 
<c:if test="${Lev eq 6}">
	<jsp:include page="memtop.jsp" />
</c:if> 
	
	
	
	

	
<div class="all">
	<div style="width:90%">
		<div class="title">추천하는 여행지
			<div style="float:right">
				<a href="memvspotList"> 
					<img alt="viewMore" src="img/next.png" width=30px height=30px/>
				</a>
			</div>
		</div>
	</div>
	<div style="width:90%;padding-top:30px">
		<table align="center">
			<c:set var="i" value="0" />
			<c:set var="j" value="4" />
			<c:forEach var="list" items="${list}" varStatus="status"> 
				<c:if test="${i < 4 }">
				<c:if test="${i%j == 0 }" >
					<tr>
				</c:if>	
						<td> 
							<c:forTokens items="${list.vspotStore}" delims="-" var="store" end="0">
								<a href="vspotListDetail?num=${list.vspotNum}">
									<img src="Spot/upload/${store}" alt="X"  width="300" height="300" style="border-radius: 25px;">
								</a>
							</c:forTokens> <br>
							${list.vspotTitle} <br>
							${list.vspotLoc}
						</td> 
				<c:if test="${i%j == j-1 }" > 
					</tr>
				</c:if> 
				<c:set var="i" value="${i+1 }" />
				</c:if>
			</c:forEach>
		</table>
	</div>
</div>
	
	



<!-- 활동 -->
<div class="all" style="padding-top:50px;">
	<div style="width:90%">
		<div class="title"> 활동 
			<div style="float:right">
				<a href="ActivityList"> 
					<img alt="viewMore" src="img/next.png" width=30px height=30px/>
				</a>
			</div>
		</div>
	</div>
	<div style="width:90%;padding-top:30px">
		<table align="center">
			<c:set var="i" value="0" />
			<c:set var="j" value="4" />
			<c:forEach var="list2" items="${list2}" varStatus="status"> 
				<c:if test="${i < 4 }">
				<c:if test="${i%j == 0 }" >
					<tr>
				</c:if>	
						<td>
							<c:forTokens items="${list2.storeFilename}" delims="-" var="store" end="0">
								<a href="vspotListDetail?num=${list2.activityNum}">
									<img src="Activity/upload/${store}" alt="X"  width="300" height="300" style="border-radius: 25px;">
								</a>
							</c:forTokens> <br>
						${list2.activityName} <br>
						${list2.activityCity}
						</td> 
				<c:if test="${i%j == j-1 }" > 
					</tr>
				</c:if> 
					<c:set var="i" value="${i+1 }" />
				</c:if>
			</c:forEach>
		</table>
	</div>
</div>
	
	
	
	
	
	
</body>
</html>