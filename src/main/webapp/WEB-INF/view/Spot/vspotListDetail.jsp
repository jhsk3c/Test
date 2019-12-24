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
			top: -60px;
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
		
		hr {
			border-top: 0.2px solid #bbb;
			width: 64%;
			align:center;
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
		

</style>
<title>휴양지 상세보기(리스트에서 클릭 시)</title>
<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0eb1f252a397cdfb0e2f7cfd75b42ed4&libraries=services"></script>
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
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

	  <script>
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
	  
	  
	  
	  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>
		
		<style type="text/css">
		
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
			max-width:100%;
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
			left: 15%;
			top:-325px;
		}
		.rotq {
			position: absolute;
			left: 0px;
			top: 320px;
		}
		
		.rotn {
			position: absolute;
			left: 0px;
			top: 340px;
		}
		
		
		
		
		</style>
	 
</head>
<body>
 	
	<jsp:include page="../Main/top.jsp" />
	<div style="width: 100%; height: 550px;">
	 <c:if test="${fn:length(store) >= 5}">
	 
	 <div style="width: 100%; height: 550px;" >
	 	
		<c:forEach var="store1" items="${store}" varStatus="status" >
		
			<c:if test="${status.index eq 0 }">				
				<div style="width: 50%; height: 550px;" class="zoom_image" >
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 1 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 50%; top: 151px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 2 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 75%; top: 151px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 3 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 50%; top: 425px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%" />
				</div>
			</c:if>
				
			<c:if test="${status.index eq 4 }">
				<div style="width: 25%; height: 275px; position: absolute; left: 75%; top: 425px;" class="zoom_image">
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%"  />
				</div>
				<input class="but" type="button" value="사진 보기" onclick="location.href='vspotListDetailTwo?num=${list.vspotNum}'"/>
			
			</c:if>
		</c:forEach>
	 </div>
	 </c:if>
	 
	 <c:if test="${fn:length(store) < 5}">
	 	<div class="slider" style="width: 100%; height: 550px; " >
	 		<c:forEach var="store1" items="${store}" varStatus="status" >
					<img src="Spot/upload/${store1}" alt="X" width="100%" height="100%">
			</c:forEach>
	 	</div>
	 </c:if>
	 
	</div>
	<br>
	
	<span class="title">${list.vspotTitle}</span>
	<div class="qnrk">${list.vspotLoc}</div><br>
	<!--한줄소개 들어가야함!!!!!!!1 css 먹이자!! -->
	<div class="qnrk">${list.vspotFeature}</div>
	<hr><br/>
	
	<!--소개 들어가야함!!!!!!!1 css 먹이자!! -->
	<div class="qnrk">${list.vspotIntroduce}</div> 
	<hr><br/>
	
	
	
	<span class="title">후기</span><br>
	<!-- 후기 만들고 후기내용 작성해야함. -->
	<hr><br/>
	
	
	<span class="title">지역 정보</span><br/><br/>
	<c:if test="${list.memId != 'admin'}">
		<div class="qnrk">추천자의 여행추천 장소는 ${list.vspotLoc }에 있습니다.</div>
	</c:if><br/>
	<c:if test="${list.memId eq 'admin'}">
		<div class="qnrk">관리자의 여행추천 장소는 ${list.vspotLoc }에 있습니다.</div>
	</c:if>
	<div id="map" style="width:48%; height:400px;" class="tq"></div><br/>
	<hr><br/>
	<span class="qnrk2">휴양지 이용 규칙</span><br><br>
	<!-- 이미지와 내용 작성하기. -->
	<img src="Spot/upload/smoking.png" alt="X" width="25" height="25" class="abc1"><div class="mei1"> 흡연금지 </div>
	<img src="Spot/upload/party.png" alt="X" width="25" height="25" class="abc2"><div class="mei2"> 파티나 이벤트 금지 </div>
	<img src="Spot/upload/animal.png" alt="X" width="25" height="25" class="abc3"><div class="mei3"> 반려동물 동반 가능 </div>  
	<hr><br/>
		
	<!-- 내일 선생님께 랜덤으로 하는 방법 여쭤보기..!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->
	<span class="title">추천 휴양지 더 보기</span><br>
	 <c:set var="i" value="0"></c:set>
	<div class="swiper-container">
		<div class="swiper-wrapper">
			<c:forEach var="test" items="${vlist}" varStatus="status">
			<c:if test="${i < 7}">
				<c:forTokens items="${test.vspotStore}" delims="-" var="store" end="0">
					<div class="swiper-slide">
						 <a href="vspotListDetail?num=${test.vspotNum}" style=" text-decoration:none; ">	
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
	
</body>
</html>