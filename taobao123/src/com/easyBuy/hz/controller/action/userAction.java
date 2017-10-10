package com.easyBuy.hz.controller.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easyBuy.hz.bean.User;
import com.easyBuy.hz.service.impl.userServiceImpl;
@Controller
public class userAction {
	
	
@Autowired
	
	userServiceImpl userServiceImpl;
	
	@RequestMapping("userManage.do")
	public String userManage(String username,String password,HttpServletRequest request,HttpServletResponse response,Model model){
		User user0=new User();
		user0.setEuUserName(username);
		user0.setEuPassword(password);
		
		List<User>  user= userServiceImpl.getUserList();
		System.out.println(user);
		
		model.addAttribute("user", user);
		
		
	    return "user";
	}

}
