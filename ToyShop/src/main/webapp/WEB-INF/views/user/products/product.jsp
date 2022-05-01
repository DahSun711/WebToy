<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
</head>
<body>

<h1></h1>
<div class="hero-wrap hero-bread">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span class="mr-2"><a href="index.html">Product</a></span> <span>Product Single</span></p>
            <h1 class="mb-0 bread">Product Single</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section">
    <form action="form" method="get" action="<c:url value="/AddCart/${ product.masp }"/>">
    	<div class="container">
    		<div class="row">
    			<div class="col-lg-6 mb-5 ftco-animate">
    				<a href="<c:url value="/assets/images/${ product.anhbia }"/>" class="image-popup"><img src="<c:url value="/assets/images/${ product.anhbia }"/>" class="img-fluid" alt="Colorlib Template"></a>
    			</div>
    			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
    				<h3>${ product.tensp }</h3>
    				
    				<p class="price"><span>price: <fmt:formatNumber type="number"
														groupingUsed="true" value="${ product.gia }" /> đ<span></p>
    				<p>${ product.mota }</p>
						<div class="row mt-4">
							<div class="col-md-6">
								<div class="form-group d-flex">
		              <div class="select-wrap">
	                  <div class="icon"><span class="ion-ios-arrow-down"></span></div>
	                  <select name="" id="" class="form-control">
	                  	<option value="">Small</option>
	                    <option value="">Medium</option>
	                    <option value="">Large</option>
	                    <option value="">Extra Large</option>
	                  </select>
	                </div>
		            </div>
							</div>
							<div class="w-100"></div>
							<div class="input-group col-md-6 d-flex mb-3">
	             	<span class="input-group-btn mr-2">
	                	<button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="">
	                   <i class="ion-ios-remove"></i>
	                	</button>
	            		</span>
	             	<input type="text" id="quantity" name="quantity" class="form-control input-number" value="1" min="1" max="100">
	             	<span class="input-group-btn ml-2">
	                	<button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
	                     <i class="ion-ios-add"></i>
	                 </button>
	             	</span>
	          	</div>
	          	<div class="w-100"></div>
	          	<div class="col-md-12">
	          		<p style="color: #000;">600 kg available</p>
	          	</div>
          	</div>
          	<p><a href="<c:url value="/AddCart/${ product.masp }"/>" class="btn btn-black py-3 px-5">Add to Cart</a></p>
    			</div>
    		</div>
    	</div>
    	</form>
    </section>

    <section class="ftco-section">
    	<div class="container">
				<div class="row justify-content-center mb-3 pb-3">
          <div class="col-md-12 heading-section text-center ftco-animate">
          	<span class="subheading">Products</span>
            <h2 class="mb-4">Related Products</h2>
          </div>
        </div>   		
    	</div>
    	<div class="container">
    		<div class="row">
				<ul class="thumbnails" style="display: flex; flex-wrap: wrap;">
				
				<c:set var="counList" value="${ productByIDCategory.size() }" />
					<c:if test="${ productByIDCategory.size() > 3 }">
						<c:set var="counList" value ="3" />
					</c:if>	

					<c:forEach var="item" items="${ productByIDCategory }" begin="0" end="${ counList }" varStatus="loop">
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
												class="buy-now d-flex justify-content-center align-items-center mx-1">
												<span><i class="ion-ios-cart"></i></span>
											</a>
										</div>
									</div>
								</div>
							</div>
							<c:if
								test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == productByIDCategory.size() }">

								<c:if test="${ (loop.index + 1) < productByIDCategory.size() }">

								</c:if>
							</c:if>
						</c:forEach>
				</ul>
			</div>
    	</div>
    </section>

</body>
</html>