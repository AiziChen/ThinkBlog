<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Think博客主页</title>
<link type="text/css" rel="stylesheet" href="css/mycss.css" />
<style type="text/css">
#blogList {
	background-color: #ddd;
	margin-left: 10%;
	margin-right: 10%;
	border-radius: 4px;
	list-style-type: none;
}

.li-style {
	padding-bottom: 2px;
	border-radius: 2px;
}
.li-style:hover {
	background-color: #eee;
}

</style>
</head>
<body>
	<!-- 登录或者发布新博客 -->
	<s:if test="#session.passwordHashCode != null">
		<a href="newBlog.action" class="alink" style="float: right;">新博客</a>
	</s:if>
	<s:else>
		<a href="loginForm.action" class="alink" style="float: right;">登录</a>
	</s:else>

	<h3 align="center">我的博客</h3>

	<!-- 加载博客列表 -->
	<ol id="blogList">
		<s:iterator value="allBlogs" id="blog" status="st">
			<s:a action="showcontent.action" style="text-decoration: none;">
				<!-- 使用s:param标签向此action传参 -->
				<s:param name="id" value="#st.index" />
				<li class="li-style"><s:property value="#blog.title" /></li>
			</s:a>
		</s:iterator>
	</ol>
	<br />
</body>
</html>