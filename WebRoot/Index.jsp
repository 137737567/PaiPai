<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script src="js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
      	
    </script>
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
  <div>
  	<h2>用户登录</h2>
     <form action="UserLogin.action" method="post">
						用户名:<input type="text" name="user.userName"/><br/>
		      	&nbsp;&nbsp;密码:<input type="text" name="user.passWord"/> <br/>
		       	<input type="submit" value="登录"/> 
		       	<a href="Register.jsp">用户注册</a>
				<a href="Admin.jsp">切换管理员登陆</a>
     </form>
  </div>
  </body>
</html>
