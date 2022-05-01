<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
table, th, td {
	border: 1px solid black;
}

td {
	padding-right: 30px;
}
</style>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>View</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>

	<c:forEach var="item" items="${User}">
		<tr style="border: 1px black solid">
			<td>${item.HOTEN}</td>
			<td>${item.NGAYSINH}</td>
			<td>${item.DIACHI}</td>
			<td><a href="${urlView}/${customer.id}">View</a></td>
			<td><a href="${urlUpdate}/${customer.id}">Edit</a></td>
			<td><a href="${urlDelete}/${customer.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>