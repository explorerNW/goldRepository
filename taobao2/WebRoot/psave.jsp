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
    
    <title>My JSP 'psave.jsp' starting page</title>
    
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
    //拿到所输入所有值
    String name=request.getParameter("name");
    String price=request.getParameter("price");
    String brand=request.getParameter("brand");
    String tiaoma=request.getParameter("tiaoma");
    String libsum=request.getParameter("libsum");
    
    //操作数据库
    //1、导入驱动
    Class.forName("com.mysql.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
    //2、修路
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/easybuy","root","www.niewang.com");
    //3、请人
    Statement st=con.createStatement();
    //4、做什么事
    String str_sql="insert into product values('"+name+"','"+brand+"','"+libsum+"','"+tiaoma+"','"+price+"')";
    //5、去做，同时监视
    int a=st.executeUpdate(str_sql);
    //if(a>0){
    //	out.print("添加商品成功!");
    //}
    //6、关人关路
    st.close();
    con.close();
     %>
     
    <script type="text/javascript">
    	//js代码
    	if(<%=a %>>0){
    		alert("插入记录成功!");
    		//跳到主页
    		location.href="index.jsp";
    	}
    </script>
  </body>
</html>
