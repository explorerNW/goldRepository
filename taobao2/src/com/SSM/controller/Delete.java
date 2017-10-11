package com.SSM.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SSM.bean.User;
import com.SSM.service.impl.UserServiceImpl;

@Controller
public class Delete {
	            
	            @RequestMapping("delete.action")	           
                public void delete(HttpServletRequest request, HttpServletResponse response, User user, Model model){
                	                    
                	                              
                	       
                }
}
