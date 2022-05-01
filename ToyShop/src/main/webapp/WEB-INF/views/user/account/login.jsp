<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
</head>
<div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Đăng Nhập</h2>
              <h1>${ status }</h1>
			<div class="form-login">
              <form:form action="dang-nhap" method="POST" modelAttribute="users">  


				<div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cdg">Nhập tài khoản</label>
                  <form:input type="text" id="form3Example4cdg" class="form-control form-control-lg" path="TAIKHOAN"/>
                 
                </div>
                <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cdg">Nhập mật khẩu</label>
                  <form:input type="password" id="form3Example4cdg" class="form-control form-control-lg" path="MATKHAU" />
                 
                </div>
                

                <div class="d-flex justify-content-center">
                  <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Đăng nhập</button>
                </div>
                
  				<p class="text-center text-muted mt-5 mb-0">Bạn chưa có tài khoản? <a href='<c:url value= "/dang-ky" />' class="fw-bold text-body"><u>Đăng ký ngay</u></a></p>
                

              </form:form >
			</div>	
            </div>
          </div>
        </div>
</body>