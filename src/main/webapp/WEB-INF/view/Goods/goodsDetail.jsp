<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goModify(){
		location.href="goodsModify?goodsNum=${goods.goodsNum }";
	}
	
	function goDelete(){
		var result = confirm("정말 삭제하시겠습니까?");
		if(result){
			location.href="goodsDelete?goodsNum=${goods.goodsNum }";
		}else{
		    alert("싫음 말구영");
		}
	}
</script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Goods</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-item.css" rel="stylesheet">
</head>
<body>


<body>
	<jsp:include page="goodsNav.jsp"></jsp:include>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">
        <h1 class="my-4">ATO</h1>
        <div class="list-group">
          <a href="#" class="list-group-item active">Category 1</a>
          <a href="#" class="list-group-item">Category 2</a>
          <a href="#" class="list-group-item">Category 3</a>
        </div>
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <div class="card mt-4">
          <img class="card-img-top img-fluid" src="http://placehold.it/900x400" alt="">
          <div class="card-body">
            <h3 class="card-title">${goods.goodsName }</h3>
            <h4><fmt:formatNumber value="${goods.goodsPrice }" pattern="###,###,###"/>원</h4>
            <p class="card-text">${goods.goodsContent }</p>
            <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
            4.0 점
          </div>
        </div>
        <!-- /.card -->
        
<!--         .cart -->
		<div style="margin-top: 5px;">
		<form method="post" action="cartInsert">
					<input type="hidden" name="goodsNum" value="${goods.goodsNum }" />
					<input type="hidden" name="aNum" value="${goods.auditNum }" />
					<input type="hidden" name="pNum" value="${goods.participationNum }" />
					<select name="qty">
						<c:forEach begin="1" end="10" var="i">
							<option value="${i}">${i}</option>						
						</c:forEach>
					</select>&nbsp;개
					<input type="submit" class="btn btn-success" value="장바구니 담기">
					<input type="button" class="btn btn-success" value="구매" onclick="#" />
					<c:if test="${fn:trim(goods.memId) == fn:trim(requestScope.memId)}">
					<input type="button" class="btn btn-success" value="삭제" onclick="goDelete();" style="float: right; margin-left: 4px;"/>
					<input type="button" class="btn btn-success" value="수정" onclick="goModify();" style="float: right; margin-left: 4px;"/>
					</c:if>
				</form>
		</div>
				
        <div class="card card-outline-secondary my-4">
		
		<c:if test="${memLev == 4 }">
          <div class="card-header">
         	   관리자 서비스
          </div>
          <div class="card-body">
			<input type="button" class="btn btn-success" value="수정" onclick="goModify();" />
			<input type="button" class="btn btn-success" value="삭제" onclick="goDelete();" />
            <hr>
          </div>
		</c:if>
        </div>
        <!-- /.card -->

      </div>
      <!-- /.col-lg-9 -->

    </div>

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
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
