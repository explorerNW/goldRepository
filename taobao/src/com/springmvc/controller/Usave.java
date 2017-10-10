/*
              时间：2017/08/24
               编码人：聂旺
               向数据库添加用户页面业务逻辑
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
import org.apache.tomcat.jni.User;
import org.springframework.web.HttpRequestHandler;

public class Usave implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         
		          String conf = "conf.xml";
		          //加载配置文件
		   		 InputStream is= Resources.getResourceAsStream(conf);
		   		 //创建Session工厂
		   		 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
		   		 
		   		 //打开Session工厂
		   		 SqlSession ss= ssf.openSession();		
		   		     
		   		   com.easyBuy.hz.bean.User user = new com.easyBuy.hz.bean.User();          // 实例化User对象
		   		                            user.setEn_user_id(request.getParameter("username").toString());//设置用户名（数据库中为用户id）
		   		                            user.setEn_user_name(request.getParameter("name"));    //设置姓名
		   		                            user.setEn_user_pwd(request.getParameter("pwd"));        //设置密码
		   		                            user.setEn_user_sex(request.getParameter("sex"));         //设置性别
		   		                            user.setEn_mobile(request.getParameter("tel"));        //设置手机号码
		   		                            user.setEn_address(request.getParameter("address"));        //设置地址
		   		                            user.setEn_status("1");                                    //设置状态
		   		                            user.setEn_user_identify_code(" ");                           //设置身份证号码
		   		                            user.setEn_user_birthday("1995/01/01");		                 //设置出生日期
                                            user.setEmail(" "); 		                                //设置email
		   		 int iResult = ss.insert("com.easyBuy.hz.bean.userMapper.setUser", user);              //调用userMapper.xml文件中的setUser所对应的SQL语句
		   		                       ss.commit();                                                     //提交查询
	   		                           ss.close();                                                         //关闭session工厂
		   		        if(iResult>0){                                                               //如果查询到数据
		   		        	           request.getRequestDispatcher("user.jsp").forward(request, response);    //登录成功跳转到index.jsp
		   		        }else{
		   		        	           request.getRequestDispatcher("login.jsp").forward(request, response);       //跳转到login.jsp
		   		        }
		   		       
	}

}
