<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> 활동 생성 </title>
<!-- 제이커리 -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!--   <link rel="stylesheet" href="/resources/demos/style.css"> -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>





<!--  제출 스크립트 -->
<script>
	$(function(){
		$("#frm").submit(function(){
			if($("#activityName").val()== ""){
				$("#activityName").focus();
				alert("이름을 입력해주세요.");
			return false;
			}
			
			if($("#actiStartDate").val()== ""){
				$("#actiStartDate").focus();
				alert("활동 시작일을 입력해주세요.");
			return false;
			}
			
			if($("#actiEndDate").val()== ""){
				$("#actiEndDate").focus();
				alert("활동 종료일을 입력해주세요.");
			return false;
			}
			if($("#recruitPeople").val()== ""){
				$("#recruitPeople").focus();
				alert("모집인원을 입력해주세요.");
			return false;
			}
			if($("#activityText").val()== ""){
				$("#activityText").focus();
				alert("활동 소개을 입력해주세요.");
			return false;
			}
			if($("#limitAge").val()== ""){
				$("#limitAge").focus();
				alert("나이 제한을 입력해주세요.");
			return false;
			}
			if($("#actiImage").val()== ""){
				$("#actiImage").focus();
				alert("사진을 넣어주세요.");
			return false;
			}
			if($("#sortOfActivity").val()== ""){
				$("#sortOfActivity").focus();
				alert("활동 종류를 입력해주세요.");
			return false;
			}
			if($("#whichProduct").val()== ""){
				$("#whichProduct").focus();
				alert("누구 물품을 사용할 것인지 선택해주세요");
			return false;
			}
			if($("#activityCity").val()== ""){
				$("#activityCity").focus();
				alert("활동할 도시명을 선택해주세요.");
			return false;
			}
			else{
				alert("등록이 완료되었습니다. 저희가 심사 후에 메일로 알려드릴게요.");
			}
		});
		
	});	
</script>




<!-- DATEPICKER -->
	<script>	  
  $( function() {
    var dateFormat = "mm/dd/yy",
      from = $( "#actiStartDate" )
        .datepicker({
			prevText: '이전달',
			nextText: '다음달',
			currentText: '오늘',
			monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
			dayNames: ['일', '월', '화', '수', '목', '금', '토'],
			dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
			dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
			minDate: "+5D", //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)		 
			changeMonth: true
        })
        .on( "change", function() {
          to.datepicker( "option", "minDate", getDate( this ) );
        }),
      to = $( "#actiEndDate" ).datepicker({
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


<!-- whichProduct 알림 -->
<script>
$( function() {
    $( "#actiStartDate" ).tooltip();
  });
$(function(){
	$("#whichProduct3").tooltip();	
});	
</script>

		

<style>
	.row {
		margin-top:20px;
		margin-botton:10px;
		margin-left:10px;
		margin-right:10px
		}

</style>

  
  
  



</head>
<body>





<!-- 상단  -->
<jsp:include page="../Main/memtop_noBoots.jsp" />




<!-- 중단  -->
<form:form class="form-inline" action="ActivityInsertPro" commandName="activityCommand1" method="post" id="frm" enctype="multipart/form-data">
<div class="jumbotron text-center" style="border-radius:35px; border:1px solid green; margin:40px auto;width:70%;padding-top: 50px; padding-right: 30px; padding-bottom: 50px; padding-left: 80px;">	<!-- 가운데 정렬  -->

	

	

	<div class="row" >
		<div class="form-group">
			<label for="sortOfActivity"> 활동 종류를 선택해주세요. </label>
		</div>
		<div>
			<form:select class="form-control" path="sortOfActivity" name="sortOfActivity" id="SortOfActivity">
					<option value="montain"> 산에서 </option>
					<option value="sea"> 바다에서 </option>
					<option value="street"> 길에서 </option>
					<option value="animal"> 동물과 </option>
					<option value="toEat"> 먹어요 </option>
					<option value="speed"> 속도를 즐겨요 </option>
					<option value="toLearn"> 배워요 </option>
			</form:select>
		</div>
	</div>
	
	
	<div class="row">
		<div>
			<label for="activityName"> 한 줄 소개 </label>
		</div>
		<div>
			<input class="form-control" type="text" name="activityName" id="activityName" size="20"/>
		</div>
	</div>
	
	<div class="row">
		<div>
			<label for="activityCity"> 활동지역 </label> 
	    </div>
		<div>
			<form:select path="activityCity" class="form-control" id="activityCity">
				<option value="">-----선택해주세요-------</option>
				<form:options items="${activityCity}" />
			</form:select>
	     </div>
	</div>
	
	<div class="row">
		<div>
			<label for="whichProduct"> 사용할 물품을 선택해 주세요 </label>
		</div>
		<div>
				<label> <input type="radio" value="1" id="whichProduct" name="whichProduct" /> 저의 물품을 사용할게요. </label> <br/>
				<label> <input type="radio" value="2" id="whichProduct" name="whichProduct" /> 참여 회원의 개인 물품을 사용할게요. </label> <br/>
				<label> <input type="radio" value="3" id="whichProduct3" name="whichProduct" title="물품 대여에 대한 결제는 활동 등록 2단계에서 가능합니다." /> 헤윰에서 물품을 대여할게요! </label> <br/>
				<label> <input type="radio" value="4" id="whichProduct" name="whichProduct" /> 활동 물품이 필요없습니다.</label> 
		</div>	
	</div>
	
	<div class="row">
		<div>
			<label for="actiDate"> 활동일 </label>
		</div>
		<div>
			<input class="form-control" type="text" id="actiStartDate" name="actiStartDate" title="활동일은 활동 최종 등록일로부터 5일 이후로 지정할 수 있습니다.">
				<label for="to"> ~ </label>
			<input class="form-control" type="text" id="actiEndDate" name="actiEndDate">
		</div>
	</div>
	
	<div class="row">
		<div>
			<label for="recruitPeople"> 모집 인원 </label>
		</div>
		<div>
			<form:select class="form-control" path="recruitPeople" id="recruitPeople">
				<option value="">-----선택해주세요-------</option>
				<form:options items="${recruitPeople}" />
			</form:select>
		</div>
	</div>
		
	<div class="row">
		<div>
			<label for="limitAge"> 참여 가능 나이 </label>
		</div>
		<div>
			<form:select class="form-control" path="limitAge" id="limitAge">
				<option value="">-----선택해주세요-------</option>
				<form:options items="${limitAge}" />
			</form:select>
		</div>
	</div>
		
	<div class="row">
		<div>
			<label for="actiImage"> 사진 </label>
		</div>
		<div>
			<input style="float: none; margin: 0 auto;" type="file" name="actiImage" id="actiImage" multiple="multiple" />
		</div>
	</div>
	
	<div class="row" style="padding:10px">
		<div>
			<label for="activityText"> 활동 소개 </label>
		</div>
		<div>
			<form:textarea class="form-control" style="width:100%;height:150" path="activityText" id="activityText"/>
		</div>
	</div>
	
	<div class="row">
			<input  class="btn btn-cuccess" type="submit" id="sumbit" value="제출"   />
	</div>
	
	
	
</div>
</form:form>


</body>
</html>