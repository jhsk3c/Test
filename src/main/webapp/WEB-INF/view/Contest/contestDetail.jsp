<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	공모전 이름 : ${contest.contestName}<br />
	주최자 : ${contest.contestOrganizer}<br />
	접수방법 : ${contest.contestEntryWay}<br />
	참가자격 : ${contest.contestCondition}<br />
	접수기간 : ${contest.contestStart } ~ ${contest.contestEnd }<br />
	시상종류 : ${contest.contestPrizeWay }<br />
	시상금 : ${contest.contestPrize }<br />
</body>
</html>