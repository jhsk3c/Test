<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>car 결제 </title>
</head>
<body>
<h2>결제</h2>
<form:form action="#" method="post" commandName="carPaymentCommand" >
<label>카드 선택</label>
<form:select path="cardSelection">
<form:option value="선택 하시오" />
<form:option value="신한 카드" />
<form:option value="롯데 카드" />
<form:option value="현대 카드" />
</form:select>
<br/>
<label>카드 번호</label>
<form:input path="cardNumber" />
<br/>
<label>유효 기간</label>
<form:input path="cardExpirationDate" />
<br/>
<label>cvc번호</label>
<form:input path="cvcNumber" />
<br/>
<label>상품 가격</label>
<form:input path="carPrice" />
<br/>
<label>결제 금액</label>
<form:input path="paymentPrice" /><br />
<input type="submit" name="payBtn" value="결제">
<input type="reset" name="resetBtn" value="취소">
</form:form>
</body>
</html>