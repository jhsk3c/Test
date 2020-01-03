<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Shop</title>
</head>
<body>
	<h2>Shop Main</h2>
	<div>
		<a href="cartList">장바구니</a>
	</div>
	<c:forEach var="goods" items="${goods }">
		<a href="goodsDetail?gNum=${goods.goodsNum}">굿즈 명 : ${goods.goodsName }</a>
	</c:forEach>
</body>
</html>