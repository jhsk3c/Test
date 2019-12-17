<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function oneCheckbox(a){
        var obj = document.getElementsByName("contestPrizeWay");
        for(var i=0; i<obj.length; i++){
            if(obj[i] != a){
            	obj[i].checked = false;
            }
        }
    }
</script>
</head>
<body>
<form:form action="contestModifyPro" method="post" enctype="multipart/form-data" name="frm" commandName="contestCommand">
<input type="hidden" name="contestNum" id="contestNum" value="${contest.contestNum }">
	<div id="aDiv" align="center">
		<table border="1" id="insertTable">
			<tr>
				<th>담당자</th>
				<td>${contest.contestOrganizer }</td>
			</tr>
			<tr>
				<th>공모전이름</th>
				<td>${contest.contestName }</td>
			</tr>
			<tr>
				<th>공모전주제</th>
				<td><form:input path="contestSubject" /></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td>${contest.contestPoster }</td>
			</tr>
			<tr>
				<th>공모전내용</th>
				<td><form:textarea path="contestContent" cols="50" rows="20" /></td>
			</tr>
			<tr>
				<th>참가조건</th>
				<td>
					<form:checkbox path="contestCondition" value="대학생" />대학생
					<form:checkbox path="contestCondition" value="대학원생" />대학원생
					<form:checkbox path="contestCondition" value="일반인" />일반인
					<form:checkbox path="contestCondition" value="어린이" />어린이
					<form:checkbox path="contestCondition" value="초등학생" />초등학생
					<form:checkbox path="contestCondition" value="증힉생" />중학생
					<form:checkbox path="contestCondition" value="고등학생" />고등학생
					<form:checkbox path="contestCondition" value="기업" />기업
					<form:checkbox path="contestCondition" value="제한없음" />제한없음
					<form:checkbox path="contestCondition" value="기타" />기타
				</td>
			</tr>
			<tr>
				<th>응모방법</th>
				<td>
					<form:checkbox path="contestEntryWay" value="이메일" />이메일
					<form:checkbox path="contestEntryWay" value="홈페이지" />홈페이지
					<form:checkbox path="contestEntryWay" value="우편" />우편
					<form:checkbox path="contestEntryWay" value="방문접수" />방문접수
					<form:checkbox path="contestEntryWay" value="웹하드" />웹하드
					<form:checkbox path="contestEntryWay" value="기타" />기타
				</td>
			</tr>
			<tr>
				<th>모집인원</th>
				<td><form:input path="contestPeoples" value="0" /></td>
			</tr>
			<tr>
				<th>접수기간</th>
				<td>
					<fmt:formatDate value="${contest.contestStart }" pattern="yyyy-MM-dd"/> ~ 
					<input type="date" name="contestEnd" />					
				</td>
			</tr>
			<tr>
				<th>시상방법</th>
				<td>
					<form:checkbox path="contestPrizeWay" name="contestPrizeWay" value="상금" onclick="oneCheckbox(this)" checked="checked" />상금
					<form:checkbox path="contestPrizeWay" name="contestPrizeWay" value="상품권" onclick="oneCheckbox(this)" />상품권
					<form:checkbox path="contestPrizeWay" name="contestPrizeWay" value="쿠폰" onclick="oneCheckbox(this)" />쿠폰
			</tr>
			<tr id="contestPrize1">
				<th>시상금</th>
				<td><form:input path="contestPrize"/></td>
			</tr>
			<tr align="center">
				<td colspan=2>
					<input type="submit" value="수정하기" />
					<input type="button" value="취소" />
				</td>
			</tr>
	</table>
	</div>
</form:form>
</body>
</html>