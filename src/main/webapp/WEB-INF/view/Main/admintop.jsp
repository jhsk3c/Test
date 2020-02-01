	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


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
	  z-index: 5;
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
	.topFixed {
	  position: fixed;
	  top: 0px;
	    }
</style>

<script src="//code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
      $( document ).ready( function() {
    	  
        var topOffset = $( '.top' ).offset();
        $( window ).scroll( function() {
        	
          if ( $( document ).scrollTop() > topOffset.top ) {
            $( '.top' ).addClass( 'topFixed' );
          }
          else {
            $( '.top' ).removeClass( 'topFixed' );
          }
        });
      } );
</script>
<script>
	$("body").animate({
		scrollTop: 300
		}, 500);
</script>
		





</head>
<body>

<div class="top" style="background-color:white;width:100%;height:120px;z-index:5">
	<div style="padding-top:20px;padding-left:20px">
		<a href="main" style="padding-left:10px"> <img alt="Logo" src="img/B_300x300_1.png" width=70px height=70px/> </a>
	</div>
	
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>                        
	      </button>
	     
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	        <li class="dropdown">
	          <a class="dropdown-toggle" data-toggle="dropdown" href="#"> 휴양지 <span class="caret"></span></a>
		          <ul class="dropdown-menu">
		            <li><a href="memVspot"> 휴양지 관리 </a></li>
		            <li><a href="adminspot"> 휴양지 등록</a></li>
		            <li><a href="shopMana"> 상점 관리 </a></li>
		          </ul>
	        </li>
	        <li class="dropdown">
	        	<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 활동 <span class="caret"></span></a>
		        	<ul class="dropdown-menu">
			            <li><a href="activity"> 활동 신청</a></li>
			            <li><a href="ActivityStoreList"> 물품대여 상점</a></li>
			          </ul>
	        </li>
	        <li class="dropdown">
	        	<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 숙소 <span class="caret"></span></a>
	        </li>
	      </ul>
	      <ul class="nav navbar-nav navbar-right">
	      
	        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> 로그아웃</a></li>
	        	<li> <div style="padding-left:20px"> <img alt="admin" src="img/admin.png" width=50 height=50> </div> </li>
	      </ul>
	      </div>
	  </div>
	</nav>
</div>


<!-- 

<div class="navbar1">
  <a href="admin/comMana">기업 회원 관리</a>
  <a href="comMana">기업 회원 관리</a>
  <a href="memVspot">휴양지 관리</a>
  <a href="shopMana">상점 관리</a>

  <div class="dropdown">
    <button class="dropbtn1">활동
      <i class="fa fa-caret-down1"></i>
    </button>
    <div class="dropdown-content1">
      <a href="adminspot">휴양지 등록</a>
      <a href="activity">활동관리</a>
      <a href="ActivityStoreList">상점</a>
      <a href="Car/carCalendarList">car 관리</a>
    </div>
  </div> 
</div> -->

</body>
</html>