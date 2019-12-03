<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#topMenu {
	width: 100%;
	height: 200px;
	border: 4px solid #222;
}

nav>ul>li {
	float: left;
	display: block;
}

.mainmenu > li > a {
display:block;
height:50px;
font-size:12px;
font-style:normal;
margin:0px;
text-align:left;
}

.mainmenu {
	align-content : center;
	margin : 10;
	width: 100px;
	height: 50px;

}

</style>
</head>
<body>
	<div id="topMenu">
		<nav>
			<ul>
				<li>여행
					<ul class="mainmenu">
						<li><a href="Recreation/recreation">휴양지 정보</a></li>
						<li><a href="" >휴양지 등록</a></li>
					</ul></li>
				<li>carcar
					<ul class="mainmenu">
						<li><a href="#">차 등록</a></li>
						<li><a href="Car/carList">차 목록</a></li>
					</ul></li>
				<li>활동
					<ul class="mainmenu">
						<li><a href="#">활동 등록</a></li>
						<li><a href="#">활동 목록</a></li>
					</ul></li>
				<li>아토shop
					<ul class="mainmenu">
						<li><a href="">상품 등록</a></li>
						<li><a href="Shop/shopList">상품 목록</a></li>
					</ul></li>
					<li>숙소
					<ul class="mainmenu">
						<li><a href="">숙소 등록</a></li>
						<li><a href="rommsList">숙소 목록</a></li>
					</ul></li>
				<li>고객센터
					<ul class="mainmenu">
						<li><a href="">1:1 상담</a></li>
						<li><a href="">신고 센터</a></li>
					</ul></li>	
			</ul>
		</nav>
	</div>
</body>
</html>