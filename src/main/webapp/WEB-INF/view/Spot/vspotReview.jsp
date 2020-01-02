<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 1번 별표 내용 -->
	<style>
		.star-input1>.input1,
		.star-input1>.input1>label:hover,
		.star-input1>.input1>input:focus+label,
		.star-input1>.input1>input:checked+label{display: inline-block;vertical-align:middle;background:url('Spot/upload/grade_img.png')no-repeat;}
		.star-input1{display:inline-block; white-space:nowrap;width:210px;height:40px;padding:25px;line-height:30px;}
		.star-input1>.input1{display:inline-block;width:150px;background-size:150px;height:28px;white-space:nowrap;overflow:hidden;position: relative;}
		.star-input1>.input1>input{position:absolute;width:1px;height:1px;opacity:0;}
		.star-input1>.input1.focus{outline:1px dotted #ddd;}
		.star-input1>.input1>label{width:30px;height:0;padding:28px 0 0 0;overflow: hidden;float:left;cursor: pointer;position: absolute;top: 0;left: 0;}
		.star-input1>.input1>label:hover,
		.star-input1>.input1>input:focus+label,
		.star-input1>.input1>input:checked+label{background-size: 150px;background-position: 0 bottom;}
		.star-input1>.input1>label:hover~label{background-image: none;}
		.star-input1>.input1>label[for="p1"]{width:30px;z-index:5;}
		.star-input1>.input1>label[for="p2"]{width:60px;z-index:4;}
		.star-input1>.input1>label[for="p3"]{width:90px;z-index:3;}
		.star-input1>.input1>label[for="p4"]{width:120px;z-index:2;}
		.star-input1>.input1>label[for="p5"]{width:150px;z-index:1;}
		/* .star-input1>output{display:inline-block;width:60px; font-size:18px;text-align:right; vertical-align:middle;} */
	</style>
	
	
	<!-- 2번 별표 내용 -->
	<style>
		.star-input2>.input2,
		.star-input2>.input2>label:hover,
		.star-input2>.input2>input:focus+label,
		.star-input2>.input2>input:checked+label{display: inline-block;vertical-align:middle;background:url('Spot/upload/grade_img.png')no-repeat;}
		.star-input2{display:inline-block; white-space:nowrap;width:225px;height:40px;padding:25px;line-height:30px;}
		.star-input2>.input2{display:inline-block;width:150px;background-size:150px;height:28px;white-space:nowrap;overflow:hidden;position: relative;}
		.star-input2>.input2>input{position:absolute;width:1px;height:1px;opacity:0;}
		.star-input2>.input2.focus{outline:1px dotted #ddd;}
		.star-input2>.input2>label{width:30px;height:0;padding:28px 0 0 0;overflow: hidden;float:left;cursor: pointer;position: absolute;top: 0;left: 0;}
		.star-input2>.input2>label:hover,
		.star-input2>.input2>input:focus+label,
		.star-input2>.input2>input:checked+label{background-size: 150px;background-position: 0 bottom;}
		.star-input2>.input2>label:hover~label{background-image: none;}
		.star-input2>.input2>label[for="p6"]{width:30px;z-index:5;}
		.star-input2>.input2>label[for="p7"]{width:60px;z-index:4;}
		.star-input2>.input2>label[for="p8"]{width:90px;z-index:3;}
		.star-input2>.input2>label[for="p9"]{width:120px;z-index:2;}
		.star-input2>.input2>label[for="p10"]{width:150px;z-index:1;}
	</style>
	
	<!-- 3번 별표 내용 -->
	<style>
		.star-input3>.input3,
		.star-input3>.input3>label:hover,
		.star-input3>.input3>input:focus+label,
		.star-input3>.input3>input:checked+label{display: inline-block;vertical-align:middle;background:url('Spot/upload/grade_img.png')no-repeat;}
		.star-input3{display:inline-block; white-space:nowrap;width:225px;height:40px;padding:25px;line-height:30px;}
		.star-input3>.input3{display:inline-block;width:150px;background-size:150px;height:28px;white-space:nowrap;overflow:hidden;position: relative;}
		.star-input3>.input3>input{position:absolute;width:1px;height:1px;opacity:0;}
		.star-input3>.input3.focus{outline:1px dotted #ddd;}
		.star-input3>.input3>label{width:30px;height:0;padding:28px 0 0 0;overflow: hidden;float:left;cursor: pointer;position: absolute;top: 0;left: 0;}
		.star-input3>.input3>label:hover,
		.star-input3>.input3>input:focus+label,
		.star-input3>.input3>input:checked+label{background-size: 150px;background-position: 0 bottom;}
		.star-input3>.input3>label:hover~label{background-image: none;}
		.star-input3>.input3>label[for="p11"]{width:30px;z-index:5;}
		.star-input3>.input3>label[for="p12"]{width:60px;z-index:4;}
		.star-input3>.input3>label[for="p13"]{width:90px;z-index:3;}
		.star-input3>.input3>label[for="p14"]{width:120px;z-index:2;}
		.star-input3>.input3>label[for="p15"]{width:150px;z-index:1;}
	</style>
	
	<!-- 4번 별표 내용 -->
	<style>
		.star-input4>.input4,
		.star-input4>.input4>label:hover,
		.star-input4>.input4>input:focus+label,
		.star-input4>.input4>input:checked+label{display: inline-block;vertical-align:middle;background:url('Spot/upload/grade_img.png')no-repeat;}
		.star-input4{display:inline-block; white-space:nowrap;width:225px;height:40px;padding:25px;line-height:30px;}
		.star-input4>.input4{display:inline-block;width:150px;background-size:150px;height:28px;white-space:nowrap;overflow:hidden;position: relative;}
		.star-input4>.input4>input{position:absolute;width:1px;height:1px;opacity:0;}
		.star-input4>.input4.focus{outline:1px dotted #ddd;}
		.star-input4>.input4>label{width:30px;height:0;padding:28px 0 0 0;overflow: hidden;float:left;cursor: pointer;position: absolute;top: 0;left: 0;}
		.star-input4>.input4>label:hover,
		.star-input4>.input4>input:focus+label,
		.star-input4>.input4>input:checked+label{background-size: 150px;background-position: 0 bottom;}
		.star-input4>.input4>label:hover~label{background-image: none;}
		.star-input4>.input4>label[for="p16"]{width:30px;z-index:5;}
		.star-input4>.input4>label[for="p17"]{width:60px;z-index:4;}
		.star-input4>.input4>label[for="p18"]{width:90px;z-index:3;}
		.star-input4>.input4>label[for="p19"]{width:120px;z-index:2;}
		.star-input4>.input4>label[for="p20"]{width:150px;z-index:1;}
		
		.gkrl {position: relative; left: 14.5%; top: 32px;}
		
		.mmmm {position: relative; left: 14.5%; top: 32px;}
		.title {position: relative; left: 2%; top: 56px;}
		.tin {position: relative; left: 2%; top: 60px;}
		
		.sra {position: relative; left: 2%; top: 55px;}
		
		.star-input1 {position: relative; left: 2%; top: 5px;}
		.a1 { position: relative; left: 2%; top: 8px; }
		.star-input2 {position: relative; left: 1%; top: 5px;}
		.a2 { position: relative; left: 1%; top: 8px; }
		.star-input3 {position: relative; left: -32.5%; top: 82px;}
		.a3 { position: relative; left: -33.3%; top: 84px; }
		.star-input4 {position: relative; left: -33.4%; top: 82px;}
		.a4 { position: relative; left: -34.2%; top: 84px; }
		
		
		.txt {position: relative; left: 2%; top: 100px;}
		
		.btn1 {position: relative; left: 2%; top: 75px;}
		.btn2 {position: relative; left: 2%; top: 75px;  }
		.btn3 {position: relative; left: 2%; top: 75px;  }
		
		
	</style>
	
	
	
		
		
		
	
	
</head>

<body>
	<form:form action="vspotReviewPro" id="frm" method="post" commandName="vspotReviewCommand">
		<input type="hidden" name="num" value="${list.vspotNum }" >
		<div>
		<div class="mmmm"> 후기 작성 </div>
		<div class="title"> 제목 </div> <form:input cssClass="tin" path="spotReviewTitle" id="spotReviewTitle" size="74" /><br/><br/>
		
		<div class="sra"> 작성자 &nbsp;:&nbsp;${au} </div> <br><br>
		
		<!-- 1번 별표요! -->
	<label class="a1"> 정확성 : </label>
	<span class="star-input1">
		<span class="input1">
	    	<input type="radio" name="spotReviewStar1" value="1" id="p1">
	    	<label for="p1">1</label>
	    	<input type="radio" name="spotReviewStar1" value="2" id="p2">
	    	<label for="p2">2</label>
	    	<input type="radio" name="spotReviewStar1" value="3" id="p3">
	    	<label for="p3">3</label>
	    	<input type="radio" name="spotReviewStar1" value="4" id="p4">
	    	<label for="p4">4</label>
	    	<input type="radio" name="spotReviewStar1" value="5" id="p5">
	    	<label for="p5">5</label>
	  	</span>			
	</span>
	
	
	<!-- 2번 별표요! --> 
	<label class="a2"> 청결도 : </label>
	<span class="star-input2">
		<span class="input2">
	    	<input type="radio" name="spotReviewStar2" value="1" id="p6">
	    	<label for="p6">1</label>
	    	<input type="radio" name="spotReviewStar2" value="2" id="p7">
	    	<label for="p7">2</label>
	    	<input type="radio" name="spotReviewStar2" value="3" id="p8">
	    	<label for="p8">3</label>
	    	<input type="radio" name="spotReviewStar2" value="4" id="p9">
	    	<label for="p9">4</label>
	    	<input type="radio" name="spotReviewStar2" value="5" id="p10">
	    	<label for="p10">5</label>
	  	</span>			
	</span>
	
	

	<!-- 3번 별표요! --> 
	<label class="a3"> 가치 : </label>
	<span class="star-input3">
		<span class="input3">
	    	<input type="radio" name="spotReviewStar3" value="1" id="p11">
	    	<label for="p11">1</label>
	    	<input type="radio" name="spotReviewStar3" value="2" id="p12">
	    	<label for="p12">2</label>
	    	<input type="radio" name="spotReviewStar3" value="3" id="p13">
	    	<label for="p13">3</label>
	    	<input type="radio" name="spotReviewStar3" value="4" id="p14">
	    	<label for="p14">4</label>
	    	<input type="radio" name="spotReviewStar3" value="5" id="p15">
	    	<label for="p15">5</label>
	  	</span>			
	</span>

	
	
	<!-- 4번 별표요! --> 
	<label class="a4"> 위치 : </label>
	<span class="star-input4">
		<span class="input4">
	    	<input type="radio" name="spotReviewStar4" value="1" id="p16">
	    	<label for="p16">1</label>
	    	<input type="radio" name="spotReviewStar4" value="2" id="p17">
	    	<label for="p17">2</label>
	    	<input type="radio" name="spotReviewStar4" value="3" id="p18">
	    	<label for="p18">3</label>
	    	<input type="radio" name="spotReviewStar4" value="4" id="p19">
	    	<label for="p19">4</label>
	    	<input type="radio" name="spotReviewStar4" value="5" id="p20">
	    	<label for="p20">5</label>
	  	</span>			
	</span>
		
		<form:textarea path="spotReviewContext" id="spotReviewContext" rows="20" cols="80" cssClass="txt"/><br/><br/>
	
		
		<input type="submit" value="전송"  class="btn1"/>
		<input type="reset" value="재입력" class="btn2"/>
		<input type="button" value="뒤로가기" onclick="javascript:history.back();" class="btn3"/>
		</div>
	</form:form>
</body>
</html>