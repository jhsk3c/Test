<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".star_rating a").click(function() {

			$(this).parent().children("a").removeClass("on");

			$(this).addClass("on").prevAll("a").addClass("on");

			return false;

		});
	})
	
	$(function(){
		$("#a1").click(function(){
			$("#auditOriginality").val('1');
		});
		$("#a2").click(function(){
			$("#auditOriginality").val('2');
		});
		$("#a3").click(function(){
			$("#auditOriginality").val('3');
		});
		$("#a4").click(function(){
			$("#auditOriginality").val('4');
		});
		$("#a5").click(function(){
			$("#auditOriginality").val('5');
		});
	});
	$(function(){
		$("#b1").click(function(){
			$("#auditPracticality").val('1');
		});
		$("#b2").click(function(){
			$("#auditPracticality").val('2');
		});
		$("#b3").click(function(){
			$("#auditPracticality").val('3');
		});
		$("#b4").click(function(){
			$("#auditPracticality").val('4');
		});
		$("#b5").click(function(){
			$("#auditPracticality").val('5');
		});
	});
</script>
<style>
.star_rating {
	font-size: 0;
	letter-spacing: -4px;
}

.star_rating a {
	font-size: 22px;
	letter-spacing: 0;
	display: inline-block;
	margin-left: 5px;
	color: #ccc;
	text-decoration: none;
}

.star_rating a:first-child {
	margin-left: 0;
}

.star_rating a.on {
	color: #777;
}

.introTable {
	width: 60%;
	border: 1px solid #ddd;
	border-top: 2px solid #555;
	margin-top: 5px;
}

table {
	border-collapse: collapse;
	border-spacing: 0;
}

body {
	text-size-adjust: none;
	-webkit-text-size-adjust: none;
	-webkit-font-smoothing: antialiased;
}

body {
	font-family: 'NanumGothic';
	font-size: 13px;
}

thead {
	display: table-header-group;
	vertical-align: middle;
	border-color: inherit;
}

tr {
	display: table-row;
	vertical-align: inherit;
	border-color: inherit;
}

th {
	height: 30px;
	font-weight: bold;
	text-align: center;
	border: 1px solid #ddd;
	background: #eee;
}

tbody {
	display: table-row-group;
	vertical-align: middle;
	border-color: inherit;
}

td {
	height: 24px;
	text-align: center;
	color: #666;
	border: 1px solid #ddd;
	padding: 5px 10px;
}
</style>
</head>
<body>
<form action="aduitPro" method="post">
	<input type="hidden" name="pNum" value="${pNum } "/>
	<input type="hidden" name="memId" value="${memId } "/>
	<input type="hidden" id="auditOriginality" name="auditOriginality" />
	<input type="hidden" id="auditPracticality" name="auditPracticality"/>
	<table class="introTable"> 
		<thead>
			<tr>
				<th>구분</th>
				<th>심사기준</th>
				<th>내용</th>
				<th>점수</th>
			</tr>
		</thead>
		<tr>
			<td rowspan="2">심사</td>
			<td>독창성</td>
			<td>새로운 개념 제시, 기존 기술의 개량 수준</td>
			<td>
				<p class="star_rating" id="auditOriginality">
					<a href="#" id="a1">★</a> 
					<a href="#" id="a2">★</a> 
					<a href="#" id="a3">★</a> 
					<a href="#" id="a4">★</a> 
					<a href="#" id="a5">★</a>
				</p>
			</td>
		</tr>
		<tr>
			<td>실용성</td>
			<td>기술적, 경제적 사업화 가능성</td>
			<td>
				<p class="star_rating" id="auditPracticality">
					<a href="#" id="b1">★</a> 
					<a href="#" id="b2">★</a> 
					<a href="#" id="b3">★</a> 
					<a href="#" id="b4">★</a> 
					<a href="#" id="b5">★</a>
				</p>
			</td>
		</tr>
		<tfoot>
			<tr>
				<td colspan="4">
					<input type="submit" value="확인"/>
					<input type="button" value="취소" onclick="history.go(-1)"/>
				</td>
			</tr>
		
		</tfoot>
	</table>
</form>
</body>
</html>