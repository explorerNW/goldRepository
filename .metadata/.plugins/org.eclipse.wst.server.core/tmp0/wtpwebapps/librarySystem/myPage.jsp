<%@page import="java.util.*"%>
<%@page import="jdk.nashorn.internal.runtime.ListAdapter"%>
<%@page import="java.util.Date"%>
<%@page import = "com.Jbean.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type = "text/css" href = "/librarySystem/css/myPage.css"/>
<script type = "text/javascript" src = "jQuery/jQuery-compressed.js" ></script>
<script type = "text/javascript" src = "/librarySystem/script/myPage.js" ></script>
<title>我的主页</title>
</head>
<body>
               <div class = "top">
                         <ul>
                                 <li><a href = "/librarySystem/index.jsp">首页</a></li>
                                 <li><%= session.getAttribute("username") %></li>
                                 <li><form action = "/librarySystem/UserDeal" method = "post"><input type = "submit" value = "注销" name = "deal" required/></form></li>
                         </ul>
               </div>
               <div class = "myinf">
                        <span>我的资料</span>
                        <form action = "/librarySystem/UserDeal" method = "post">
                                   <input type = "submit" name = "deal" value = "销毁账号"  required/>                                   
                        </form>
                        <a href = "/librarySystem/getPWD.jsp">修改密码</a>
                        <a class = "dy">订阅书籍</a>
                        <form action = "/librarySystem/Borrow" method = "post">
		                        <table border =1 >
		                                    <tr>
		                                         <td>书名:</td>
		                                         <td><input type = "text" name = "bookName"/></td>                                         
		                                    </tr>
		                                    <tr>
		                                         <td colspan = 2>	
		                                                   <input type = "button" value = "我的订阅" name = "deal" class = "mysubs floatLeft" required/>	                                                         
		                                                   <input type = "button" name = "deal" value = "订阅" class = "subs" required/>
		                                         </td>                                         
		                                    </tr>
		                        </table>
                        </form>                                        
                        <table border = 1>
                                                <tr>
                                                      <td>书名</td>
                                                      <td>作者</td>
                                                      <td>价格</td>
                                                      <td>订阅日期</td>
                                                      <td>还书日期</td>
                                                </tr>
                                                <%
                                                        List<MyBooks> myBookList = (List<MyBooks>)session.getAttribute("myBookList");
                                                             if(myBookList != null){
	                                                              for(MyBooks books:myBookList){
	                                                            	        %>
	                                                            	              <tr>
	                                                            	                      <td><%=books.getBname() %></td>
	                                                            	                      <td><%=books.getBauthor() %></td>
	                                                            	                      <td><%=books.getBprice() %></td>
	                                                            	                      <td><%=books.getBtime() %></td>
	                                                            	                      <td><%=books.getRtime() %></td>
	                                                            	              </tr>
	                                                            	        <%
	                                                              }
                                                             }else{
                                                            	         out.println("没有订阅书籍！");                                                            	     
                                                             }
                                                %>
                      </table>
               </div>               
</body>
</html>