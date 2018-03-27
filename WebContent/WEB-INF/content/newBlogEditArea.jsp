<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新建博客</title>
<script language="javascript" type="text/javascript"
	src="./tinymce/tinymce.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/mycss.css" />

<script language="javascript" type="text/javascript">
	tinymce
			.init(
					{
						selector : "textarea",
						width : "800",
						height : "300",

						language : "zh_CN",

						plugins : [

								"advlist autolink link image lists charmap preview hr anchor pagebreak",

								"searchreplace visualblocks visualchars code fullscreen insertdatetime media nonbreaking",

								"save table contextmenu directionality emoticons paste textcolor codesample"

						],

						toolbar : "fullscreen",

						statusbar : false,

						toolbar : "formatselect | fontselect | fontsizeselect | forecolor backcolor | bold italic | alignleft aligncenter alignright | bullist numlist outdent indent | link image | hr emoticons | codesample",
					}).then(
					function(editors) {
						tinymce.activeEditor.shortcuts.add('meta+s',
								"get editor's html", function() {
									saveContent();
								});
						tinymce.activeEditor.shortcuts.add('meta+n',
								"new one note", function() {
									jsEvent.newNote();
								});
						//tinymce.activeEditor.execCommand('mceFullScreen');
						tinymce.activeEditor.dom.setStyle(
								tinymce.activeEditor.dom.select('body'),
								'background-color', '#fcfed0');
					});
</script>

<script>
	// 设置HTML内容
	var setHtml = function(content) {
		tinymce.activeEditor.setContent(decodeURIComponent(content.replace(
				/\+/g, '%20')));
	};

	// 取得HTML内容
	var getHtml = function() {
		var html = tinymce.activeEditor.getContent();
		return html;
	};

	var saveContent = function() {
		var con = confirm("确定要发布该博客吗？");
		if (con == true) {
			var html = getHtml();
			var form = document.getElementById('content');
			form.submit();
		}
		var html = getHtml();
		var form = document.getElementById('content');
		form.submit();
	}
</script>

</head>
<body>
	<s:a action="index.action" class="alink" style="float: right;">返回首页</s:a>
	<div align="center">
		<s:fielderror name="msg"></s:fielderror>
		<s:form id="content" action="commitBlog.action" method="post">
			<s:textarea id="editor" name="content"></s:textarea>
			<s:textfield name="author" label="作者" key="author" />
			<s:textfield name="title" label="标题" key="title" />
			<s:submit value="发布" />
		</s:form>
	</div>
	<p align="right" style="font-size: 12px;">提示：ctrl+shift+F快捷键可将编辑器切换到全屏编辑。</p>

</body>
</html>