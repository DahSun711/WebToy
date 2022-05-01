<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<c:url value="/quan-tri/product-save" var="urlSave"/>
<c:url value="/quan-tri/product-update" var="urlUpdate"/>
<c:url value="/quan-tri/product-delete" var="urlDelete"/>
  <a href="${urlSave}">Add Customer</a>
  <a href="<c:url value="/quan-tri/product-save"/>" > addd temp </a>
  <br />
  <br />
<table>
  <tr>
    <th>Tên sản phẩm</th>
    <th>Gía</th>
    <th>Mô tả</th>
     <th>ảnh bìa</th>
      <th>Loại sản phẩm</th>
      <th>Sưa</th>
      <th>Xoa</th>
  </tr>
  <c:forEach var="item" items="${ sanpham }">
  <tr>
    <td>${item.tensp }</td>
	<td>${item.gia }</td>
	<td>${item.mota }</td>
	<td>${item.anhbia }</td>
	<td>${item.maloaisp }</td>
	<td><a href="${urUpdate}">Update Product</a></td>
	<td><a href="${urlDelete}">Delete Product</a></td>
  </tr>
	</c:forEach>
</table>
</body>
</html>