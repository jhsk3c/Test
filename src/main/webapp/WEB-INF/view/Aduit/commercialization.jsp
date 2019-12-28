<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var result = confirm("평가결과 합격입니다. 상품화 요청을 진행할까요? ${audit.participationNum}");
	if (result) {
		alert("등록된 회원(${audit.memId})의 e-mail로 상품화 요청을 진행합니다.");
		location.href="emailTransmission?memId=${audit.memId}";
	} else {
		alert("ㅋ");
	}
</script>
</head>
<body>
</body>
</html>