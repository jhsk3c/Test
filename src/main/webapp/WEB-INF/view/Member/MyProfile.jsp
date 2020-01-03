<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title> 프로필  </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body {font-family: Arial;}

/* Style the tab */
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}

</style>


</head>
<body>

<!-- 상단  -->
<jsp:include page="../Main/memtop.jsp" />

<!--  중단   -->
<h2> 혜윰 회원 프로필</h2>
<input type="hidden" name="stNum" value="${list.memNum }"/>
<div class="tab">
	<button class="tablinks" onclick="openProfile(event, 'alojamiento')"> 숙소 </button>
	<button class="tablinks" onclick="openProfile(event, 'activity')"> 활동 </button>
	<button class="tablinks" onclick="openProfile(event, 'carShare')"> 차 공유 </button>
</div>


	<!-- 숙소 -->
<div id="alojamiento" class="tabcontent">
	<h3> 활동 활동 활동 활동 활동 </h3>
	
</div>


	<!-- 활동 -->
<div id="activity" class="tabcontent">

<h2> 주체  </h2>
	<div class="w3-container" >
		<h1> 현재 주체 중인 활동 </h1>
		<table class="w3-table-all w3-hoverable" style="width:70%">
				<c:if test="${list.activityLev eq null }">
					<tr>
						<td colspan="4" class="w3-right-align">
							<a href="ActivityInsert"> 활동 등록하러 가기 ! </a>						
						</td>
					</tr>
				</c:if>
				<tr class="w3-light-grey" >
	      			<th> 주체 날짜 </th>
	        		<th> 활동 한 줄 소개 </th>
	    	    	<th> 참여 인원 수 </th>
	    	    	<th> 활동 상태 </th>
				</tr>
				<tr>
					<td style="text-align: center;"> ${list.activityStartDate } ~ ${list.activityEndDate } </td>
					<td> <a href="ActivityDetail?actiNum=${list.activityNum }"> ${list.activityName } </a> </td>
					<td> ${list.recruitPeople } </td>
					
						<c:if test="${list.activityLev == 1}">
							<td> 승인 대기 중 </td>
						</c:if>
						<c:if test="${list.activityLev  == 2}">
							<td> <a href="ActivityInsert2?memNum=${list.memNum }"> !! 활동  최종 등록하러 가기!! </a> </td>
						</c:if>
						<c:if test="${list.activityLev == 3}">
							<td> 활동 생성됨 </td>
						</c:if>
				</tr>
		</table>
	</div>
	
	
	
	
	<div class="w3-container">
		<h4> 과거 생성했던 활동</h4>
			<table class="w3-table-all w3-hoverable" style="width:70%">
				<thead>
					<tr class="w3-light-grey">
						<th> 주체 날짜 </th>
						<th> 활동 한 줄 소개  </th>
						<th> 참여 인원 수  </th>
					</tr>
				</thead>
					<tr>
						<td>  </td>
						<td>  </td>
						<td>  </td>
					</tr>
			</table>
	</div>



<div style="text-align:middle"><h2> 참여 </h2></div>
	<h4> 현재 결제한 활동 </h4>
		<div class="w3-container">
			<table class="w3-table-all w3-hoverable" style="width:70%">
				<thead>
					<tr>
						<th>  </th>
						<th>  </th>
						<th>  </th>
					</tr>
				</thead>
					<tr>
						<td>  </td>
						<td>  </td>
						<td>  </td>
					</tr>
			</table>
		</div>
	<h4> 과거 참여했던 활동 </h4>
		<div class="w3-container">
			<table class="w3-table-all w3-hoverable" style="width:70%">
				<thead>
					<tr>
						<th>  </th>
						<th>  </th>
						<th>  </th>
					</tr>
				</thead>
					<tr>
						<td>  </td>
						<td>  </td>
						<td>  </td>
					</tr>
			</table>
		</div>
	
	
	
	
	
	
	
	
	
 
 
</div>


<div id="carShare" class="tabcontent">
	<h3>carShare</h3>
	<p>carShare is the capital of Japan.</p>
</div>

<script>
function openProfile(evt, processName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(processName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>

<!-- 하단 -->



</body>
</html>