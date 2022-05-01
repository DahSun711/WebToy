<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<title>Thanh Toán</title>
</head>
<div class="card" style="border-radius: 15px;">
	<div class="card-body p-5">
		<h2 class="text-uppercase text-center mb-5">Thanh Toán</h2>
		<h1>${ status }</h1>
		<div class="form-pay">
			<form:form action="checkout" method="POST" modelAttribute="bills">

				<div class="form-outline mb-4">
					<label class="form-label" for="form3Example1cg">Nhập họ và
						tên</label>
					<form:input type="text" id="form3Example1cg"
						class="form-control form-control-lg" path="HOTEN" />

				</div>

				<div class="form-outline mb-4">
					<label class="form-label" for="form3Example4cg">Nhập địa
						chỉ</label>
					<form:input type="text" id="form3Example4cg"
						class="form-control form-control-lg" path="DIACHI" />

				</div>

				<div class="form-outline mb-4">
					<label class="form-label" for="form3Example4cdg">Nhập số
						điện thoại</label>
					<form:input type="text" id="form3Example4cdg"
						class="form-control form-control-lg" path="SDT" />

				</div>
				<div
					class="row mt-5 pt-3 width: 45%;
    display: inline-block;
    float: righ">
					<div class="col-md-12 d-flex mb-5">
						<div class="cart-detail cart-total p-3 p-md-4">
							<h3 class="billing-heading mb-4">Cart Total</h3>
							<hr>
							<p class="d-flex total-price">
							<span>Total</span><span><fmt:formatNumber type="number" 
														groupingUsed="true" value="${ TotalPriceCart }" /> đ<span>
							</p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="cart-detail p-3 p-md-4">
							<h3 class="billing-heading mb-4">Chọn Phương Thức</h3>
							<p>
								<button type="submit" class="btn btn-primary py-3 px-4">Thanh Toánr</button>
							</p>
						</div>
					</div>
				</div>

			</form:form>
		</div>


	</div>
</div>
</div>
</body>