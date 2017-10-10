<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品管理 - 淘宝网</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function-manage.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="index.html">重新登陆</a></li>
			<li><a href="user.html">用户</a></li>
			<li><a href="product.html">商品</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="welcome wrap">
		亲爱的用户geek您好，今天是2014-5-28，欢迎你来到淘宝网用户管理中心。
	</div>
</div>
<div id="position" class="wrap">
	您现在的位置：<a href="index.html">淘宝网</a> &gt; 用户管理
</div>
<div id="main" class="wrap">
	<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="user-add.jsp">新增</a></em><a href="user.html">用户管理</a></dd>
				<dt>商品信息</dt>
			
				<dd><em><a href="product-add.html">新增</a></em><a href="product.html">商品管理</a></dd>
				<dt>订单管理</dt>
				<dd><a href="order.html">订单管理</a></dd>
				<dt>留言管理</dt>
				<dd><a href="guestbook.html">留言管理</a></dd>
				<dt>新闻管理</dt>
				<dd><em><a href="news-add.html">新增</a></em><a href="news.html">新闻管理</a></dd>
			</dl>
		</div>
	</div>
	<div class="main">
		<h2>用户管理</h2>
		<div class="manage">
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
					<th>邮箱</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${user}" var="hf">
				<tr>
					<td class="first w4 c">${hf.euUserId }</td>
					<td class="w1 c">${hf.euUserName}</td>
					<td class="w2 c">${hf.euSex }</td>
					<td >${hf.euEmail }</td>
					<td class="w4 c">${hf.euMobile }</td>
					<td class="w1 c"><a href="user-modify.jsp?userId=${hf.euUserId }">修改</a> <a href="javascript:Delete(${hf.euUserId });">删除</a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2014 长沙极客营 All Rights Reserved. 
</div>
</body>
</html>
