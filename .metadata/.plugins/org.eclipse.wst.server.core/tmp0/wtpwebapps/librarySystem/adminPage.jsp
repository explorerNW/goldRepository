<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.Jbean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type = "text/css" href = "/librarySystem/css/adminPage.css"/>
<script type = "text/javascript" src = "/librarySystem/jQuery/jQuery-compressed.js" ></script>
<script type = "text/javascript" src = "/librarySystem/script/adminPage.js" ></script>
<title>管理员</title>
</head>
<body>
               <div class = "top">
                         <ul>
                                 <li><a href = "/librarySystem/index.jsp">首页</a></li>                           
                                 <li>
                                      <img src = "images/shutdown.ico" width = "12px" height = "12px"/>
                                      <form action = "/librarySystem/AdminDeal" method = "post">
                                                  <input type = "submit" name = "deal"  value = "退出系统"  required/>
                                      </form>
                                 
                                 </li>                                 
                         </ul>                           
               </div>
               <div class = "center">
                         <div class = "centerLeft floatLeft">
                                    <ul>
                                          <li>
                                              <span>图书管理<span></span></span>                                               
                                               <ul>
                                                    <li><a>添加图书</a></li>                                                    
                                                    <li><a>更新图书</a></li>
                                                    <li><a>删除图书</a></li>
                                               </ul>
                                          </li>
                                          <li>
                                                <span>书籍列表<span></span></span>                                                       
                                               <ul>
                                                    <li><a>文学</a></li>                                                    
                                                    <li><a>经济</a></li>
                                                    <li><a>历史</a></li>
                                                    <li><a>军事</a></li>
                                                    <li><a>政治</a></li>
                                                    <li><a>地理</a></li>
                                                    <li><a>医学</a></li>
                                               </ul>
                                          </li>
                                          <li>
                                               <span>借阅书籍查看<span></span></span>                                                             
                                               <ul>
                                                    <li><a>查看</a></li>                                                    
                                               </ul>
                                          </li>
                                          <li>
                                               <span>设置管理员<span></span></span>                                         
                                                <ul>
                                                     <li></li>
                                                </ul>
                                          </li>
                                          <li>
                                               <span>管理员信息<span></span></span>                                                         
                                                <ul>
                                                     <li><a>个人资料</a></li>
                                                     <li><a>添加用户</a></li>
                                                     <li><a>用户查询</a></li>
                                                </ul>
                                          </li>
                                    </ul>                                  
                         </div>       
                         <div class = "centerRight floatRight">
                                 <span>welcome</span>
                                 <form action = "/librarySystem/BookDeal" method = "post" onsubmit = "return check1(this);">
                                         <table border = 1>
                                                    <tr>
                                                             <td>书编号:</td>
                                                             <td><input type = "text" name = "bookNumber" maxlength = "13" /></td>
                                                    </tr>
                                                    <tr>
                                                             <td>书名:</td>
                                                             <td><input type = "text" name = "bookName" id = "bookName" maxlength = "20" /></td>
                                                    </tr>
                                                    <tr>
                                                             <td>作者:</td>
                                                             <td><input type = "text" name = "authorName" id = "authorName" maxlength = "20" /></td>
                                                    </tr>
                                                     <tr>
                                                             <td>出版社:</td>
                                                             <td><input type = "text" name = "publishName" id = "publishName" maxlength = "20" /></td>
                                                    </tr>
                                                    <tr>
                                                             <td>租价:</td>
                                                             <td><input type = "text" name = "bookPrice" id = "bookPrice" maxlength = "3" /></td>
                                                    </tr>
                                                    <tr>
                                                             <td>数量:</td>
                                                             <td><input type = "text" name = "bookCount" id = "bookCount" maxlength = "4" /></td>
                                                    </tr>
                                                    <tr>
                                                             <td colspan = 2><input type = "submit" name = "deal" value = "添加" /></td>
                                                    </tr>
                                        </table>                                 
                                 </form>
                                          <table border = 1 class = "show">
                                                       <tr>
                                                            <th>学号</th>
                                                            <th>姓名</th>
                                                            <th>书名</th>
                                                            <th>借书时间</th>
                                                            <th>还书时间</th>
                                                       </tr>
                                                               <%                                                                      
                                                                      List<MyBooks> bookList = (ArrayList<MyBooks>)session.getAttribute("userBookList");
                                                                        if(bookList != null){
                                                                        	   for(MyBooks books:bookList){                                                                        		   
                                                                        	        %>                                  
                                                                        	        <tr>                                      	    
	                                                                        	        <td><%= books.getUid() %></td>
	                                                                        	        <td><%= books.getUname() %></td>
	                                                                        	        <td><%= books.getBname() %></td>
	                                                                        	        <td><%= books.getBtime() %></td>
	                                                                        	        <td><%= books.getRtime() %></td>
                                                                        	        </tr>                                                                        	        
                                                                        	        <%
                                                                        	   }
                                                                        }
                                                               %>                                                       
                                          </table>
                         </div> 
                         <div class = "clear"></div>
                         <span class = "message"><%=session.getAttribute("exist")==null?"":session.getAttribute("exist") %></span> 
                         <span class = "message"><%=session.getAttribute("delete")==null?"":session.getAttribute("delete") %></span>                                                                                                        
               </div>
                  
</body>
</html>