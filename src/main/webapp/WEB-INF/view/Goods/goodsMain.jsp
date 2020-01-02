<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="Model.DTO.AuthInfo" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage</title>
  
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.css">        
  
  <!-- Custom styles for this template -->
  <link rel="stylesheet" type="text/css" href="css/shop-homepage.css">

</head>

<body>
<% 
	String memId = ((AuthInfo)session.getAttribute("authInfo")).getId();
	String memName = ((AuthInfo)session.getAttribute("authInfo")).getName();
%>
  <jsp:include page="goodsNav.jsp"></jsp:include>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">ATO</h1>
        <div class="list-group">
	        <div class="greeting">
	        	<p><b><%=memName %></b>님</p>
	        	<p>환영합니다!</p>
	        </div>
          <a href="#" class="list-group-item">Category 1</a>
          <a href="#" class="list-group-item">Category 2</a>
          <a href="#" class="list-group-item">Category 3</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

        <div class="row">
		<c:forEach var="goods" items="${goods }">
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
               <a href="goodsDetail?gNum=${goods.goodsNum}">
               	<c:forTokens items="${goods.goodsImage}" delims="-" var="aa">
               	 <img class="card-img-top" src="Goods/upload/${aa}" />
               	</c:forTokens>
               </a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="goodsDetail?gNum=${goods.goodsNum}">${goods.goodsName }</a>
                </h4>
                <h5><fmt:formatNumber value="${goods.goodsPrice }" pattern="###,###,###,###"/>원</h5>
                <p class="card-text">${goods.goodsContent }</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>
		</c:forEach>
        </div>
        <!-- /.row -->

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

