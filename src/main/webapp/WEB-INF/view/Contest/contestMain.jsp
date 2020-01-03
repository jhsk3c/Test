<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Model.DTO.AuthInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#admin-menu{
		display: inline-block; 
		border-style: solid;
	}
	#contest-menu{
		border-style: solid;
		width: 80%;
	}
</style> 
<% 
	String memId = ((AuthInfo)session.getAttribute("authInfo")).getId();
	String memName = ((AuthInfo)session.getAttribute("authInfo")).getName();
%>
</head>
<body>
	<jsp:include page="../Goods/goodsNav.jsp"></jsp:include>
  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">Contest</h1>
        <div class="greeting">
        	<p><b><%=memName %></b>님</p>
        	<p>환영합니다!</p>
        </div>
        <div class="list-group">
          <a href="contestList" class="list-group-item">공모전리스트</a>
          <a href="participationList?memId=<%=memId%>" class="list-group-item">참가내역</a>
        </div>
		<c:if test="${memLev == 4}">
			<div class="list-group">
			  <p><h3>관리자 메뉴</h3></p>
	          <a href="contestCheck" class="list-group-item">등록한 공모전 조회</a>
	          <a href="contestInsertForm" class="list-group-item">공모전등록</a>
	        </div>
        </c:if>
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js">
</script>
</body>
</html>