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
<title>Insert title here</title>


<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>

	<style type="text/css">
	
		.swiper-container {
			width:88%;
			height:700px;
			position: relative;
		    left: -60px;
		    top: 50px;
		}
		.swiper-slide {
			text-align:center;
			display:flex; /* 내용을 중앙정렬 하기위해 flex 사용 */
			align-items:center; /* 위아래 기준 중앙정렬 */
			justify-content:center; /* 좌우 기준 중앙정렬 */
		}
		.swiper-slide img {
			box-shadow:0 0 5px #555;
			border-radius: 25px;
		}
		.but{
			position: relative;
		    left: 90%;
		    top: -600px;
			border: none;
			width: 40px;
			width: 40px;
			background-color: #ffffff;
		
		}
	
	</style>

<!-- 클래스명은 변경하면 안 됨 -->
	<div class="swiper-container">
		<div class="swiper-wrapper">
				<c:forEach var="store1" items="${store}" varStatus="status" >
						<div class="swiper-slide"><img src="Spot/upload/${store1}" alt="X" width="87%" height="87%"></div>
				</c:forEach>
		</div>
	
		<!-- 네비게이션 지정 -->
		<div class="swiper-button-next"></div><!-- 다음 버튼 (오른쪽에 있는 버튼) -->
		<div class="swiper-button-prev"></div><!-- 이전 버튼 -->
	</div>
	<script>
		new Swiper('.swiper-container', {
			
			loop : true, // 무한 반복
			
			navigation : {
				nextEl : '.swiper-button-next', // 다음 버튼 클래스명
				prevEl : '.swiper-button-prev', // 이번 버튼 클래스명
			},
		});
		
	
	</script>

	
	<button class="but" type="button" onclick="location.href='vspotListDetail?num=${list.vspotNum}'">
		<img src="Spot/upload/False.png"  width="100%" height="100%"/>
	</button>
	
	
</body>
</html>