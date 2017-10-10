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
public class updateAction {
	
	
@Autowired
	
	userServiceImpl userServiceImpl;
	
	@RequestMapping("userUpdate.do")
	public String userUpdate(String userId,String euUserName,String euPassword,String euSex,
			String euEmail,String euMobile,String userName,
			HttpServletRequest request,HttpServletResponse response,Model model){
		System.out.println(userId);
		User user0=new User();
		user0.setEuUserId(userId);
		user0.setEuUserName(euUserName);
		user0.setEuPassword(euPassword);
		user0.setEuSex(euSex);
		user0.setEuEmail(euEmail);
		user0.setEuMobile(euMobile);
		user0.setUserName(userName);
		
		
		userServiceImpl.updateUserList(user0);
		//System.out.println(user);
		
		//model.addAttribute("user", user);
		
		
	    return "redirect:userManage.do";
	}

}
