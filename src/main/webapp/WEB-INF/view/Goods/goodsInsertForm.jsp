<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id = "h1div"><h1 align="center">판매 상품 등록</h1></div>
	<form:form action="goodsInsertPro" method="post" enctype="multipart/form-data" commandName="goodsCommand">
	<form:hidden path="memId" value="${memId } "/>
		<div align="center">
			<div id="tableBox">
				<table border="1">
					<tr>
						<td>상품카테고리</td>
						<td>
							<form:select path="goodsCategory" id="goodsCategory">
								<form:option  value="select">--선택해주세요</form:option>
								<form:option value="goods">goods</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td>상품명</td>
						<td><form:input path="goodsName" id="goodsName" /></td>
					</tr>
					<tr>
						<td>상품가격</td>
						<td><form:input path="goodsPrice" id="goodsPrice" />원</td>
					</tr>
					<tr>
						<td>상품 수량</td>
						<td><form:input path="goodsQty" id="goodsQty" /></td>
					</tr>
					<tr>
						<td>상품 이미지</td>
						<td><input type="file" name="goodsImage" id="goodsImage" /></td>
					</tr>
					<tr>
						<td>상품 상세내용</td>
						<td>
							<form:textarea path="goodsContent" cols="50" rows="20"/>
						</td>
					</tr>
					<tr>
						<td>할인율 적용</td>
						<td>
							<form:input path="goodsDiscountRate" />
						</td>
					</tr>

<!-- 					<tr> -->
<!-- 						<td>배송정보</td> -->
<!-- 						<td><select name="goodsDeliveryInfo" id="goodsDeliveryInfo"> -->
<!-- 								<option value="1.일반배송">1.일반배송</option> -->
<!-- 								<option value="2.퀵배송">2.퀵배송</option> -->
<!-- 						</select></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>배송비</td> -->
<!-- 						<td><input type="text" name="goodsDeliveryPrice" -->
<!-- 							id="goodsDeliveryPrice" />원</td> -->
<!-- 					</tr> -->

					<tr>
						<td colspan="2"><input type="submit" value="상품등록" /> <input
							type="reset" value="다시 작성" /> <input type="button" value="뒤로가기"
							onclick="javascript:history.go(-1)" /></td>
					</tr>
				</table>
			</div>
		</div>
	</form:form>
</body>
</html>