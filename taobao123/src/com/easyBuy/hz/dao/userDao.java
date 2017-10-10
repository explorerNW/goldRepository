package com.easyBuy.hz.dao;

import java.util.List;

import com.easyBuy.hz.bean.User;

public interface userDao {

	
	public User getUser(User user0);
	public List<User> getUserList();
	public void deleteUserList(User user0) ;
	public void insertUserList(User user0);
	public void updateUserList(User user0);
}
