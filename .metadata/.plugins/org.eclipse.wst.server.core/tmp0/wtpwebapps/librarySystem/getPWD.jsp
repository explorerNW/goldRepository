<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type = "text/css" href = "css/getPWD.css"/>
<script type = "text/javascript" src = "jQuery/jQuery-compressed.js" ></script>
<script type = "text/javascript" src = "script/getPWD.js"></script>
<title>忘记密码</title>
</head>
<body>
               <form action = "/librarySystem/UserDeal" method = "post" onsubmit = "return check(this);">
                             <table>
                                       <tr>
                                             <td><img src = "images/user-blue.png"/></td>
                                             <td><input type = "text" name = "UID" placeholder = "学号" required/></td>
                                       </tr>
                                       <tr>                                             
                                             <td colspan = 2><input type = "submit" name = "deal" value = "获取" id = "get" required/></td>
                                       </tr>   
                                       <tr></tr>                                    
                                       <tr>
                                             <td colspan = 2><input type = "button" id = "resetPWD" value = "重置密码" name = "deal" required/></td>
                                       </tr>
                                       <tr>
                                             <td colspan = 2>
                                                   <span><%= session.getAttribute("PWD") == null?"":"请妥善保管您的密码！<br>密码："+session.getAttribute("PWD")+
                                                		                     "<a href = /librarySystem/index.jsp>去登录</a>"%><% session.removeAttribute("PWD"); %></span>
                                                   <span><%= session.getAttribute("reset") == null?"":"重置密码成功！"+
                                                		                     "<a href = /librarySystem/index.jsp>去登录</a>" %><% session.removeAttribute("reset"); %></span>       
                                             </td>
                                       </tr>
                             </table>
               </form>  
                            <div class = "content">
                                      
                            </div>
                            
                          
</body>
</html>