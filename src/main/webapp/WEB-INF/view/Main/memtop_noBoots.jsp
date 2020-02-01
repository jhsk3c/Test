<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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

.topFixed {
        position: fixed;
        top: 0px;
      }
</style>



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
		
		<div style="float:right;padding-top:30px;padding-right:30px">
			<a href="profile" style="text-decoration:none;color:lightgrey"> <strong> 프로필 </strong> </a> &nbsp;&nbsp;&nbsp;
			<a href="logout" style="text-decoration:none;color:lightgrey"> <strong> 로그아웃 </strong> </a>&nbsp;&nbsp;&nbsp;
			<a href="ActivityInsert" style="text-decoration:none;color:lightgrey"> <strong> 활동 생성 </strong> </a>&nbsp;&nbsp;&nbsp;
			<a href="#" style="text-decoration:none;color:lightgrey"> <strong> 문의 </strong> </a>
		</div>
	</div>
</div>


</body>
</html>