<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>"> 
    <title>发布拍卖品</title>
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
		<script type="text/javascript" src="js/jquery-1.8.3.js" ></script>
		<script type="text/javascript">
		
		</script>
  </head>
  
  <body>
  	<div>
		<h2>拍卖品信息</h2>
			<form action="Upload.action" method="post">		
				&nbsp;&nbsp; 名称: <input type="text" name="goods.gName"/><br />
				&nbsp; 起拍价:<input type="text" name="goods.startPrice"/>必须为数字<br />
				开始时间:<input type="text" name="goods.sTime"/><br />
				结束时间:<input type="text" name="goods.eTime"/><br />
				&nbsp; &nbsp; 描述:<input type="text" name="goods.describe"/><br />
				<input type="submit" id="save" value="保存" />
				<a href="List.jsp"><input type="button" id="back" value="取消" /></a>
			</form>
		</div>
	</body>
</html>
