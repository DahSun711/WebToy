<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header>
	<nav
		class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
		id="ftco-navbar">
		<div class="container">
			<a class="navbar-brand" href='<c:url value="/trang-chu"/>'>TOYSHOP</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#ftco-nav" aria-controls="ftco-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="oi oi-menu"></span> Menu
			</button>

			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a
						href='<c:url value="/trang-chu"/>' class="nav-link">Admin</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="dropdown04"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Sản
							Phẩm</a>
						<div class="dropdown-menu" aria-labelledby="dropdown04">

							<c:forEach var="item" items="${ loaisanpham }">
								<a class="dropdown-item"
									href='<c:url value= "/san-pham/${ item.maloaisp }"/>'>${ item.tenloaisp }</a>
							</c:forEach>

						</div></li>

					<c:if test="${ not empty LoginInfo }">
						<li class="nav-item"><a href='<c:url value= "/dang-xuat" />'
							class="nav-link">Đăng xuất</a></li>
						<li class="nav-item"><a href="#" class="nav-link">Chào,
								${ LoginInfo.HOTEN }</a></li>
					</c:if>

					<c:if test="${ empty LoginInfo }">
						<li class="nav-item"><a href='<c:url value= "/dang-nhap" />'
							class="nav-link">Đăng Nhập</a></li>

					</c:if>

					<li class="nav-item cta cta-colored"><a
						href="<c:url value="/ListCart"/>" class="nav-link"><span
							class="icon-shopping_cart"></span>[${ TotalQuantyCart }]</a></li>
				</ul>
			</div>
		</div>
	</nav>
</header>