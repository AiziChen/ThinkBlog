# ThinkBlog
一个使用Struts2、Hibernate、Spring技术，以及tinyMCE编辑器开发的开源个人博客，
使用HTML5作为保存内容，因此支持全部HTML5的标签，并且支持prism多种源代码高亮显示。

## 一、使用Eclipse for JavaEE进行开发：
本系统使用Elcipse for JavaEE开发，其它IDE下可通过某些方式可进行编辑开发。 
1. 下载并安装Eclipse for JavaEE和JDK8；
2. 使用git工具将本库clone到一个目录中（比如桌面）；
3. 下载Tomcat，安装到指定目录。 
4. 在Eclipse for JavaEE中依据Tomcat的安装目录进行创建一个Tomcat实例；
5. 使用Eclipse for JavaEE打开该项目；
6. 下载并安装MySQL，端口为3306，用户名和密码为DavidChen和quanyec；并且在该数据库中创建一个thinBlog数据库来保存博客中的数据。
7. 启动Tomcat，启动完成后打开浏览器输入：http://localhost:8080/ThinkBlog/ 观看效果。

## 二、本地直接运行 
1. 下载并安装Tomcat和JDK8/JRE8；
2. 将本reposi下载或git clone到Tomcat中的webapps目录下；
3. 下载并安装MySQL，端口为3306，用户名和密码为DavidChen和quanyec；并且在该数据库中创建一个thinBlog数据库来保存博客中的数据。
4. 启动Tomcat，启动完成后打开浏览器输入：http://localhost:8080/ThinkBlog/ 观看效果。

## 三、服务器运行
与本地运行一致，Tomcat端口设为80即可。

## 截图
![blog_list](https://github.com/AiziChen/ThinkBlog/blob/master/screenshoot/blog_list.png)
![new_blog](https://github.com/AiziChen/ThinkBlog/blob/master/screenshoot/new_blog.png)
![view_blog](https://github.com/AiziChen/ThinkBlog/blob/master/screenshoot/view_blog.png)
