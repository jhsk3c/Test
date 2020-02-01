<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 헤윰_대여상점_등록</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!--   <link rel="stylesheet" href="/resources/demos/style.css"> -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


<!--  제출 스크립트 -->
<script>
	$(function(){
		$("#frm").submit(function(){
			if($("#storeName").val()== ""){
				$("#storeName").focus();
				alert("상점 이름을 입력해주세요.");
			return false;
			}
			if($("#storeOwner").val()== ""){
				$("#storeOwner").focus();
				alert("대표자명을 입력해주세요.");
			return false;
			}
			if($("#storeBusinessNum").val()== ""){
				$("#storeBusinessNum").focus();
				alert("사업자 번호를 입력해주세요.");
			return false;
			}
			if($("#businessLicense").val()== ""){
				$("#businessLicense").focus();
				alert("사업자 등록증을 등록해주세요.");
			return false;
			}
			if($("#storePics").val()== ""){
				$("#storePics").focus();
				alert("상점 사진을 등록해주세요.");
			return false;
			}
			if($("#StoreMainProduct").val()== ""){
				$("#StoreMainProduct").focus();
				alert("주 대여 물품을 입력해주세요.");
			return false;
			}
			if($("#storeLoc1").val()== ""){
				$("#storeLoc1").focus();
				alert("상점이 위치한 지역을 입력해주세요.");
			return false;
			}
			if($("#storeLoc2").val()== ""){
				$("#storeLoc2").focus();
				alert("상점 상세 주소를 입력해주세요.");
			return false;
			}
			if($("#storeTel").val()== ""){
				$("#storeTel").focus();
				alert("상점 전화번호를 입력해주세요.");
			return false;
			}
			/* if($("#storeTel").length != '11'){
				$("#storeTel").focus();
				alert("전화번호를 제대로 입력해주세요.");
			return false; */
			}else{
				alert("등록되었습니다.");
			return true;
			}
		});
	});
</script>




</head>
<body>




<!-- 상단  -->
<jsp:include page="../Main/admintop.jsp" />


<!--  중단  -->
<div style="padding-top:100px">
	<div class="jumbotron text-center" style="border-radius:35px; background:white;border:1px solid lightgrey; margin:40px auto;width:70%;padding-top:50px; padding-right: 30px; padding-bottom: 50px; padding-left: 80px;">	<!-- 가운데 정렬  -->
		<div style="padding-top:10px;padding-bottom:20px;padding-right:30px"> <h2> 물품 대여 상점 등록</h2> </div>
		
		<form:form class="form-inline" action="ActivityStoreInsertPro" commandName="activityStoreCommand"  method="post" id="frm" enctype="multipart/form-data">
			<table class="table" style="width:90%;margin-right:15px;margin-left:25px;margin-top:20px">
				<tr>
					<td> 상점 이름 </td>
					<td> <input class="form-control" type="text" name="storeName" id="storeName" /> </td>
				</tr>
				<tr>
					<td> 대표자명 </td>
					<td> <input class="form-control" type="text" name="storeOwner" id="storeOwner" /> </td>
				</tr>
				<tr>
					<td> 사업자 등록번호 </td>
					<td> <input class="form-control" type="text" name="storeBusinessNum" id="storeBusinessNum" />
				</tr>
				<tr>
					<td> 사업자등록증 </td>
					<td> <input type="file" name="businessLicense" id="businessLicense" style="padding-left:150px" />
				</tr>
				<tr>
					<td> 상점 사진 </td>
					<td> <input type="file" name="storePics" id="storePics" style="padding-left:150px" /> </td>
				</tr>
				<tr> 
					<td> 주 대여 물품 </td>
					<td>
						<form:select path="StoreMainProduct" class="form-control" id="StoreMainProduct">
			            	<option value="">-----선택해주세요-------</option>
			                   <form:options items="${StoreMainProduct}" />
			            </form:select>
					</td>
				</tr>
				<tr>
			        <td width = "200"> 상점 지역 </td>
			        <td width = "400"> 
			        	<form:select path="storeLoc1" class="form-control" id="storeLoc1">
			            	<option value="">-----선택해주세요-------</option>
			                   <form:options items="${storeLoc1}" />
			            </form:select>
			       </td>
				</tr>
				<tr> 
					<td> 상세 주소</td>
					<td> <input class="form-control" type="text" name="storeLoc2" id="storeLoc2" /> </td>
				</tr>
				<tr>
					<td> 상점 전화 번호 </td>
					<td> <input class="form-control" type="tel" name="storeTel" id="storeTel"/> </td>
				</tr>
				<tr>
					<td colspan="2"> 
						<div style="padding-top:15px">
							<input class="btn btn-success" type="submit" value="등록" />
						</div> 
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

<!-- 하단   -->



</body>
</html>