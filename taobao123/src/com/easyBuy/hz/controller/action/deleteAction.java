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
public class deleteAction {
	
	
@Autowired
	
	userServiceImpl userServiceImpl;
	
	@RequestMapping("userDelete.do")
	public String userDelete(String userId,HttpServletRequest request,HttpServletResponse response,Model model){
		System.out.println(userId);
		User user0=new User();
		user0.setEuUserId(userId);
		
		
		userServiceImpl.deleteUserList(user0);
		//System.out.println(user);
		
		//model.addAttribute("user", user);
		
		
	    return "redirect:userManage.do";
	}

}