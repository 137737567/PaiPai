<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登陆</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		div{
			width: 350px;
			font-size: 20px;
			background-color: powderblue;
			margin-left: 500px;
			margin-top: 150px;
		}
		div h2{
			margin-left: 100px;
		}
	</style>
  </head>
  
  <body>
 		<div id="">
 			 <h2>管理员登陆</h2>
     <form action="AdminLogin.action" method="post">
				用户名:<input type="text" name="admin.name"/><br/>
      	 &nbsp;&nbsp;密码:<input type="text" name="admin.passWord"/> <br/>
       	<input type="submit" value="登录"/>  <a href="Index.jsp">切换普通用户登陆</a>
     </form>
 		</div>
  </body>
</html>
