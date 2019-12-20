<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.DTO.AuthInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	<% 
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getId();
	%>

	alert('이미 참가하셨습니다. 참가내역페이지로 이동합니다.');
	location.href="participationList?memId=<%= memId %>"; // 참가내역페이지로 이동시켜줘야댐
</script>
</body>
</html>