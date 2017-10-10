<%@page import="javax.servlet.jsp.tagext.Tag"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>淘宝网商品管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
<script type = "text/javascript" src = "scripts/userNotExist.js"></script>
<script type = "text/javascript" src = "scripts/jQuery-v3.2.1.js"></script>
</head>
<body>
<div id="register" class="wrap">
                 <div id = "user">${user}</div>
	<div class="shadow">
		<em class="corner lb"></em>
		<em class="corner rt"></em>
		<div class="box">
			<h1>欢迎登淘宝网商品管理系统</h1>
			<form id="loginForm" method="post" action="login2.action" onsubmit="return checkForm(this)"><!-- pd.jsp -->
				<table>
					<tr>
						<td class="field">用户名：</td>
						<td><input class="text" type="text" name="en_user_name" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
					</tr>
					<tr>
						<td class="field">登录密码：</td>
						<td><input class="text" type="password" id="passWord" name="en_user_pwd" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
					</tr>
					
					<tr>
						<td></td>
						<td><label class="ui-green"><input type="submit" name="submit" value="立即登录" /></label></td>
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
<script type = "text/javascript">
                   $(function(){
                	              $.ajax({
                	            	           url: "/taobao/text",
                	            	           type: "post",
                	            	           async: true,
                	            	           data:{
                	            	        	       en_user_name: "聂旺123",
                	            	        	       en_user_pwd: "12345678"
                	            	           },
                	            	           timeout: 500,
                	            	           dataType: "html",
                	            	           beforeSend:function(xhr){
                	            	        	               console.log(xhr);
                	            	        	               console.log("beforeSend");
                	            	           },
                	            	           success:function(data, textStatus, jqXHR){
                	            	        	                console.log("successed!");
                	            	        	                console.log(data);
                	            	        	                console.log(textStatus);
                	            	        	                console.log(jqXHR);
                	            	           },
                	            	           error:function(xhr, textStatus){
                	            	        	                console.log("error!");
                	            	        	                console.log(xhr);
                	            	        	                console.log(textStatus);
                	            	           },
                	            	           complete:function(){
                	            	        	                 console.log("completed!");
                	            	           }
                	              })
                   });
</script>
</html>
