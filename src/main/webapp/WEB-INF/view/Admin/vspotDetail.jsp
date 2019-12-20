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
</head>
<body>
	<table border="1" width="60%" align="center">
		
		<tr>
			<td> 회원 번호 </td>
			<td> ${list.memNum} </td>
		</tr>
		
		<tr>
			<td> 회원 아이디 </td>
			<td> ${list.memId} </td>
		</tr>
		
		<tr>
			<td> 신청 날짜 </td>
			<td> <fmt:formatDate value="${list.vspotDate}" pattern="yyyy-MM-dd"/> </td>
		</tr>
		
		<tr>
			<td> 신청 제목 </td>
			<td> ${list.vspotTitle} </td>
		</tr>
		
		<tr>
			<td> 휴양지 이름 </td>
			<td> ${list.vspotName} </td>
		</tr>
		
		<tr>
			<td> 휴양지 지역 </td>
			<td> ${list.vspotLoc} </td>
		</tr>
		
		<tr>
			<td> 휴양지 특장점 </td>
			<td> ${list.vspotFeature} </td>
		</tr>
		
		<tr>
			<td> 휴양지 위치 </td>
			<td> ${list.vspotLocation} </td>
		</tr>
		
		<tr>
			<td> 휴양지 소개 </td>
			<td> ${list.vspotIntroduce} </td>
		</tr>
		
		<tr>
			<td> 휴양지 사진 </td>
			<td> 
				<c:forEach var="store1" items="${store}" varStatus="status"  >
					<a href="fileUpload?filename=${original[status.index] }&filename1=${store1}"> ${original[status.index] } </a><br/> 
					
				
					<img width="300" height="200" src="Spot/upload/${store1}" alt="선생님 안되여!!!"><br/>
				</c:forEach>
			
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"> 
				<input type="button" value="승인" onClick="location.href='vspotListTrue?num=${list.vspotNum}&page=${page}';"/> 
				<input type="button" value="미승인" onClick="location.href='vspotListFalse?num=${list.vspotNum}&page=${page}';"/>  
				<input type="button" value="뒤로가기" onClick="location.href='memVspot?&page=${page}';"/>  
			</td>

		</tr>
		
	</table>
	
	
	<div id="map" style="width:500px;height:400px;"></div>
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
	
</body>
</html>