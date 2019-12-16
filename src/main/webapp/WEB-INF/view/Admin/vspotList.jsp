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
	<table border="1" width="80%" align="center">
		<tr>
			<td colspan="8" align="right"> 글 개수 : ${Count} </td> 
		</tr>
		<tr>
			<th>번호</th>
			<th> 회원 아이디 </th>
			<th>휴양지 이름</th>
			<th>휴양지 사진</th>
			<th>휴양지 위치</th>
			<th>휴양지 소개</th>
			<th>가입일</th>
			<th>구분</th>
		</tr>
		<tr>
		<td>
		${original}
		<%-- <c:forEach var="store" items="${store }" varStatus="status"  >
					<a href="fileUpload?filename=${store}&page=${page}">${original[status.index] }  </a>
				</c:forEach>--%>
		</td> 
		</tr>
		<!-- 해야 할일 : 파일 다운로드와 / 미승인 눌렀을 시 파일이 폴더에서 삭제되게 하는게====>>>>> -->
	<c:forEach var="list" items="${list}" varStatus="status"> 
		<tr align="center">
			<td> ${status.count } </td>
			<td> ${list.memId} </td>
			<td> ${list.vspotName} </td>
			<td> 		
				<a href="fileUpload?filename=${list.vspotStore}&page=${page}"> ${list.vspotOriginal}</a>	
			</td>
			<td> ${list.vspotLocation} </td>
			<td> ${list.vspotIntroduce} </td>
			<td><fmt:formatDate value="${list.vspotDate}" pattern="yyyy-MM-dd"/></td>
			<td>
				<a href="#">승인</a>
				<a href="#">미승인</a>
			</td>
		</tr>
	</c:forEach>
	
	 	<tr align=center height=20 >
			<td colspan = 8>
			<c:if test="${page <= 1}">
				[이전]&nbsp; <!-- 첫 페이지  -->
			</c:if>
			<c:if test="${page > 1}">
				<a href = "memVspot?page=${page -1}">[이전]</a>&nbsp;
			</c:if>
			
			<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
				<a href = "memVspot?page=${i}">[ ${i} ]</a>&nbsp;
			</c:forEach>
			
			<c:if test="${page >= maxPage}">	
				[다음]&nbsp; <!-- 마지막 페이지  -->
			</c:if>
			<c:if test="${page < maxPage}">	
				<a href = "memVspot?page=${page +1}">[다음]</a>&nbsp;
			</c:if>
			</td>
		</tr> 
		
	</table>

</body>
</html>