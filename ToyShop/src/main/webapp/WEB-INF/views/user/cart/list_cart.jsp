<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>List cart</title>
</head>
<body>

<div class="hero-wrap hero-bread">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span>Cart</span></p>
            <h1 class="mb-0 bread">My Cart</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section ftco-cart">
			<div class="container">
				<div class="row">
    			<div class="col-md-12 ftco-animate">
    				<div class="cart-list">
	    				<table class="table">
						    <thead class="thead-primary">
						      <tr class="text-center">
						        <th>Xóa</th>
						        <th>Cập nhập</th>
						        <th>Ảnh</th>
						        <th>Tên sản phẩm</th>
						        <th>Giá</th>
						        <th>Số lượng</th>
						        <th>Tổng giá sản phẩm</th>
						      </tr>
						    </thead>
						    <tbody>
						    
									<c:forEach var="item" items="${ Cart }">
									<tr class="text-center">
						        <td class="product-remove"><a href="<c:url value="/DeleteCart/${ item.key }"/>"><span class="iconify" data-icon="ep:delete-filled"></span></a></td>
						        
						        <td class="product-edit">
						        	<a data-id="${ item.key }" class="edit-cart edit-cart" type="button">
						        	<span class="iconify edit-cart" data-icon="ant-design:edit-filled"></span></a>
						        	
						        </td>
						        
						        <td class="image-prod"><div class="img" style="background-image: url('./assets/images/${ item.value.products.anhbia }');"></div></td>
						        
						        <td class="product-name">
						        	<h3>${ item.value.products.tensp }</h3>
						        </td>
						        
						        <td class="price"><span><fmt:formatNumber type="number" 
														groupingUsed="true" value="${ item.value.totalPrice }" /> đ<span></td>
						        
						        <td class="quantity">
						        	<div class="input-group mb-3">
					             	<input type="number" name="quantity" id="quanty-cart-${ item.key }" class="quantity form-control input-number" value="${ item.value.quanty }" min="1" max="100">
					          	</div>
					          </td>
						        
						        <td class="total"><span><fmt:formatNumber type="number"
														groupingUsed="true" value="${ item.value.totalPrice }" /> đ<span></td>
						      </tr>
									
									</c:forEach>
												    
						      
						    </tbody>
						  </table>
					  </div>
    			</div>
    		</div>
    		<div class="row justify-content-end">
    			
    			<div class="col-lg-4 mt-5 cart-wrap ftco-animate">
    				<p><a href='<c:url value= "/checkout" />' class="btn btn-primary py-3 px-4">Proceed to Checkout</a></p>
    			</div>
    		</div>
			</div>
		</section>
	<content tag="script">	
	<script>
			$(".edit-cart").on("click", funtion()
		 	{
				alert("edit");
				/* var id = $(this).data("id");
				var quanty = $("#quanty-cart-"+id).val();
				alert(quanty);
				window.location = "EditCart/"+id+"/"+quanty";  */
		 	});
	</script>
	</content>	
</body>