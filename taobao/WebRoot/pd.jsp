<%@page import="java.sql.ResultSet"%>
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
    
    <title>My JSP 'pd.jsp' starting page</title>
    
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
    	String username=request.getParameter("en_user_name");
    	String pwd=request.getParameter("en_user_pwd");
    	
    	//插入数据库
    	//加驱动
    	Class.forName("com.mysql.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
    	//修路
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/easybuy","root","www.niewang.com");
    	//请人
    	Statement st=con.createStatement();
    	//做什么事
    	String str_sql="select * from easybuy_user where en_user_id='"+username+"' and en_user_pwd='"+pwd+"'";
    	//去做，同时监视    	
    	ResultSet rs=st.executeQuery(str_sql);
    	int a=0;
    	if(rs.next()){
    		//a=rs.getInt(1);
    		System.out.print(rs.next());
    	}
    	//关人关路
    	rs.close();
    	st.close();
    	con.close(); 	
     %>
     <script type="text/javascript">
     	if(<%=a%>>0){
     		
     		location.href="index.jsp";
     	}else{
     		alert("帐号或密码错误，请重新登陆!");
     		location.href="login.jsp";
     	}
     </script>
  </body>
</html>
