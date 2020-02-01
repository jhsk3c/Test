<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 관리자_상점 상세보기 </title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script>
	function deleteStore(){
		var deleteStore = confirm("상점을 삭제하시겠습니까?");
			 if(deleteStore ==true){
				location.href="deleteStore?stNum=${list.storeNum}";
				/*ducoment.write("삭제되었습니다"); */
			 }
			 else if(deleteStore ==false){
				 document.write("취소하셨습니다");
			 }
	}
</script>


</head>
<body>


<!-- 상단 -->
<jsp:include page="../Main/admintop.jsp" />


<!-- 중단 -->
<div style="margin:40px auto;padding-top: 50px; padding-right: 100px; padding-bottom: 50px; padding-left: 100px;">	<!-- 가운데 정렬  -->

		<div class="jumbotron" style="background:white;border-radius:25px;border:1px solid lightgrey">
				<table class="table" style="width:90%;margin:20px auto">
					<tr>
						<td colspan=2> <img src="${list.originalStoreFilename }" src="a" /> </td> 
					</tr>
					<tr>
						<td> 상점 명 </td>
						<td> ${list.storeName } 
					</tr>		
					<tr>
						<td> 상점 번호</td>
						<td> ${list.storeNum }
					</tr>
					<tr>
						<td> 상점 지역 및 주소 </td>
						<td> ${list.storeLoc1 } / ${list.storeLoc2 } </td>
					</tr>
					<tr>
						<td> 상점 전화번호 </td>
						<td> ${list.storeTel } </td>
					</tr>
					<tr>
						<td> 등록일 </td>
						<td> ${rDate } </td>
					</tr>
				</table>
			</div>
		</div>


	
			<!-- 가운데 정렬 -->
<div style="margin:40px auto;padding-top: 50px; padding-right: 100px; padding-bottom: 50px; padding-left:150px;">
	<div style="padding-bottom:20px;">
		<h2> 물품 </h2>
	</div>
	<table class="table" style="width:90%">
		<thead>
			<tr>
				<th> 사진 </th>
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
		 	 		<img src="${aa.storeFilename }" alt="${aa.storeFilename }" style="width:100%"/>
			   </td>
			   <td> ${aa.productName }  </td>
			   <td> ${aa.productPrice } </td>
			  <c:if test="${member.memLev eq 1 }">
				<td> 
					<input type="checkbox" id="checkProduct" value="${aa.productNum }" name="checkProduct" />
				</td>
			</c:if>
			</tr>
		</c:forEach>	
	</table>
</div>


		<button class="btn btn-warning" id="deleteStore" name="deleteStore" onclick='deleteStore()'> 상점 삭제 </button>
		






</body>
</html>