<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 상점 검색 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>	<!-- 제이커리 -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
	$(function(){
		$("#frm").submit(function(){
			if($("#storeLoc1").val() == ""){
				$("#storeLoc1").focus();
				alert("지역을 선택해주세요");
			return false;
			}
		})
	});
</script>


</head>
<body>


<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />


<!-- 중단 -->
	<div style="align:center">
		<div>
			<h1> 직접 빌리지 마세요!</h1><br/>
			<h2> 더 저렴한 가격으로 혜윰에서 빌릴 수 있습니다.</h2>
		</div>
	</div>
	
	

	<form:form action="searchCity" commandName="activityStoreCommand" method="post" id="frm">
		<form:select path="storeLoc1" id="storeLoc1">
		   	<option value="">-----선택해주세요-------</option>
		        <form:options items="${storeLoc1}" />
		</form:select>
		<input type="submit" class="w3-btn w3-light-green" value="검색" />
	</form:form>





	<!-- 본격 -->
	<div class="w3-container" style="background:green;width:100%;">
		
		<c:forEach var="list" items="${list }" varStatus="status">	
			<div id="actiStoreCard" class="w3-container" style="background:white;width:100%; margin:10px auto">
			  <div class="w3-card-4 w3-round-xlarge" style="width:50%">
			    <img src="#" alt="Alps" style="width:100%">
			    <div class="w3-container w3-center">
			      <p>The Italian / Austrian Alps</p>
			    </div>
			  </div>
			</div>
			
		</c:forEach>
	</div>
	

<!-- 하단 -->

</body>
</html>