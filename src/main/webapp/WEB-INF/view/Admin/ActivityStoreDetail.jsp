<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 관리자_상점 상세보기 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">  
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
//이미지 커지게!
	function imgBigView(a, b){
		document.getElementById(b).getElementByTagName("img")[0].src = a.href;
		if(document.getElementById(b).style.display == 'block') {
			document.getElementById(b).style.display = 'none' ;
		} else
			document.getElementById(b).style.display = 'block';
	}
//닫히게 하는 함수
	function hid(c) {
	document.getElementById(c).style.display = 'none';
	}
</script>
<script>
	function payment(){
		location.href="paymentOfProduct()"
	}
</script>

<!-- <script>

$(document).ready(function(){
    $("#checkProduct").change(function(){
        if($("#checkProduct").is(":checked")){
          $("#amountOfProduct").show(slow);
        } else{
        	$("#amountOfProduct").hide();
        }
    });
});
</script> -->





</head>
<body>

<!-- 상단 -->
<jsp:include page="../Main/admintop.jsp" />

<!-- 중단 -->
<div style="margin:40px auto;background:lightgrey;padding-top: 50px; padding-right: 100px; padding-bottom: 50px; padding-left: 100px;">	<!-- 가운데 정렬  -->

<div class="w3-container">
	<div class="row" >
		<table class="w3-table w3-border">
			<tr>
				<td> 상점 명 </td>
				<td> ${list.storeName } 
			</tr>		
			<tr>
				<td> 상점 번호</td>
				<td> ㅎㄷ${list.storeNum }
			</tr>
			<tr>
				<td> 상점 지역 및 주소 </td>
				<td> ${list.storeLoc1 } / ${list.storeLoc2 } </td>
			</tr>
			<tr>
				<td> 상점 전화번호 </td>
				<td> ${list.storeTel } </td>
			</tr>
		</table>
	</div>
</div>
</div>

<div style="margin:40px auto;padding-top: 50px; padding-right: 80px; padding-bottom: 50px; padding-left: 80px;">	<!-- 가운데 정렬  -->
<h2> 물품 </h2>
	<table class="w3-table-all w3-hoverable">
			<thead>
				<tr>
					<th> 사진 </th>
					<th> 상품 번호 </th>
					<th> 상품 이름 </th>
				    <th> 상품 가격 </th>
					 <c:if test="${member.memLev  eq 1}">
							<th> 물품 선택 </th>
					    </c:if>
				</tr>
			</thead>
		<c:forEach var="aa" items="${product }">
			<tr>
			   <td> 
			   <!-- 작은 이미지 누르면 커져욧 -->
			  		<a href="${aa.storeFilename }" onclick="imgBigView(this,'bigImg'); return false;">
			   			<img="${aa.storeFilename }" style="width:100%"/>
			   		</a>
			   	<!-- 지정한 위치에서 큰 이미지 등장 -->
			   		<div id="bigImg" style="display:none;position:absolute;left:100px;top:100px; overflow:hidden; border:0px solid #ff6600" align="center">
						<img src="" width="500" style="border:1px solid black;" onclick="hide('bigImg')" />
							<br />
							<div style="background-color:#003cfe;"><strong>click image to close full size</strong></div>
			   		</div>
			   </td>
			   <td> ${aa.productNum } </td>
			   <td> ${aa.productName }  </td>
			   <td> ${aa.productPrice } </td>
				   <c:if test="${member.memLev eq 1 }">
						<td> <input type="checkbox" id="checkProduct" value="${aa.productNum }" name="checkProduct" /> </td>
							<%-- <form:select path="amountOfProduct" id="amountOfProduct">
            					<option value="">-----선택해주세요-------</option>
                  					 <form:options items="${recruitPeople}" />
           					</form:select> --%>

					</c:if>
			</tr>
		</c:forEach>
	</table>
	
</div>

<c:if test="${member.memLev  eq 1}">
<button class="w3-btn w3-light-green"  onclick="paymentOfProduct()" > 결제하러 가기</button> 
</c:if> 


<!-- 하단 -->



</body>
</html>