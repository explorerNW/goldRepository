<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品管理 - 淘宝网</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function-manage.js"></script>
<script type = "text/javascript">
                   /*  var username = document.getElementById("username");
                    var name = document.getElementById("name");
                    var pwd = document.getElementById("pwd");
                    var address = document.getElementById("address");
                    var mobile = document.getElementById("mobile");
                    var sex = document.getElementById("sex");
                    
                    
                    var regexUsername = "/^[^!@#$%^&*]{30}#/";
                    var regexName = "/^[^a-z,A-Z,0-9]#/";
                    var regexPwd = "/^[^!@#$%^&*]#/";
                    var regexAddress = regexUsername;
                    var regexmobile = "/^[0-9]{11}#/"; */
                    
                   /*  window.onload = function{
                    	        if(!username.test(regexUsername)){
                    	        	       alert("nick name style fault!");     
                    	        }
                    	        if(!)
                    } */
</script>
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
		<h2>新增用户</h2>
		<div class="manage">
			<form action="Usave.action" method="post">
				<table class="form">
					<tr>
						<td class="field">用户名：</td>
						<td><input type="text" class="text" name="en_user_id" value="" id = "username" /></td>
					</tr>
					<tr>
						<td class="field">姓名：</td>
						<td><input type="text" class="text" name="en_user_name" value="" id = "name"/></td>
					</tr>
					<tr>
						<td class="field">密码：</td>
						<td><input type="text" class="text" name="en_user_pwd" value="" id = "pwd"/></td>
					</tr>
					<tr>
						<td class="field">性别：</td>
						<td><input type="radio" name="en_user_sex" value="1" checked="checked" id = "sex" />男 <input type="radio" name="sex" value="1" />女</td>
					</tr>
					
					<tr>
						<td class="field">手机号码：</td>
						<td><input type="text" class="text" name="en_mobile" value="" id = "mobile" /></td>
					</tr>
					<tr>
						<td class="field">地址：</td>
						<td><input type="text" class="text" name="en_address" value="" id = "address" /></td>
					</tr>
					
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2014 长沙极客营 All Rights Reserved.
</div>
</body>

</html>