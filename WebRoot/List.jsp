<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
		<title>在线拍卖系统</title>
		<style type="text/css">
			*{
				background-color: lightsteelblue;
			}
			td{
				text-align: center;
			}
			table{
				margin: 20px auto;
			}
		</style>
		<script src="js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
		</script>
  </head>
  
  <body>
    <h2>在线拍卖系统</h2>
		<form action="find.action">
			名称:<input type="text" name="goods.gName"/>&nbsp;&nbsp;
			<input type="submit" id="search" value="查询"}/>&nbsp;&nbsp;|
			<a href="Index.jsp"><input type="button" value="注销"/></a>
			<a href="Upload.jsp"><input type="button"  value="上传拍品"/></a>
		</form>
		<hr />
		<table border="1" cellspacing="0" cellpadding="0" width="1200px">
			<tr>
				<td width="200px">名称</td>
				<td width="200px">描述</td>
				<td width="200px">开始时间</td>
				<td width="200px">结束时间</td>
				<td width="200px">起拍价</td>
				<td width="200px">现在价</td>
				<td width="200px">操作</td>
			<tr>
			<s:iterator value="#session.goods" id="goods">
				<tr>
					<td width="200px">
						<s:property value="#goods.gName"/>
					</td>
					<td width="200px">
						<s:property value="#goods.describe"/>
					</td>
					<td width="200px">
						<s:property value="#goods.sTime"/>
					</td>
					<td width="200px">
						<s:property value="#goods.eTime"/>
					</td>
					<td width="200px">
						<s:property value="#goods.startPrice"/>
					</td>
					<td width="200px">
						<s:property value="#goods.nowPrice"/>
					</td>
					<td width="200px"><s:a action="buy.Action">竞拍</s:a></td>
					
				</tr>
			</s:iterator>
		</table>
  </body>
</html>
