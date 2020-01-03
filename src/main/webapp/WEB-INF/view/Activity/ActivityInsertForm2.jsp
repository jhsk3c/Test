<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 활동 2차 양식 </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>	<!-- 제이커리 -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

 <script>
  $( function() {
	  $.datepicker.setDefaults($.datepicker.regional['ko']); 
	  
    var dateFormat = "mm/dd/yy",
      from = $( "#recruitStartDate" ).datepicker({
        	  nextText: '다음달',
	          currentText: '오늘',
	          monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	          monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	          dayNames: ['일', '월', '화', '수', '목', '금', '토'],
	          dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
	          dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
	          minDate: "+1D", //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
	         })
	         
        .on( "change", function() {
          to.datepicker( "option", "minDate", getDate( this ) );
        }),
        
        
        
      to = $( "#recruitEndDate" ).datepicker({
    	  nextText: '다음달',
          currentText: '오늘',
          monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
          monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
          dayNames: ['일', '월', '화', '수', '목', '금', '토'],
          dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
          dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
          yearSuffix:'년',
          minDate: "+1D", //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        defaultDate: "+1w",
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
  });
  </script>

<script>
	$(function (){
		$("#frm").submit(function(){
			if($("#recruitStartDate").val() >= ${actiStartDate } ){
				alert("모집 기간이 활동 시작일과 같거나 클 순 없습니다! 활동 시작일을 확인해주세요");
			}				
		});
	});
</script>

  
  
<style>
	.row {padding-top:30px}	

	.question{font-size:15pt}
</style>



</head>
<body>


<!-- 상단 -->
<jsp:include page="../Main/memtop.jsp" />

<!-- 하단 -->
<form:form action="ActivityInsertPro2" method="post" id="frm" commandName="activityCommand2" >
<input type="hidden" name="memNum" value="${list.memNum }" />

<div style="margin:40px auto; background:#e6ffee; width:70%; padding-top:50px; padding-right:30px; padding-bottom:50px; padding-left:80px; text-align:center">	<!-- 가운데 정렬  -->
	<div style="padding-top:20px; padding-right:40px; padding-bottom:20px; padding-left:20px">
	<div class="row" >
		<h3>금액 </h3>
		<input class="w3-input w3-border w3-round" type="text" size=10 id="activityCost" name="activityCost"> <h3>원</h3>
	</div>
	
	
	
	
	<div class="row" >
		<p class="question"> 어떤 도구를 사용하실 건가요? 저희에게 알려주세요</p>
			<div class="col-75">
				<c:if test="${list.whichProduct eq 1 }">
				 	<input type="text"  id="activityProduct" name="activityProduct" >
				</c:if>
				<c:if test="${list.whichProduct eq 2 }">
				 	<input type="text"  id="activityProduct" name="activityProduct" >
				</c:if>
				<c:if test="${list.whichProduct eq 3 }">
					<input class="w3-btn" type="Button" id="activityProduct" name="activityProduct" value="상점 보러가기!!" onclick="location.href='activityStoreList';"> 
				</c:if>
			</div>
	</div>
	
	<div class="row" >
		<p class="question"> 모집기간 </p>
				<div class="col-75">
					<input type="text" id="recruitStartDate" name="recruitStartDate" > 
					 <p style="display:inline"> ~ </p> 
					<input type="text" id="recruitEndDate" name="recruitEndDate">
				</div>
					<div> <p style="text-align:center;font-color:green"> ※활동 시작일 : <strong>${actiStartDate }</strong> </p> </div>
	</div>
	
	<div class="row" >
		<input class="w3-btn w3-green" type="submit" value="최종 등록"/>
	</div>
	</div>
</div>



</form:form>

</body>
</html>