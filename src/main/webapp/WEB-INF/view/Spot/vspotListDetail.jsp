<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
  	
  	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> <!-- 현재 얘때문. -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>
	<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0eb1f252a397cdfb0e2f7cfd75b42ed4&libraries=services"></script>
  	
  	<script type="text/javascript">
	    $(document).ready(function(){
	      $('.slider').bxSlider({
	    	  auto: true, 
	          speed: 500, 
	          pause: 4000, 
	          mode:'fade', 
	          autoControls: false, 
	          pager:false , 
	      });
	      
	    });
	  </script>


	<script>
		var geocoder = new kakao.maps.services.Geocoder();
		
		var gap = "${list.vspotLocationMap}";
		var lat = "";
		var lng = "";
		var compName = "";
		
		geocoder.addressSearch(gap, function(result, status) {
			if(status == daum.maps.services.Status.OK) {
				var coords = new daum.maps.LatLng(result[0].y, result[0].x);
				
				lat = result[0].y;
				lng = result[0].x;
			}
	
			var mapContainer = document.getElementById('map');
			var mapOption = {
					center : new daum.maps.LatLng(lat, lng),
					level : 3
			};
			
			var map = new daum.maps.Map(mapContainer, mapOption);
			
			var mapTypeControl = new kakao.maps.MapTypeControl();
			
			map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);
			
			var zoomControl = new kakao.maps.ZoomControl();
			map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
			
			var position = {
					title : compName,
					latlng : new daum.maps.LatLng(lat, lng)
			};
			
			var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
			
			var imageSize = new daum.maps.Size(24, 35);
			
			var markerImage = new daum.maps.MarkerImage(imageSrc, imageSize);
			
			var marker = new daum.maps.Marker({
				map : map,
				position : position.latlng,
				title : position.title,
				image : markerImage
			});
			
			daum.maps.event.addListener(marker, 'click', function() {
				window.open("http://map.daum.net/link/map/" + lat + "," + lng);
			});
		});
		
	</script> 

<title>휴양지 상세보기(리스트에서 클릭 시)</title>

	<style type="text/css">
		.tq{
			position: relative;
			left: 18%;
		}
		
		.zoom_image {
    		overflow: hidden;
		}
		
		.zoom_image  img {
		    -webkit-transform:scale(1);
		    -moz-transform:scale(1);
		    -ms-transform:scale(1); 
		    -o-transform:scale(1);  
		    transform:scale(1);
		    -webkit-transition:.3s;
		    -moz-transition:.3s;
		    -ms-transition:.3s;
		    -o-transition:.3s;
		    transition:.3s;
		}

		.zoom_image:hover img {
		    cursor:pointer;
		    transform:scale(1.1);
		    -o-transform:scale(1.1); 
		    -moz-transform:scale(1.1);
		    -webkit-transform:scale(1.1);
		    transition: transform .35s;  
		    -o-transition: transform .35s;
		    -moz-transition: transform .35s;
		    -webkit-transition: transform .35s;
		    
		}
		
		.but {
			background-color: white;
			color: black;
			border: 2px solid #e7e7e7;
			position: relative;
			left: 92%;
			top: 500px;
			font-family: 'Nanum Gothic';
			border-radius: 10px;
			width: 100px;
			height: 40px;
			font-size:15px;
		}
		
		.title {
			position: relative;
			left: 18%;
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 32px !important;
		    font-weight: 800 !important;
		    line-height: 1.125em !important;
		    color: rgb(72, 72, 72) !important;
		    padding-top: 6px !important;
		    padding-bottom: 6px !important;
		    margin: 0px !important;
		}
		.qnrk {
			position: relative;
			left: 18%;
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;

		}
		
		.qnrk2 {
			position: relative;
			left: 18%;
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 800 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;

		}
		
		.mei1 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 20.5%;
			top: -14px;
		}
		
		.mei2 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 34.5%;
			top: -62px;
		}
		
		.mei3 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    margin: 0px !important;
		    position: relative;
			left: 20.5%;
			top: -45px;
		}

		.abc1 {
			position: relative;
			left: 18%;
			top: 10px;
		}
		.abc2 {
			position: relative;
			left: 32%;
			top: -40px;
		}
		.abc3 {
			position: relative;
			left: 18%;
			top: -20px;
		}
		progress {
		  background-color: #303a52;
		  border: 0;
		  height: 3.5px;
		  border-radius: 18px;
		}
		
		.avg {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 18px !important;
		    font-weight: 400 !important;
		    line-height: 1.44444em !important;
		    color: inherit !important;
		    margin: 0px !important;
		    position: relative;
			left: 18.2%;
			top: -9px;
		   
		}
		
		.revi {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 18px !important;
		    font-weight: 400 !important;
		    line-height: 1.44444em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 19%;
			top: -9px;
		}
		
		.star1s {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 18%;
			top: -5px;
		
		}
		
		.star2s {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 38%;
			top: -69px;
		
		}
		
		.star3s {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 18%;
			top: -80px;
		
		}
		
		.star4s {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 38%;
			top: -144px;
		
		}
		
		.probar1 {
			position: relative;
			left: 23%;
			top: -31px;	
		}
		
		.probar2 {
			position: relative;
			left: 43.2%;
			top: -94px;
		}
		
		.probar3 {
			position: relative;
			left: 23%;
			top: -105px;
		}
		
		.probar4 {
			position: relative;
			left: 43.2%;
			top: -169px;
		}
		
		.starsu1 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 31.4%;
			top: -50px;	
		    
		}
		
		.starsu2 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 51.7%;
			top: -112px;
		}
		
		.starsu3 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		     position: relative;
			left: 31.4%;
			top: -123px;	
		}
		
		.starsu4 {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 51.7%;
			top: -187px;
		}

		
		.swiper-container {
			width : 70%;
			height: 420px;
			position: relative;
			left : 3%;
		    top: -80px;

		}
		.swiper-slide {
			text-align:center;
			display:flex;
			align-items:center; 
			justify-content:center;
		}
		.swiper-slide a img {
			box-shadow:0 0 5px #555;
			max-width:98%;
			margin: 0;
			padding: 0;
		}
		.swiper-button-next {
			position: relative;
			left: 89%;
			top:-300px;
		}
		.swiper-button-prev {
			position: relative;
			left: 15.5%;
			top:-325px;
		}
		
		
		#swiper-button-next1 {
			position: relative;
			left: 89%;
			top:-300px;
		}
		#swiper-button-prev1 {
			position: relative;
			left: 15.5%;
			top:-325px;
		}
		
		
		.rotq {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 800 !important;
		    line-height: 1.375em !important;
		    text-overflow: ellipsis !important;
		    max-height: 4.125em !important;
		    -webkit-line-clamp: 3 !important;
		    display: -webkit-box !important;
		    -webkit-box-orient: vertical !important;
		    margin: 0px !important;
		    overflow: hidden !important;
			position: absolute;
			left: 0px;
			top: 320px;
		}
		
		.rotn {
			position: absolute;
			left: 0px;
			top: 340px;
		}
		
		.shopna {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 800 !important;
		    line-height: 1.375em !important;
		    text-overflow: ellipsis !important;
		    max-height: 4.125em !important;
		    -webkit-line-clamp: 3 !important;
		    display: -webkit-box !important;
		    -webkit-box-orient: vertical !important;
		    margin: 0px !important;
		    overflow: hidden !important;
			position: absolute;
			left: 0px;
			top: 320px;
		}
		
		.shoplo {
			position: absolute;
			left: 0px;
			top: 340px;
		}
		
		hr {
			border-top: 0.3px solid #bbb;
			width: 64%;
			align:center;
			text-align: center;
		}
		.dlehd {
			position: relative;
			left: 0%;
			top:-160px;
		}
		
		.oness {
		    overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 18%;
			top:10px;
		}
		
		.na {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 600 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 18%;
		
		}
		
		.na12 {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 14px !important;
		    font-weight: 400 !important;
		    line-height: 1.28571em !important;
		    color: rgb(72, 72, 72) !important; 
		    margin: 0px !important;
		    position: relative;
			left: 18%;
		
		}
		
		.na13 {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 550 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;
		    position: relative;
			left: 18%;
		}
		
		.na14 {
			overflow-wrap: break-word !important;
		    font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, "Helvetica Neue", sans-serif !important;
		    font-size: 16px !important;
		    font-weight: 400 !important;
		    line-height: 1.375em !important;
		    color: rgb(72, 72, 72) !important;
		    margin: 0px !important;	
		    position: relative;
			left: 18%;
		}
		.myButton {
			box-shadow:inset 0px 1px 18px 0px #ffffff;
			background:linear-gradient(to bottom, #f9f9f9 5%, #e9e9e9 100%);
			background-color:#f9f9f9;
			border-radius:12px;
			border:1px solid #dcdcdc;
			display:inline-block;
			cursor:pointer;
			color:#666666;
			font-family:Arial;
			font-size:15px;
			font-weight:bold;
			padding:9px 24px;
			text-decoration:none;
			text-shadow:0px 1px 0px #ffffff;
			position: relative;
			top : -36px;
			left: 28%;
			
		}
		.myButton:hover {
			background:linear-gradient(to bottom, #e9e9e9 5%, #f9f9f9 100%);
			background-color:#e9e9e9;
		}
	
		
		
		#myButton1 {
			box-shadow:inset 0px 1px 18px 0px #ffffff;
			background:linear-gradient(to bottom, #f9f9f9 5%, #e9e9e9 100%);
			background-color:#f9f9f9;
			border-radius:12px;
			border:1px solid #dcdcdc;
			display:inline-block;
			cursor:pointer;
			color:#666666;
			font-family:Arial;
			font-size:15px;
			font-weight:bold;
			padding:9px 24px;
			text-decoration:none;
			text-shadow:0px 1px 0px #ffffff;
			position: relative;
			top : -40px;
			left: 52%;
			z-index: 5;
			
		}
		#myButton1:hover {
			background:linear-gradient(to bottom, #e9e9e9 5%, #f9f9f9 100%);
			background-color:#e9e9e9;
		}
	
		</style>

</head>
<body>
 	<c:if test="${empty authInfo}">
		<jsp:include page="../Main/top.jsp" />
	</c:if>	
	<c:if test="${Lev eq 1}">
		<jsp:include page="../Main/memtop.jsp" />
	</c:if> 
	<c:if test="${Lev eq 4}">
		<jsp:include page="../Main/admintop.jsp" />
	</c:if> 
	
	
	<div style="width: 100%; height: 550px;">
	 <c:if test="${fn:length(store) >= 5}">
	 
	 <div style="width: 100%; height: 550px;" >
	 	
		<c:forEach var="store1" items="${store}" varStatus="status" >
		
			<c:if test="${status.index eq 0 }">				
				<div style="width: 50%; height: 550px;  position: absolute; left: 0%; top: 80px;" class="zoom_image" >
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 1 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 50%; top: 80px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 2 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 75%; top: 80px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 3 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 50%; top: 354px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 4 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 75%; top: 354px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%"  />
				</div>
				<input class="but" type="button" value="사진 보기" onclick="location.href='vspotListDetailTwo?num=${list.vspotNum}'"/>
			
			</c:if>
		</c:forEach>
	 </div>
	 </c:if>
	 
	 <c:if test="${fn:length(store) < 5}">
	 	<div class="slider" style="width: 100%; height: 550px;" >
	 		<c:forEach var="store1" items="${store}" varStatus="status" >
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%">
			</c:forEach>
	 	</div>
	 </c:if>
	 
	</div>
	<br><br>
	
	<span class="title">${list.vspotTitle}</span>
	<div class="qnrk">${list.vspotLoc}</div><br>
	<!--한줄소개 들어가야함!!!!!!!1 css 먹이자!! -->
	<div class="oness">${list.vspotFeature}</div>
	<center><hr></center><br/>
	
	<!--소개 들어가야함!!!!!!!1 css 먹이자!! -->
	<div class="qnrk">${list.vspotIntroduce}</div> 
	<center><hr></center><br/>
	
	
	<script type="text/javascript">
		function hello() {
			if(${Lev == 1}) {
				location.href='vspotReview?num=${list.vspotNum}';
			} else {
				alert("로그인이 필요합니다.");
			}		
		}
	</script>
	
	<span class="title">후기</span><br>
	<div>
		<input type="button" name="Review" id="Review" value="후기 작성하기" onclick="hello()" class="myButton" />
	</div>
	<img src="Spot/upload/star.png" alt="x" width="18" height="18" style="position: relative; left: 18%; top: -12px;">
	<span class="avg"> ${maxAvg}</span> <span style="filter:alpha(opacity=1); opacity:0.3; position: relative; left: 18.6%; top: -12px;">|</span> <span class="revi">${count } 후기</span><center><hr></center>
	
	<div class="star1s"> 정확성 </div>
		<div class="probar1">
			<progress value="${avg1 }" max="5"></progress>
			</div>
		
	<div class="starsu1">${avg1 }</div>
	
	 <div class="star2s"> 청결도 </div>
		 <div class="probar2">
	 		<progress value="${avg2 }" max="5"></progress>
	 	</div>
	 
	 <div class="starsu2">${avg2 }</div>
	 
	<div class="star3s"> 가치 </div>
		<div class="probar3">
			<progress value="${avg3 }" max="5"></progress>
		</div>
	
	<div class="starsu3">${avg3 }</div>
	
	<div class="star4s"> 위치 </div>
		<div class="probar4">
			<progress value="${avg4 }" max="5"></progress>
		</div>
	
	<div class="starsu4">${avg4 }</div>
	
	<div class="dlehd">
	<c:forEach var="sdto" items="${srdto}">
	<!-- css먹이기 -->
		<div class="na">${sdto.memId }</div>
		<div class="na12"><fmt:formatDate value="${sdto.spotReviewDate}" pattern="yyyy"/>년 <fmt:formatDate value="${sdto.spotReviewDate}" pattern="MM"/>월</div><br/>
		<div class="na13">${sdto.spotReviewTitle }</div><br/>
		<div class="na14">${sdto.spotReviewContext }</div>
		<center><hr /></center>
		
	
	</c:forEach>
		<div style="position: relative; left: -2.8%; top:10px;">
			<div class="container">
				<div class="row">
					<div class="col">
						<ul class="pagination">
							<c:if test="${page <= 1}">
									<li class="page-item"><a class="page-link" href="#"><</a></li> &nbsp;<!-- 첫 페이지  -->
							</c:if>
							<c:if test="${page > 1}">
									<li class="page-item"><a href = "vspotListDetail?page=${page -1}&num=${list.vspotNum}" class="page-link"> Previous </a></li>&nbsp;
							</c:if>
							
							<c:forEach var = "i" begin="${startPage }" end ="${endPage}" >
									<li class="page-item"><a href = "vspotListDetail?page=${i}&num=${list.vspotNum}" class="page-link"> ${i} </a></li>&nbsp;
							</c:forEach>
							
							<c:if test="${page >= maxPage}">	
									<li class="page-item"><a class="page-link" href="#">></a></li> &nbsp; <!-- 마지막 페이지  -->
							</c:if>
							<c:if test="${page < maxPage}">	
									<li class="page-item"><a href = "vspotListDetail?page=${page +1}&num=${list.vspotNum}" class="page-link">Next</a></li>&nbsp;
							</c:if>
						</ul>
					</div>
				</div> 
			</div>
		</div>
	
	<!-- 후기 만들고 후기내용 작성해야함. -->
	<center><hr></center><br/>
	
	
	<span class="title">지역 정보</span><br/><br/>
	<c:if test="${list.memId != 'admin'}">
		<div class="qnrk">추천자의 여행추천 장소는 ${list.vspotLoc }에 있습니다.</div>
	</c:if><br/>
	<c:if test="${list.memId eq 'admin'}">
		<div class="qnrk">관리자의 여행추천 장소는 ${list.vspotLoc }에 있습니다.</div>
	</c:if>
	<div id="map" style="width:48%; height:400px;" class="tq"></div><br/>
	<center><hr></center><br/>
	<span class="qnrk2">휴양지 이용 규칙</span><br><br>
	<!-- 이미지와 내용 작성하기. -->
	<img src="Spot/upload/smoking.png" alt="X" width="25" height="25" class="abc1"><div class="mei1"> 흡연금지 </div>
	<img src="Spot/upload/party.png" alt="X" width="25" height="25" class="abc2"><div class="mei2"> 파티나 이벤트 금지 </div>
	<img src="Spot/upload/animal.png" alt="X" width="25" height="25" class="abc3"><div class="mei3"> 반려동물 동반 가능 </div>  
	<center><hr></center><br/>
		
	
	<span class="title">추천 휴양지 더 보기</span><br>
	 <c:set var="i" value="0"></c:set>
	<div class="swiper-container">
		<div class="swiper-wrapper">
			<c:forEach var="test" items="${vlist}" varStatus="status">
			<c:if test="${i < 7}">
				<c:forTokens items="${test.vspotStore}" delims="-" var="store" end="0">
					<div class="swiper-slide">						
						 <a href="vspotListDetail?num=${test.vspotNum}" style=" text-decoration:none; color:#000000; ">	
						 	<span class="rotq">${test.vspotTitle }</span>
						 	<span class="rotn">${test.vspotLoc }</span>
							<img src="Spot/upload/${store}" alt="X"  width="1000" height="200">	
						 </a>
					</div>
				</c:forTokens>
				<c:set var="i" value="${i+1}"></c:set> 
			</c:if>
			</c:forEach>
			
		</div>
	</div>
		<div class="swiper-button-next"></div>
		<div class="swiper-button-prev"></div>	
	<script>
	
		new Swiper('.swiper-container', {
			
			slidesPerView : 3, 
			spaceBetween : 30, 
			slidesPerGroup : 1, 
			
			loopFillGroupWithBlank : true,

			navigation : { 
				nextEl : '.swiper-button-next', 
				prevEl : '.swiper-button-prev', 
			},
		});
		
	</script>
	
	
	<div style="position: relative; left: 0%; top: -130px;">
	
	<!-- 그럼 해야할게 저걸 누르면 상세보기도 가야하고 등록하면 이렇게 top이 2개 뜨는것 나머지 등록하고 top 뜨는거 그런거 정리-->
		
	<span class="title">추천 맛집/카페 더 보기</span><br>
	
	<c:if test="${Lev eq 1}">
		<div>
			<input type="button" value="등록버튼이요!" onclick="location.href='adminshop?num=${list.vspotNum}'" class="myButton1" id="myButton1"/>
		</div>
	</c:if>
	
	<c:if test="${Lev eq 4}">
		<div>
			<input type="button" value="등록버튼이요!" onclick="location.href='adminshopInsert?num=${list.vspotNum}'" class="myButton1" id="myButton1"/>
		</div>
	</c:if>
	
	 <c:set var="i" value="0"></c:set>
	<div class="swiper-container"  id="swiper-container1">
		<div class="swiper-wrapper">
			<c:forEach var="shop1" items="${shop}" varStatus="status">
			<c:if test="${i < 7}">
				<c:forTokens items="${shop1.goodsStore}" delims="-" var="store" end="0">
					<div class="swiper-slide">						
						 <a href="shopDetail?num=${shop1.shopNum}&page=${page}&num2=${shop1.vspotNum}" style=" text-decoration:none; color:#000000; ">	
						 	<span class="shopna">${shop1.shopName }</span>
						 	<span class="shoplo">${shop1.shopLoc } (${shop1.shopTime1} ~ ${shop1.shopTime2})</span>
							<img src="Spot/upload/${store}" alt="X"  width="1000" height="200">	
						 </a>
					</div>
				</c:forTokens>
				<c:set var="i" value="${i+1}"></c:set> 
			</c:if>
			</c:forEach>	
		</div>
	</div>
	
		<div class="swiper-button-next" id="swiper-button-next1"></div>
		<div class="swiper-button-prev" id="swiper-button-prev1"></div>	
		<script>
		
			new Swiper('#swiper-container1', {
				
				slidesPerView : 3, 
				spaceBetween : 30, 
				slidesPerGroup : 1, 
				
				loopFillGroupWithBlank : true,
	
				navigation : { 
					nextEl : '#swiper-button-next1', 
					prevEl : '#swiper-button-prev1', 
				},
			});
			
		</script>
	</div>
	
</div>
	
</body>
</html>