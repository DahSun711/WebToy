<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>TOY SHOP</title>

<body>

	<c:forEach var="item" items="${ slides }" varStatus="index">
		<c:if test="${ index.first }">
			<div class="item active">
		</c:if>
		<c:if test="${ not index.first }">
			<div class="item">
		</c:if>
	</c:forEach>
	<section id="home-section" class="hero">
		<div class="home-slider owl-carousel">
			<div class="slider-item"
				style="background-image: url('./assets/images/images (2).jpg');">
				<div class="overlay"></div>
				<div class="container">
					<div
						class="row slider-text justify-content-center align-items-center"
						data-scrollax-parent="true">

						<div class="col-md-12 ftco-animate text-center"></div>
						<h1 class="mb-2">TOY SHOP</h1>
					</div>
				</div>
			</div>

			<div class="slider-item"
				style="background-image: url('./assets/images/download.jpg');">
				<div class="overlay"></div>
				<div class="container">
					<div
						class="row slider-text justify-content-center align-items-center"
						data-scrollax-parent="true">

						<div class="col-sm-12 ftco-animate text-center"></div>
						<h1 class="mb-2">TOY SHOP</h1>
					</div>
				</div>
		</div>


	</section>

	<section class="ftco-section">
		<div class="container">
			<div class="row no-gutters ftco-services">
				<div
					class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services mb-md-0 mb-4">
						<div
							class="icon bg-color-1 active d-flex justify-content-center align-items-center mb-2">
							<span class="flaticon-shipped"></span>
						</div>
						<div class="media-body">
							<h3 class="heading">Free Shipping</h3>
							<span>On order over $100</span>
						</div>
					</div>
				</div>
				<div
					class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services mb-md-0 mb-4">
						<div
							class="icon bg-color-2 d-flex justify-content-center align-items-center mb-2">
							<span class="flaticon-diet"></span>
						</div>
						<div class="media-body">
							<h3 class="heading">Always Fresh</h3>
							<span>Product well package</span>
						</div>
					</div>
				</div>
				<div
					class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services mb-md-0 mb-4">
						<div
							class="icon bg-color-3 d-flex justify-content-center align-items-center mb-2">
							<span class="flaticon-award"></span>
						</div>
						<div class="media-body">
							<h3 class="heading">Superior Quality</h3>
							<span>Quality Products</span>
						</div>
					</div>
				</div>
				<div
					class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services mb-md-0 mb-4">
						<div
							class="icon bg-color-4 d-flex justify-content-center align-items-center mb-2">
							<span class="flaticon-customer-service"></span>
						</div>
						<div class="media-body">
							<h3 class="heading">Support</h3>
							<span>24/7 Support</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	

	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center mb-3 pb-3">
				<div class="col-md-12 heading-section text-center ftco-animate">
					<span class="subheading">Featured Products</span>
					<h2 class="mb-4">Our Products</h2>
					<p></p>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<ul class="thumbnails" style="display: flex; flex-wrap: wrap;">
					<c:if test="${ sanpham.size() > 0 }">


						<c:forEach var="item" items="${ sanpham }" varStatus="loop">
							<div class="product"
								style="margin: 10px; width: 250px; height: 300px; margin-bottom: 20px">
								<a href='<c:url value="/chi-tiet-san-pham/${ item.masp }"/>'><img class="img-fluid"
									src="assets/images/${ item.anhbia }" alt="Colorlib Template">
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
								test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == sanpham.size() }">

								<c:if test="${ (loop.index + 1) < sanpham.size() }">

								</c:if>
							</c:if>
						</c:forEach>
					</c:if>
				</ul>
			</div>
		</div>


	</section>

	

	




</body>

