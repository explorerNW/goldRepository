/*
              时间：2017/08/24
               编码人：聂旺
               登录页面业务逻辑
*/
package com.springmvc.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.HttpRequestHandler;

import com.SSF;
import com.easyBuy.hz.bean.User;

public class Login2 implements HttpRequestHandler{             //springmvc中的handler（HttpRequestHandler）
	
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String conf = "conf.xml";	
		User user = new User();
		SqlSession ss = SSF.sqlsession();		           
		            user.setEn_user_id(request.getParameter("en_user_name").toString());           //通过request获得前端的en_user_name值 并赋值给user的en_user_id
		 user = ss.selectOne("com.easyBuy.hz.bean.userMapper.getUser", user.getEn_user_id());           //执行userMapper.xml文件中的getUser所对应的SQL语句		 
		        ss.commit();                                       //提交查询
		        ss.close();                                          //关闭session工厂
		     if(user != null){			    	        
		    	          if(user.getEn_user_pwd().equals(request.getParameter("en_user_pwd").toString())){             //如果查到的密码与request获得密码相等
		    	                            request.getRequestDispatcher("index.jsp").forward(request, response);   		//相等跳转到index页面    	                           
		    	          }else{
		    	        	                request.getRequestDispatcher("Error.jsp").forward(request, response);		    	       //不相等跳转到Error页面               
		    	          }
		    	        	  
		     }else{
		    	        //request.setAttribute("user",user);                    
		    	        request.getRequestDispatcher("login.jsp").forward(request, response);  //没有此用户名（数据库中为无此id）跳转到login页面重新登录
		     }
		        
	}

}
