<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> 활동 2차 양식 </title>
<!-- 제이쿼리 -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
  
<!-- DATEPICKER -->
	<script>	  
	  $( function() {
		    var dateFormat = "mm/dd/yy",
		      from = $( "#recruitStartDate")
		        .datepicker({
		        	 prevText: '이전달',
			          nextText: '다음달',
			          currentText: '오늘',
			          monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			          monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			          dayNames: ['일', '월', '화', '수', '목', '금', '토'],
			          dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
			          dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
			          minDate: "+1D", //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)		 
			          changeMonth: true
		        })
		        .on( "change", function() {
		          to.datepicker( "option", "minDate", getDate( this ) );
		        }),
		      to = $( "#recruitEndDate" ).datepicker({
		          prevText: '이전달',
		          nextText: '다음달',
		          currentText: '오늘',
		          monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
		          monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
		          dayNames: ['일', '월', '화', '수', '목', '금', '토'],
		          dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
		          dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
		          yearSuffix:'년',
		          changeMonth: true
		      })
		      .on( "change", function() {
		        from.datepicker( "option", "maxDate", getDate( this ) );
		      });
		   function getDate( element ) {
		      var date;
		      try {
		        date = $.datepicker.parseDate( dateFormat, element.value );
		      } catch( error ) {
		        date = null;
		      }		 
		      return date;
		    }
		  } );
	</script>


<script>
 var actiStartDate =  ${actiStartDate };
	$(function (){
		$("#frm").submit(function(){
			if($("#recruitStartDate").val() == actiStartDate){
				alert("모집 기간이 활동 시작일과 같거나 클 순 없습니다! 활동 시작일을 확인해주세요");
			}				
		});
	});
</script> 
<script>
	$(function (){
		function insertComma("#activityCost") {
			if("#activityCost").length <= 3) {
				return ("#activityCost");
			}
			var count = Math.ceil(("#activityCost").length / 3);
			var newNum = [];
			
			for(var i=0; i<count; i++) {
				newNum.unshift(("#activityCost").slice(-3*(i+1), ("#activityCost").length-(3*i)));
			}
		return newNum.join(',');
		}
		document.getElementById('#activityCost').addEventListener('keyup', function(event) {
			this.value = this.value.replace(/^[0]|[^0-9,]/g, '')
		})
	});
</script>

  
  
<style>
body{  font-family: "Helvetica Nene", Helvetica, Arial, 맑은 고딕;,"malgun gothic", sans-serif; }
.row {padding-top:30px}	
.question{font-size:15pt}
</style>


<script>
	$(function(){
		$("#frm").submit(function(){
			if($("#activityCost").val()== ""){
				$("#activityCost").focus();
				alert("금액을 입력해주세요.");
			return false;
			}
			if($("#activityProduct").val()== ""){
				$("#activityProduct").focus();
				alert("사용할 물품을 입력해주세요.");
			return false;
			}
			if($("#recruitStartDate").val()== ""){
				$("#recruitStartDate").focus();
				alert("모집기간을 입력해주세요.");
			return false;
			}
			if($("#recruitEndDate").val()== ""){
				$("#recruitEndDate").focus();
				alert("모집기간을 입력해주세요.");
			return false;
			}
	
		});
	});	
</script>

<script>
	var actiStartDate = $( ${list.activityStartDate} ).val();
	var actiStartDateArr = actiStartDate.split('-');
	
	var recruStartDate = $( "input[name='recruitStartDate']" ).val();
	var recruStartDateArr = recruStartDate.split('-');
	
	var startDateCompare = new Date(startDateArr[0], startDateArr[1], startDateArr[2]);
	var endDateCompare = new Date(endDateArr[0], endDateArr[1], endDateArr[2]);
	
	
	if(startDateCompare.getTime() > endDateCompare.getTime()) {
		$("#recruitStartDate").focus();
	    alert("활동 시작 날짜와 모집기간 날짜를 확인해 주세요.");   
	    return false;
	}

</script>



</head>
<body>


<!-- 상단 -->
<jsp:include page="../Main/memtop_noBoots.jsp" />



<!-- 하단 -->
<form:form class="form-inline" action="ActivityInsertPro2" method="post" id="frm" commandName="activityCommand2" >
<input type="hidden" name="memNum" value="${list.memNum }" />

<div style="border-radius:35px;margin:40px auto;border:1px solid green; width:70%; padding-top:50px; padding-right:30px; padding-bottom:50px; padding-left:80px; text-align:center">	<!-- 가운데 정렬  -->
	<div style="padding-top:20px; padding-right:40px; padding-bottom:20px; padding-left:20px">
	
	
	
	
	<div class="row" >
		<p class="question"> 금액 </p>
		<input class="form-control form-inline" type="text" size=30 id="activityCost" name="activityCost"> &nbsp; <img alt="won" src="img/won.png" width=25 height=30/>
	</div>
	
	
	<div class="row" >
		<p class="question"> 어떤 도구를 사용하실 건가요? </p>
			<div>
				<c:if test="${list.whichProduct eq 1 }">
				 	<input class="form-control" type="text" size=30 id="activityProduct" name="activityProduct" >
				</c:if>
				<c:if test="${list.whichProduct eq 2 }">
				 	<input class="form-control" type="text" size=30 id="activityProduct" name="activityProduct" >
				</c:if>
				<c:if test="${list.whichProduct eq 3 }">
					<input class="btn" type="Button" id="activityProduct" name="activityProduct" value="상점 보러가기!!" onclick="location.href='activityStoreList';"> 
				</c:if>
			</div>
	</div>
	
	<div class="row" >
		<p class="question"> 모집기간 </p>
				<div>
					<input class="form-control form-inline" type="text" id="recruitStartDate" name="recruitStartDate" > 
						 <p style="display:inline"> ~ </p> 
					<input class="form-control" type="text" id="recruitEndDate" name="recruitEndDate">
				</div>
			<div style="padding-top:20px">
				<p style="text-align:center;font-color:green"> 
					※활동 시작일 : <strong> ${actiStartDate } </strong> 
				</p>
			</div>
	</div>
	
	<div class="row" >
		<input class="btn" style="background-color:lightgreen" type="submit" value="최종 등록" />
	</div>
	</div>
</div>



</form:form>

</body>
</html>