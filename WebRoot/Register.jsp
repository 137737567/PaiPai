<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 	 <script src="../lib/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
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
   		 <h2>用户注册</h2>
     <form action="Register.action" method="post">		
		 &nbsp; 用户名:<input type="text" name="user.userName"/><br/>
      	 &nbsp; &nbsp; 密码:<input type="text" name="user.passWord"/> <br/>
      	确认密码:<input type="text" name="rePassWord"/> <br/>
       	<input type="submit" id="sub" value="注册"/>  <a href="Index.jsp">切换用户登陆</a>
     </form>
   	</div>
  </body>
</html>
