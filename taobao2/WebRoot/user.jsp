<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import = "org.apache.ibatis.io.Resources" %>
<%@page import = "org.apache.ibatis.session.SqlSession" %>
<%@page import = "org.apache.ibatis.session.SqlSessionFactory" %>
<%@page import = "org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@page import = "org.springframework.web.HttpRequestHandler" %>
<%@page import = "com.SSM.bean.User" %>
<%@page import = "java.io.IOException" %>
<%@page import = "java.io.InputStream" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
			<li class="current"><a href="index.jsp">重新登陆</a></li>
			<li><a href="user.jsp">用户</a></li>
			<li><a href="product.jsp">商品</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="welcome wrap">
		亲爱的用户geek您好，今天是2014-5-28，欢迎你来到淘宝网用户管理中心。
	</div>
</div>
<div id="position" class="wrap">
	您现在的位置：<a href="index.jsp">淘宝网</a> &gt; 用户管理
</div>
<div id="main" class="wrap">
	<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="user-add.jsp">新增</a></em><a href="user.jsp">用户管理</a></dd>
				<dt>商品信息</dt>
			
				<dd><em><a href="product-add.jsp">新增</a></em><a href="product.jsp">商品管理</a></dd>
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
					<th>地址</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
				<!-- <tr>
					<td class="first w4 c">1</td>
					<td class="w1 c">张三丰</td>
					<td class="w2 c">男</td>
					<td>长沙市极客营教学部</td>
					<td class="w4 c">13888888888</td>
					<td class="w1 c"><a href="user-modify.html">修改</a> <a href="javascript:Delete(1);">删除</a></td>
				</tr>
				<tr>
					<td class="first w4 c">2</td>
					<td class="w1 c">杨二郎</td>
					<td class="w2 c">男</td>
					<td>长沙市极客营教学部</td>
					<td class="w4 c">13888888888</td>
					<td class="w1 c"><a href="user-modify.html">修改</a> <a href="javascript:Delete(1);">删除</a></td>
				</tr> -->
				<%
						String conf = "conf.xml";	
						User user = new User();
						//加载配置文件
						 InputStream is= Resources.getResourceAsStream(conf);
						 //创建Session工厂
						 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
						                   
						 //打开Session工厂
						 SqlSession ss= ssf.openSession();
			        	 List<User> userList = ss.selectList("com.easyBuy.hz.bean.userMapper.allUser");	
			        	            for(int i = 0;i<userList.size();i++){
			        	            	          userList.get(i).getEn_user_id();
			        	            }
				%>
				<tr>
				     <td>用户名</td>
				     <td>姓名</td>
				     <td>性别</td>
				     <td>email</td>
				     <td>手机号码</td>
				     <td>地址</td>
				     <td>状态</td>
				</tr>
				<c:forEach items="userList" var = "user">
				       <tr>
				            <td>${user.getEn_user_id}</td>
				            <td>${user.getEn_user_name}</td>				            
				            <td>${user.getEn_user_sex}</td>				            				           				            
				            <td>${user.getEmail}</td>
				            <td>${user.getEn_mobile}</td>
				            <td>${user.getEn_address}</td>
				            <td>${user.getEn_status}</td>
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
