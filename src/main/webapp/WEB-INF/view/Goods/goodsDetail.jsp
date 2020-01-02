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
<script type="text/javascript">
	function goModify(){
		location.href="goodsModify?goodsNum=${goods.goodsNum }";
	}
	
	function goDelete(){
		var result = confirm("정말 삭제하시겠습니까?");
		if(result){
			location.href="goodsDelete?goodsNum=${goods.goodsNum }";
		}else{
		    alert("싫음 말구영");
		}
	}
</script>
</head>
<body>
	<h2>상품 상세정보</h2>
	<table border="1"  style="height: 300px; width: 400px;">
		<tr align="center">
			<td>상품명</td>
			<td>${goods.goodsName }</td>
		</tr>
		<tr align="center">
			<td>가격</td>
			<td><fmt:formatNumber value="${goods.goodsPrice }" pattern="###,###,###"/>원</td>
		</tr>
		<tr align="center">
			<td>상품소개</td>
			<td>${goods.goodsContent }</td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<form method="post" action="cartInsert">
					<input type="hidden" name="goodsNum" value="${goods.goodsNum }" />
					<input type="hidden" name="aNum" value="${goods.auditNum }" />
					<input type="hidden" name="pNum" value="${goods.participationNum }" />
					<select name="qty">
						<c:forEach begin="1" end="10" var="i">
							<option value="${i}">${i}</option>						
						</c:forEach>
					</select>&nbsp;개
					<input type="submit" value="장바구니 담기">
				</form>
			</td>
		</tr>
	</table>
	<div id="show">
		<input type="button" value="목록" onclick="history.go(-1);" />
		<c:if test="${fn:trim(goods.memId) == fn:trim(requestScope.memId)}">
			<!-- 굿즈를 등록한 회원만 이벤트 가능 -->
			<input type="button" value="수정" onclick="goModify();" />
			<input type="button" value="삭제" onclick="goDelete();" />
			굿즈를 등록한 회원이군뇽.
		</c:if>
		<c:if test="${memLev == 4 }">
			<!-- 관리자만 수정&삭제가능 -->
			<input type="button" value="수정" onclick="goModify();"/>
			<input type="button" value="삭제" onclick="goDelete();"/>
			관리자네용
		</c:if>
	</div>
</body>
</html>