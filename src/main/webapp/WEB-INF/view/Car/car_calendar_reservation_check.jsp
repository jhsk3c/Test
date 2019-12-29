<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#userBtn").click(function(){
		window.close();
	});
});

</script>
</head>
<body>
 	<div>
 		${userName}회원님 예약 완료 되었습니다.  
 		<input type ="button" id = "userBtn" value="닫기" >
 	</div>
</body>
</html>