<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
</head>
<div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Đăng ký tài khoản</h2>
				<h1>${ status }</h1>
				<div class="form-register">
              <form:form action="dang-ky" method="POST" modelAttribute="users">  

                <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1cg">Nhập họ và tên</label>
                  <form:input type="text" id="form3Example1cg" class="form-control form-control-lg" path="HOTEN"/>
                 
                </div>

                <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example3cg">Nhập ngày sinh</label>
                  <form:input type="text" id="form3Example3cg" class="form-control form-control-lg" path="NGAYSINH"/>
                
                </div>

                <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cg">Nhập địa chỉ</label>
                  <form:input type="text" id="form3Example4cg" class="form-control form-control-lg" path="DIACHI" />
                 
                </div>

                <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cdg">Nhập số điện thoại</label>
                  <form:input type="text" id="form3Example4cdg" class="form-control form-control-lg" path="SDT" />
                 
                </div>

				<div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cdg">Nhập tài khoản</label>
                  <form:input type="text" id="form3Example4cdg" class="form-control form-control-lg" path="TAIKHOAN"/>
                 
                </div>
                <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example4cdg">Nhập mật khẩu</label>
                  <form:input type="password" id="form3Example4cdg" class="form-control form-control-lg" path="MATKHAU" />
                 
                </div>
                

                <div class="d-flex justify-content-center">
                  <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
                </div>

                <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="#!" class="fw-bold text-body"><u>Login here</u></a></p>

              </form:form >
              </div>

            </div>
          </div>
        </div>
</body>