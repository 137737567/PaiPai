<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
		<title>在线拍卖系统-竞拍</title>
		<style type="text/css">
			td{
				width: 150px;
				text-align: center;
			}
			div{
				margin-top: 5px;
				border: 1px solid gray;
			}
			
		</style>
		<script src="js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function(){
				$("#price").focus(function(){
					$(this).value("");
				})
			})
		</script>
  </head>
  
  <body>
    <h2>竞价</h2>
		<hr />
		<s:div>
			<table border="1" cellspacing="0" cellpadding="0" id="info">
				<tr>
					<td>名称</td>
					<td>${sessionScope.goods.name}</td>
				</tr>
				<tr>
					<td>描述</td>
					<td>${sessionScope.goods.describe}</td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td>${sessionScope.goods.sTime}</td>
				</tr>
				<tr>
					<td>结束时间</td>
					<td>${sessionScope.goods.eTime}</td>
				</tr>
				<tr>
					<td>起拍价格</td>
					<td>${sessionScope.goods.startPrice}</td>
				</tr>	
				<tr>
					<td>目前价格</td>
					<td>${sessionScope.goods.nowPrice}</td>
				</tr>
			</table>
			<img src=""/>
		</s:div>
		
		<div id="mid">
			出价:<input type="text" id="price" value="不能低于最高竞拍价"/>
			<input type="button" id="buy" value="竞价" />
		</div>
		<input type="button" id="flash" value="刷新" />
		<input type="button" id="back" value="返回列表" />
		<hr />
		出价记录<br />
		<table border="1" cellspacing="0" cellpadding="0">
			<tr>
				<td>竞拍时间</td>
				<td>竞拍价格</td>
				<td>竞拍人</td>
			</tr>
			<tr>
				<td>Data</td>
			</tr>
		</table>
  </body>
</html>
