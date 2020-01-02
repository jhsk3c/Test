<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>장바구니 확인</h2>
	<c:choose>
		<c:when test="${map.count == 0}">
			장바구니가 비어있습니다.
		</c:when>
		<c:otherwise>
			<form method="post" action="#">
				<table border="1">
					<tr>
						<th>상품명</th>
						<th>단가</th>
						<th>수량</th>
						<th>금액</th>
						<th>취소</th>
					</tr>
					<c:forEach var="list" items="${list }">
						<tr>
						<th>${list.goodsDTO.goodsName }</th>
						<th>${list.goodsDTO.goodsPrice }원</th>
						<th>${list.cartDTO.qty }개</th>
						<th>다시</th>
						<th>?</th>
					</tr>
					</c:forEach>
				</table>
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>