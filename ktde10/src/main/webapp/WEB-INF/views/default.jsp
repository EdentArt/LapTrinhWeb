<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Website</title>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="/">Trang Chủ</a></li>
                <li><a href="/products">Sản phẩm</a></li>
                <li><a href="/login">Đăng nhập</a></li>
                <li><a href="/admin">Trang quản trị</a></li>
            </ul>
        </nav>
    </header>
    <div id="content">
        <sitemesh:write property="body"/>
    </div>
    <footer>
        <p>Họ tên: Mai Thị Huỳnh Như - MSSV: 22162032 - Mã đề: 10</p>
    </footer>
</body>
</html>
