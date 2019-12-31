<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
} 
.navbar1 {
  overflow: hidden;
  background-color: #333;
}

.navbar1 a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown1 {
  float: left;
  overflow: hidden;
}

.dropdown1 .dropbtn1 {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar1 a:hover, .dropdown1:hover .dropbtn1 {
  background-color: red;
}

.dropdown-content1 {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content1 a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content1 a:hover {
  background-color: #ddd;
}

.dropdown1:hover .dropdown-content1 {
  display: block;
}
</style>
</head>
<body>
<!-- 지금 문제는 경로문제 결국에는 기업회원 관리에 들어가면.. 현재 admin/comMana잖아 여기서 또 누르면 또 admin/admin/comMana.. -->
<div class="navbar1">
  <a href="main">Home</a>
  <a href="contest">Contest</a>
  <a href="admin/comMana">기업 회원 관리</a>
  <a href="Car/carEnrollmentList">car관리</a>
  <a href="Car/carCalendaReservationList">예약 관리</a>
  <a href="comMana">기업 회원 관리</a>
  <a href="memVspot">휴양지 관리</a>
  <a href="shopMana">상점 관리</a>
  <a href="logout">로그아웃</a>

  
  <div class="dropdown1">
    <button class="dropbtn1">Dropdown 
      <i class="fa fa-caret-down1"></i>
    </button>
    <div class="dropdown-content1">
      <a href="adminspot">휴양지 등록</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div> 
</div>

</body>
</html>