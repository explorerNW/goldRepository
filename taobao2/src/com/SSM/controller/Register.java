package com.SSM.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SSM.bean.User;

@Controller
public class Register {
                  
	            @RequestMapping("userAdd.action")
	            public String register(String userid, String userName, String userPWD, String sex, 
	            		String birthday, String identityCode, String email, String mobile, String address,
	            		String status, HttpServletRequest request, HttpServletResponse response, Model model,SSF ssf){
	            	SqlSession sql = ssf.sqlsession();
	            	    User user = new User();
	            	         user.setEn_user_id(request.getParameter("en_user_id").toString());
	            	         user.setEn_user_name(request.getParameter("en_user_name"));
	            	         user.setEn_user_pwd(request.getParameter("en_user_pwd"));
	            	         user.setEn_user_sex(request.getParameter("en_user_sex"));
	            	         user.setEn_address(request.getParameter("en_address"));
	            	         user.setEn_mobile(request.getParameter("en_mobile"));
	            	    int i = sql.insert("com.SM.bean.userMapper.setUser", user);
	            	        if(i>0){
	            	        	      return "index.jsp";        	
	            	        }else{
	            	        	      return "error.jsp";
	            	        }
	            	
	            }
}
