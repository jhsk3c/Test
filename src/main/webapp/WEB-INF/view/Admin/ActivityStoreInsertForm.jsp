<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<!-- 상단  -->
<jsp:include page="../Main/admintop.jsp" />


<!--  중단  -->
<h2> 활동 상점 등록</h2>
<form:form action="ActivityStoreInsertPro" commandName="activityStoreCommand" method="post">
<table>

	<tr>
		<td> 상점 이름 </td>
		<td> <input type="text" name="storeName" id="storeName" /> </td>
	</tr>
	<tr>
		<td> 사업자명 </td>
		<td> <input type="text" name="storeOwner" id="storeOwner" /> </td>
	</tr>
	<tr>
		<td> 사업자 등록번호 </td>
		<td> <input type="text" name="storeBusinessNum" id="storeBusinessNum" />
	</tr>
	<tr> 
		<td> 주 대여 물품 </td>
		<td>
			<form:select path="StoreMainProduct" id="StoreMainProduct">
            	<option value="">-----선택해주세요-------</option>
                   <form:options items="${StoreMainProduct}" />
            </form:select>
		</td>
	</tr>
	<tr>
        <td width = "200"> 상점 지역 </td>
        <td width = "400"> 
        	<form:select path="storeLoc1" id="storeLoc1">
            	<option value="">-----선택해주세요-------</option>
                   <form:options items="${storeLoc1}" />
            </form:select>
       </td>
	</tr>
	<tr> 
		<td> 상세 주소</td>
		<td> <input type="text" name="storeLoc2" id="storeLoc2" /> </td>
	</tr>
	<tr>
		<td> 상점 전화 번호 </td>
		<td> <input type="tel" name="storeTel" id="storeTel"/> </td>
	</tr>
	<tr>
		<td colspan="2">  <input type="submit" value="등록" /> </td>
	</tr>
</table>

</form:form>



<!-- 하단   -->



</body>
</html>