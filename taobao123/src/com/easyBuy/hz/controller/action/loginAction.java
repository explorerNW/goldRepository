package com.easyBuy.hz.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.easyBuy.hz.bean.User;
import com.easyBuy.hz.service.impl.*;
import com.easyBuy.hz.service.userService;




@Controller
public class loginAction {

	@Autowired
	
	userServiceImpl userServiceImpl;
	
	@RequestMapping("login.do")
	public String login(String username,String password,HttpServletRequest request,HttpServletResponse response,Model model){
		
		User user0=new User();
		user0.setEuUserName(username);
		user0.setEuPassword(password);


		User  user= userServiceImpl.getUser(user0);
		
		 if(user.getEuPassword().equals(password)){
			 
			 System.out.println("登录成功……");
			 
			 return "index";
			 
		 }
		 
/*		
         if(user.getEuPassword().equals(password)){
			 
		 }
*/
		 System.out.println("登录失败！");
		return "error";
	}
}
