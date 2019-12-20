<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>car 결제 </title>
</head>
<body>
<h2>결제</h2>
<form action="#" name ="carFrm">
<label>카드 선택</label>
<select>
<option>선택 하시오</option>
<option>신한 카드</option>
<option>롯데 카드</option>
<option>현대 카드</option>
</select>
<br/>
<label>카드 번호</label>
<input type="text" name="cardNumber" />
<br/>
<label>유효 기간</label>
<input type="text" name="cardExpiration_date" />
<br/>
<label>cvc번호</label>
<input type="text" name="cvcNumber" />
<br/>
<label>상품 가격</label>
<input type="text" name="carPrice" />
<br/>
<label>결제 금액</label>
<input type="text" name="paymentPrice" /><br />
<input type="button" name="payBtn" value="결제"  onclick="#" >
<input type="button" name="resetBtn" value="취소" onclick="#">
</form>
</body>
</html>