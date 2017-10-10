package com.SSM.dao;

import java.util.List;

import com.SSM.bean.User;

public interface UserDao {
                    
	               public String selectOne(String mapper, User user);
	               public List<User> selectList(String mapper);
	               public int delete(String mapper, User user);
	               public int insert(String mapper, User user);
	               public int update(String mapper, User user);
	 
}
