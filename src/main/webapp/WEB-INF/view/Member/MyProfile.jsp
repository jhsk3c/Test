<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title> 프로필  </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
  	
  	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> <!-- 현재 얘때문. -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>
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

<script type="text/javascript">

function button_event(){
	if (confirm("정말 예약을 취소하겠습니까?") == true){    //확인
	    alert("예약 취소가 되었습니다.");
	}else{   //취소
	    return;
	}
	}

</script>


</head>
<body>

<!-- 상단  -->
<jsp:include page="../Main/memtop.jsp" />

<!--  중단   -->
<h2> 혜윰 회원 프로필</h2>
<input type="hidden" name="stNum" value="${list.memNum }"/>
<input type="hidden" name="page" value="${page }"/>
<div class="tab">
	<button class="tablinks" onclick="openProfile(event, 'alojamiento')"> 숙소 </button>
	<button class="tablinks" onclick="openProfile(event, 'activity')"> 활동 </button>
	<button class="tablinks" onclick="openProfile(event, 'carShare')"> 차 공유 </button>
</div>


	<!-- 숙소 -->
<div id="alojamiento" class="tabcontent">
	<h3> 나의 정보 </h3>
	
	<div class="w3-container" >
		<table class="w3-table-all w3-hoverable" style="width:70%">
				
				<tr class="w3-light-grey" >
	      			<th> 회원 아이디 </th>
	        		<td> ${mem.memId } </td>
				</tr>
				
				<tr>
	      			<th> 회원 이름 </th>
	        		<td> ${mem.memName } </td>
				</tr>
				
				<tr class="w3-light-grey" >
	      			<th> 회원 생년월일 </th>
	        		<td><fmt:formatDate value="${mem.memBirth }" pattern="yyyy-MM-dd"/> </td>
				</tr>
				
				<tr>
	      			<th> 회원 지역 </th>
	        		<td> ${mem.memNationality } </td>
				</tr>
				
				<tr class="w3-light-grey" >
	      			<th> 회원 이메일 </th>
	        		<td> ${mem.memEmail } </td>
				</tr>
				
				<tr>
	      			<th> 회원 주소 </th>
	        		<td> ${mem.memAddr } </td>
				</tr>
				
				<tr class="w3-light-grey" >
	      			<th> 회원 전화번호 </th>
	        		<td> ${mem.memTel } </td>
				</tr>
				
				<tr>
	      			<th> 회원 여행 선호법 </th>
	        		<td> ${mem.memPreferTrip } </td>
				</tr>
				
				
		</table>
	</div> <br><br><br>
	<span id="span_code_snippet" style="cursor:hand" onclick="
	if(div_code_snippet.style.display =='none') {
		div_code_snippet.style.display='';
		span_code_snippet.innerText='접기';
	} else {
		div_code_snippet.style.display='none';
		span_code_snippet.innerText='펼치기';
	}
	
	
	">더보기</span>
	<h3> 휴양지 신청 내역 </h3> 
	<div class="w3-container" >
		<div id="div_code_snippet" style="DISPLAY: block; padding: 8;">
			<table class="w3-table-all w3-hoverable">
				<thead>
					<tr class="w3-light-grey">
						<th> 휴양지 제목 </th>
						<th> 휴양지 이름 </th>
						<th> 휴양지 지역 </th>
						<th> 승인 여부 </th>
						<th> 등록 날짜 </th>
					</tr>
				</thead>
				<c:forEach var="vsp1" items="${vsp}">
					<tr>
						<td> ${vsp1.vspotTitle } </td>
						<td> ${vsp1.vspotName } </td>
						<td> ${vsp1.vspotLoc} </td>
						<c:if test="${vsp1.vspotApproval == '미승인'}">
							<td> 승인 대기 중 </td>
						</c:if>
						<c:if test="${vsp1.vspotApproval == '승인'}">
							<td><a href="vspotListDetail?num=${vsp1.vspotNum}">승인 완료 </a></td>
						</c:if>
						<td><fmt:formatDate value="${vsp1.vspotDate }" pattern="yyyy-MM-dd"/></td>
					</tr>
				</c:forEach>
				
			<div class="container" style="position: relative; left: 35%; top:425px;">
				<div class="row">
					<div class="col">
						<ul class="pagination">
							<c:if test="${page <= 1}">
									<li class="page-item"><a class="page-link" href="#"><</a></li> &nbsp;<!-- 첫 페이지  -->
							</c:if>
							<c:if test="${page > 1}">
									<li class="page-item"><a href = "profile?page=${page -1}" class="page-link"> Previous </a></li>&nbsp;
							</c:if>
							
							<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
									<li class="page-item"><a href = "profile?page=${i}" class="page-link"> ${i} </a></li>&nbsp;
							</c:forEach>
							
							<c:if test="${page >= maxPage}">	
									<li class="page-item"><a class="page-link" href="#">></a></li> &nbsp; <!-- 마지막 페이지  -->
							</c:if>
							<c:if test="${page < maxPage}">	
									<li class="page-item"><a href = "profile?page=${page +1}" class="page-link">Next</a></li>&nbsp;
							</c:if>
						</ul>
					</div>
				</div> 
			</div>
	
			</table>
		</div>
	</div>
	
	
	
	<span id="span_code_snippet1" style="cursor:hand" onclick="
	if(div_code_snippet1.style.display =='none') {
		div_code_snippet1.style.display='';
		span_code_snippet1.innerText='접기';
	} else {
		div_code_snippet1.style.display='none';
		span_code_snippet1.innerText='펼치기';
	}
	
	
	">더보기</span>
	<h3> 상점 신청 내역 </h3> 
	<div class="w3-container" >
		<div id="div_code_snippet1" style="DISPLAY: block; padding: 8;">
			<table class="w3-table-all w3-hoverable">
				<thead>
					<tr class="w3-light-grey">
						<th> 상점 구분 </th>
						<th> 상점 지역 </th>
						<th> 상점 이름 </th>
						<th> 승인 여부 </th>
						<th> 등록 날짜 </th>
					</tr>
				</thead>
				<c:forEach var="shdto1" items="${shdto}">
					<tr>
						<td> ${shdto1.shopCategory } </td>
						<td> ${shdto1.shopLoc } </td>
						<td> ${shdto1.shopName} </td>
						<c:if test="${shdto1.shopApproval == '미승인'}">
							<td> 승인 대기 중 </td>
						</c:if>
						<c:if test="${shdto1.shopApproval == '승인'}">
							<td><a href="shopDetail?num=${shdto1.shopNum}">승인 완료 </a></td>
						</c:if>
						<td><fmt:formatDate value="${shdto1.goodsDate }" pattern="yyyy-MM-dd"/></td>
					</tr>
				</c:forEach>
				
			<div class="container" style="position: relative; left: 35%; top:235px;">
				<div class="row">
					<div class="col">
						<ul class="pagination">
							<c:if test="${page <= 1}">
									<li class="page-item"><a class="page-link" href="#"><</a></li> &nbsp;<!-- 첫 페이지  -->
							</c:if>
							<c:if test="${page > 1}">
									<li class="page-item"><a href = "profile?page=${page -1}" class="page-link"> Previous </a></li>&nbsp;
							</c:if>
							
							<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
									<li class="page-item"><a href = "profile?page=${i}" class="page-link"> ${i} </a></li>&nbsp;
							</c:forEach>
							
							<c:if test="${page >= maxPage}">	
									<li class="page-item"><a class="page-link" href="#">></a></li> &nbsp; <!-- 마지막 페이지  -->
							</c:if>
							<c:if test="${page < maxPage}">	
									<li class="page-item"><a href = "profile?page=${page +1}" class="page-link">Next</a></li>&nbsp;
							</c:if>
						</ul>
					</div>
				</div> 
			</div>
	
			</table>
		</div>
	</div>
	
	
	
	<span id="span_code_snippet2" style="cursor:hand" onclick="
	if(div_code_snippet2.style.display =='none') {
		div_code_snippet2.style.display='';
		span_code_snippet2.innerText='접기';
	} else {
		div_code_snippet2.style.display='none';
		span_code_snippet2.innerText='펼치기';
	}
	
	
	">더보기</span>
	<h3> 예약 내역 </h3> 
	<div class="w3-container" >
		<div id="div_code_snippet2" style="DISPLAY: block; padding: 8;">
			<table class="w3-table-all w3-hoverable">
				<thead>
					<tr class="w3-light-grey">
						<th> 예약 번호 </th>
						<th> 예약 날짜 </th>
						<th> 예약 시간 </th>
						<th> 예약 인원 </th>
						<th> 구분 </th>
					</tr>
				</thead>
				 <c:forEach var="shoptdto1" items="${shoptdto}">
					<tr>
						<td> ${shoptdto1.shopReservationNum } </td>
						<td> <fmt:formatDate value="${shoptdto1.useDate }" pattern="yyyy-MM-dd"/> </td>
						<td> ${shoptdto1.useTime } </td>
						<td> ${shoptdto1.peopleNum } </td>
						<td>
							<a href="shopDelete?num=${shoptdto1.shopReservationNum}" onclick="button_event();">예약 취소 </a>
							<a href="shopDetail?num=${shoptdto1.shopNum }&num2=${shoptdto1.vspotNum}&page=${page}">상점 가기</a>
						</td>
						
				</c:forEach>
				
			<div class="container" style="position: relative; left: 35%; top:200px;">
				<div class="row">
					<div class="col">
						<ul class="pagination">
							<c:if test="${page <= 1}">
									<li class="page-item"><a class="page-link" href="#"><</a></li> &nbsp;<!-- 첫 페이지  -->
							</c:if>
							<c:if test="${page > 1}">
									<li class="page-item"><a href = "profile?page=${page -1}" class="page-link"> Previous </a></li>&nbsp;
							</c:if>
							
							<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
									<li class="page-item"><a href = "profile?page=${i}" class="page-link"> ${i} </a></li>&nbsp;
							</c:forEach>
							
							<c:if test="${page >= maxPage}">	
									<li class="page-item"><a class="page-link" href="#">></a></li> &nbsp; <!-- 마지막 페이지  -->
							</c:if>
							<c:if test="${page < maxPage}">	
									<li class="page-item"><a href = "profile?page=${page +1}" class="page-link">Next</a></li>&nbsp;
							</c:if>
						</ul>
					</div>
				</div> 
			</div>
	
			</table>
		</div>
	</div>
	
	
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