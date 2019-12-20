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



<br />
${carDTO.driveNum}<br />
${carDTO.driveName}<br />
${carDTO.driveAge}<br />
${carDTO.driveLicenseInfo}<br />
${carDTO.carName}<br />
${carDTO.carNum}<br />
${carDTO.carImage}<br />
${carDTO.carImageStore}<br />
${carDTO.carImageSize}<br />
${carDTO.carSize}<br />
${carDTO.carKinds}<br />
${carDTO.carContent}<br />
${carDTO.carRegist}<br />
${carDTO.carApproval}<br />
<c:if test="${memLev == 4 }">
${carDTO.driveInfoNum}<br />
${carDTO.driveLicense}<br />
${carDTO.driveLicenseStore}<br />
${carDTO.driveLicenseSize}<br />
${carDTO.driveInsurance}<br />
${carDTO.driveInsuranceStore}<br />
${carDTO.driveInsuranceSize}<br />
${carDTO.driveCarcheck}<br />
${carDTO.driveCarcheckStore}<br />
${carDTO.driveCarcheckSize}<br />
<a href="carApprovalCheck?driveNum=${carDTO.driveNum}&memNum=${carDTO.memNum}&carApproval=1">승인확인</a>
<a href="carApprovalCheck?driveNum=${carDTO.driveNum}&memNum=${carDTO.memNum}&carApproval=2&carImage=${carDTO.carImageStore}
&driveLicense=${carDTO.driveLicenseStore}&driveInsurance=${carDTO.driveInsuranceStore}&driveCarcheck=${carDTO.driveCarcheckStore}">
승인거절</a>
</c:if>
<a href="carEnrollmentList">목록</a>
<c:if test="${memLev == 1 }">
<a href="carEnrollmentModify?driveNum=${carDTO.driveNum}">수정</a>
</c:if>
</body>
</html>