package com.SSM.service;

import java.util.List;

import com.SSM.bean.User;
import com.SSM.dao.impl.UserDaoImpl;


public interface UserService {
	public String selectOne();
    public List<User> selectList();
    public int delete();
    public int insert();
    public int update();
                                    
}
