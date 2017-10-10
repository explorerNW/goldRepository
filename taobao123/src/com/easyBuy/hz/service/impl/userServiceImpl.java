package com.easyBuy.hz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyBuy.hz.bean.User;
import com.easyBuy.hz.service.userService;
import com.easyBuy.hz.dao.impl.userDaoImpl;




@Service
public class userServiceImpl implements userService {
	
	@Autowired
	userDaoImpl userDaoImpl;

	public User getUser(User user0) { 
		
		User  user= userDaoImpl.getUser(user0);
		
		return user;
	}
	
    public List<User> getUserList() { 
		
		List<User>  user= userDaoImpl.getUserList();
		
		return user;
	}

	
    public void deleteUserList(User user0) { 
		
		userDaoImpl.deleteUserList(user0);
		
	}
public void insertUserList(User user0) { 
		
		userDaoImpl.insertUserList(user0);
		
	}
public void updateUserList(User user0) { 
	
	userDaoImpl.updateUserList(user0);
	
}

}
