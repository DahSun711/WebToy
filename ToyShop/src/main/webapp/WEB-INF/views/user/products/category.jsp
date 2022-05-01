<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Sản phẩm</title>
</head>
<body>




	<div class="hero-wrap hero-bread">
		<div class="container">
			<div
				class="row no-gutters slider-text align-items-center justify-content-center">
				<div class="col-md-9 ftco-animate text-center">
					<p class="breadcrumbs" >
						<span class="mr-2"><a href="index.html">Home</a></span> <span>Products</span>
					</p>
					<h1 class="mb-0 bread">Products</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section">
		<div class="container">

			<div class="row">
				<ul class="thumbnails" style="display: flex; flex-wrap: wrap;">
					<c:if test="${ productsPaginate.size() > 0 }">


						<c:forEach var="item" items="${ productsPaginate }"
							varStatus="loop">
							<div class="product"
								style="margin: 10px; width: 250px; height: 300px; margin-bottom: 20px">
								<a href='<c:url value="/chi-tiet-san-pham/${ item.masp }"/>'><img class="img-fluid"
									src="<c:url value="/assets/images/${ item.anhbia }"/>" alt="Colorlib Template">
									<div class="overlay"></div> </a>
								<div class="text py-3 pb-4 px-3 text-center">
									<h3>
										<a href='<c:url value="/chi-tiet-san-pham/${ item.masp }"/>'>${ item.tensp }</a>

									</h3>
									<div class="d-flex">
										<div class="pricing">
											<p class="price">
											<p class="price">
												<span><fmt:formatNumber type="number"
														groupingUsed="true" value="${ item.gia }" /> đ<span>
											</p>
											</p>
										</div>
									</div>
									<div class="bottom-area d-flex px-3">
										<div class="m-auto d-flex">
											<a href="#"
												class="add-to-cart d-flex justify-content-center align-items-center text-center">
												<span><i class="ion-ios-menu"></i></span>
											</a> <a href="<c:url value="/AddCart/${ item.masp }"/>"
												class="buy-now d-flex justify-content-center align-items-center mx-1">
												<span><i class="ion-ios-cart"></i></span>
											</a> <a href="#"
												class="heart d-flex justify-content-center align-items-center ">
												<span><i class="ion-ios-heart"></i></span>
											</a>
										</div>
									</div>
								</div>
							</div>
							<c:if
								test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == productsPaginate.size() }">

								<c:if test="${ (loop.index + 1) < productsPaginate.size() }">

								</c:if>
							</c:if>
						</c:forEach>
					</c:if>
				</ul>
			</div>
			<div class="row mt-5">
				<div class="col text-center">
					<div class="block-27">
						<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }"
							varStatus="loop">
							<ul>
								<c:if test="${ (loop.index) == paginateInfo.currentPage }">
									<li><a
										href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>"
										class="active"><span>${ loop.index }</span></a></li>
								</c:if>
								<c:if test="${ (loop.index) != paginateInfo.currentPage }">
									<li><a
										href="<c:url value="/san-pham/${ idCategory }/${ loop.index }"/>">${ loop.index }</a></li>
								</c:if>
							</ul>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- loader -->
</body>