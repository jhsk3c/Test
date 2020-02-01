<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 활동 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<script type="text/javascript">
		
		function createAnActivity(){
			if(${forToCheck.activityLev == null }){
				location.href='ActivityInsert';
			}else if(${forToCheck.activityLev == 4}){
				location.href='ActivityInsert';
			}else{
				alert("활동 주체는 주체하는 활동 혹은 활동 주체 신청을 하지 않은 경우에만 가능합니다.");
				location.href='ActivityList';
	        }  
		}
	
</script>






</head>
<body>





<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />





<!-- 중단 -->
	<button class="w3-btn w3-light-green" style="float:right" onclick="createAnActivity()"> 활동 생성 </button>

<div> 
<h2>활동을 찾아보세요 !</h2>
</div>

<div class="w3-container" >
	<c:if test="${empty list}">
		<h1>> 현재 등록된 활동이 없습니다</h1>
	</c:if>
	
	
		<c:forEach var="list" items="${list}" varStatus="status">  
			<div style="height:300px; float:left; width:25%; margin:8px;">
			
			<a href="ActivityDetail?actiNum=${list.activityNum}">
				  <div class="w3-card-4 w3-round-xlarge" style="border-radius:25px">
				  	<c:forTokens items="${list.storeFilename}" delims="-" var="store" end="0">							
								<img src="Activity/upload/${store}" alt="X"  width="100%" height="200" style="border-radius:25px">	
					</c:forTokens>
				    
				    <div class="w3-container w3-center">
				    	<p>${list.activityNum}</p>				
						<p>${list.activityName }</p>
						<p>${list.activityStartDate } - ${list.activityEndDate }</p>
						<p>${list.activityCost }</p>
				    </div>
				    
				  </div>
			 </a>
			</div>
		</c:forEach>
	

</div>


<br/>



</body>
</html>