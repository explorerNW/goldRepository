<%@page import="org.apache.jasper.tagplugins.jstl.core.Url"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.net.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>library System</title>
<link rel = "shortCut Icon" href = "images/Library.ico"/>
<link rel = "stylesheet" type = "text/css" href = "css/index.css"/>
<script type = "text/javascript" src = "jQuery/jQuery-compressed.js" ></script>
</head>
<body>
                   <div class = "top">   
                               <span><a href = "">首页</a></span> 
                               <span>欢迎光临！
                               <span id = "userType" style = "font-size:15px;color:white;"><%= session.getAttribute("username")!= null?session.getAttribute("username"):"游客" %></span>
                               </span>                                                                                                                 
                               <ul class = "floatRight">
                                     <li>
                                          <img src = "images/search2.png"/>
                                          <input type = "text" id = "search"/>
                                          <a href = ""><input type = "button" value = "搜索" id = "searchBtn"/></a>
                                     </li> 
                                     <li>                                         
                                         <input type = "button" value = "登录" id = "login"/>                                                                                      
                                         <div class = "loginUI">                                                      
                                                     <span class = "floatRight"><img id = "fork" src = "images/fork.png"/></span>
                                                     <span class = "floatLeft">会员登录</span>
                                                     <span class = "floatRight">还没有账号<a href = "/librarySystem/register.jsp">立即注册</a></span>                                                                                                         
                                                       <form action = "/librarySystem/UserDeal" method = "post" onsubmit = "return check(this);" id = "form1">                                                      
                                                         <table border = 1>
                                                                 <tr>
                                                                        <td><img src = "images/idIMG.png" width = "60px" height = "60px"/></td>
                                                                        <td><input type = "text" id = "UID" name = "UID" maxlength="8" placeholder = "学号" /></td>
                                                                 </tr>
                                                                 <tr>
                                                                        <td><img src = "images/key.png" width = "60px" height = "60px"/></td>
                                                                        <td><input type = "password" id = "UPWD" name = "UPWD" maxlength = "20"  placeholder = "密码" /></td>
                                                                 </tr>
                                                                 <tr>                                                                        
                                                                        <td colspan = 2>                                                                               
                                                                               <input type = "submit" id = "login2" value = "登录" name = "deal"/>   
                                                                               <span class = "floatLeft">
                                                                                                <input type = "radio" name = "Utype" id = "UtypeS" value = "student" checked />学生
                                                                                                <input type = "radio" name = "Utype" id = "UtypeAD" value = "administrator" />管理员
                                                                               </span>                                                                           
                                                                               <span><a href = "/librarySystem/getPWD.jsp">忘记密码？</a></span>
                                                                        </td>
                                                                 </tr>
                                                         </table> 
                                                    </form>                                                        
                                                   <div class = "clear"></div>
                                                   <div class = "clear"></div>                                                                                                       
                                              </div>
                                         <a href = "/librarySystem/register.jsp"><input type = "button" value = "注册" id = "register"  required/></a>
                                     </li>                                     
                               </ul>      
                              <div class = "clear"></div>                           
                   </div>
                   <div class = "clear"></div>
                   <div class = "commend">
                                <div class = "commendLeft floatLeft">
                                           <ul>
                                                    <li>文学</li>
                                                    <li>经济</li>
                                                    <li>历史</li>
                                                    <li>军事</li>
                                                    <li>政治</li>
                                                    <li>地理</li>
                                                    <li>医学</li>
                                           </ul>  
                                 </div>
                                 <div class = "commendCenter floatLeft">
                                             <ul>
                                                   <li><a href = ""><img src = "images/books/literature/1.jpg"/><br><span>《最终》<br>作者：某某<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/2.jpg"/><br><span>《骆驼祥子》<br>作者：老舍<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/3.jpg"/><br><span>《麦田里的守望者》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/4.jpg"/><br><span>《流年里的花开》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/5.jpg"/><br><span>《茶馆》<br>作者:老舍<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/6.jpg"/><br><span>《你好青春》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/7.jpg"/><br><span>《朝花夕拾》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/8.jpg"/><br><span>《中国古代文学作品选》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/9.jpg"/><br><span>《中国古典文学》<br>作者:<br>租金：￥30/月</span></a></li>
                                                   <li><a href = ""><img src = "images/books/literature/10.jpg"/><br><span>《狂人日记》<br>作者:<br>租金：￥30/月</span></a></li>
                                             </ul>
                                              <div class = "clear"></div>	                                             		                               
                                </div> 
                                 <div class = "commendRight floatRight">
			                                  <a href = "">更多>>>>></a> 
			                     </div>
                   </div>                 
                  
                                  
</body>
<script type = "text/javascript" src = "script/index.js"></script>
</html>