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
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>   <!-- 제이커리 -->
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

   
   
<div class="jumbotron" style="margin:70px auto;width:95%;border-radius:25px" >  
   <form:form class="form-inline" action="searchCity" commandName="activityStoreCommand" method="post" id="frm">
	   <div style="padding-left:470px;margin:20px auto">
	      <form:select class="form-control" path="storeLoc1" id="storeLoc1" style="width:260px">
	            <option value="">-----선택해주세요-------</option>
	              <form:options items="${storeLoc1}" />
	      </form:select>
	      <input type="submit" class="btn btn-success" style="width:70px" value="검색" />
	   </div>
	   
   </form:form>
</div>




   <!-- 본격 -->
<div style="margin:30px auto;padding-top:70px;padding-bottom:70px;padding-left:20px;padding-right:20px;background:white;border-radius:25px;border:1px solid lightgrey;width:95%">

		<div class="w3-container" style="margin:10px auto">
			<c:forEach var="list" items="${list }" varStatus="status">
				
				<div class="card">
					<c:forTokens items="${list.storeStoreFilename }" delims="-" var="store">
						<img src="Activity/upload/${store }" alt="asd" style="width:100%">
				  	</c:forTokens>
					<div class="container">
						<h4><b> ${list.storeName }</b></h4> 
						<p> ${list.storeLoc1 }</p> 
					</div>
				</div>
					
					
			</c:forEach>
		</div>

	
	
	
	
	
	
	
	
	
	
	
	
</div>

   

<!-- 하단 -->


</body>
</html>