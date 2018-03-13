<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<link rel="stylesheet" href="css/mycss.css" type="text/css" />
<style type="text/css">
a {
	border: 1px solid white;
	background-color: #ddd;
}
</style>
</head>
<body bgcolor="#ddd">
	<h2 align="center">欢迎${requestScope.username }！</h2>
	<div align="center">
		<a href="newBlog.action">发布博客</a> 、 <a href="index.action">返回主页</a>
	</div>
</body>
</html>