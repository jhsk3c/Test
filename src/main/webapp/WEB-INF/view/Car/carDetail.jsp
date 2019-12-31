<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>${carDTO.driveNum}</td>
</tr>
<tr>
<td>${carDTO.driveName}</td>
</tr>
<tr>
<td>${carDTO.driveAge}</td>
</tr>
<tr>
<td>${carDTO.driveLicenseInfo}</td>
</tr>
<tr>
<td>${carDTO.carName}</td>
</tr>
<tr>
<td>${carDTO.carNum}</td>
</tr>
<tr>
<td>${carDTO.carImage}</td>
</tr>
<tr>
<td>${carDTO.carImageStore}</td>
</tr>
<tr><td>${carDTO.carImageSize}</td></tr>
<tr><td>${carDTO.carSize}</td></tr>
<tr><td>${carDTO.carKinds}</td></tr>
<tr><td>${carDTO.carContent}</td></tr>
<tr><td>${carDTO.carRegist}</td></tr>
<tr><td>${carDTO.carApproval}</td></tr>
<c:if test="${memLev == 4 }">
<tr><td>${carDTO.driveInfoNum}</td></tr>
<tr><td>${carDTO.driveLicense}</td></tr>
<tr><td>${carDTO.driveLicenseStore}</td></tr>
<tr><td>${carDTO.driveLicenseSize}</td></tr>
<tr><td>${carDTO.driveInsurance}</td></tr>
<tr><td>${carDTO.driveInsuranceStore}</td></tr>
<tr><td>${carDTO.driveInsuranceSize}</td></tr>
<tr><td>${carDTO.driveCarcheck}</td></tr>
<tr><td>${carDTO.driveCarcheckStore}</td></tr>
<tr><td>${carDTO.driveCarcheckSize}</td></tr>
<tr>
	<td colspan="2">
		<a href="carApprovalCheck?driveNum=${carDTO.driveNum}&memNum=${carDTO.memNum}&carApproval=1">승인확인</a>
		<a href="carApprovalCheck?driveNum=${carDTO.driveNum}&memNum=${carDTO.memNum}&carApproval=2">승인거절</a>
	</td>
	</tr>
</c:if>
<tr>
<td colspan="2"><a href="carEnrollmentList">목록</a>
<c:if test="${memLev == 1 }">
<a href="carEnrollmentModify?driveNum=${carDTO.driveNum}">수정</a>
</c:if>
</td>
</tr>
</table>
</body>
</html>