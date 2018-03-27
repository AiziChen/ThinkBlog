<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客正文</title>
<script type="text/javascript" src="js/prism.js"></script>
<link rel="stylesheet" href="css/mycss.css" type="text/css" />
<link rel="stylesheet" href="css/prism.css" type="text/css" />
<style type="text/css">
#content {
	margin-left: 5%;
	margin-right: 5%;
}
</style>
</head>

<body>
	<s:if test="#session.passwordHashCode != null">
		<s:a class="alink" style="float: right;" action="deleteBlog.action">
			<s:param name="id" value="#currentBlog.id" />删除博客</s:a>
		<s:a class="alink" style="float: right;" action="modifyBlog.action">
			<s:param name="id" value="#currentBlog.id"></s:param>
			修改博客
		</s:a>
	</s:if>

	<h3 align="center">
		<s:property value="#currentBlog.title" />
	</h3>

	<hr />

	<div id="content">
		<!-- 使用s:property标签中的escape="false"属性可以加载原html代码 -->
		<s:property value="#currentBlog.content" escape="false" />
	</div>

	<hr />

	<section style="float: right;"> <span style="font-size: 10pt">
		<article>Author：<s:property value="#currentBlog.author" /></article>
		<footer>Pub Date ：<s:property value="#currentBlog.date" /></footer>
	</span> </section>
</body>
</html>