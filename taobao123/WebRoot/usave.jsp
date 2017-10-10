<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'usave.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	//解决乱码
    	request.setCharacterEncoding("utf-8");
    	//拿到所输入的值
    	String username=request.getParameter("username");
    	String name=request.getParameter("name");
    	String pwd=request.getParameter("pwd");
    	String sex=request.getParameter("sex");
    	String tel=request.getParameter("tel");
    	String address=request.getParameter("address");
    	
    	//插入数据库
    	//加驱动
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	//修路
    	Connection con=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;database=taobao","sa","123");
    	//请人
    	Statement st=con.createStatement();
    	//做什么事
    	String str_sql="insert into users values('"+username+"','"+name+"','"+pwd+"','"+sex+"','"+tel+"','"+address+"')";
    	//去做，同时监视
    	int a=st.executeUpdate(str_sql);
    	//关人关路
    	st.close();
    	con.close();
    	
     %>
     <script type="text/javascript">
     	if(<%=a%>>0){
     		alert("添加用户成功!");
     		location.href="index.jsp";
     	}
     </script>
     
  </body>
</html>
