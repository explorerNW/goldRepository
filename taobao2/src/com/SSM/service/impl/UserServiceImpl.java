package com.SSM.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SSM.bean.User;
import com.SSM.controller.SSF;
import com.SSM.dao.impl.UserDaoImpl;
import com.SSM.service.UserService;

@Service
public class UserServiceImpl implements UserService{
                     UserDaoImpl dao = new UserDaoImpl(new SSF().sqlsession());
                     User user = new User();
	@Override
	public String selectOne() {                                       //查询一条记录
		                   user.setEn_user_id("聂旺123");		                  		           
		                   return  dao.selectOne("com.SSM.mapper.userMapper.getOneUser", user);		
	}

	@Override
	public List<User> selectList() {                                 //获取表的所有记录
		return dao.selectList("com.SSM.mapper.userMapper.allUser");
	}

	@Override
	public int delete() {                                                        //删除表的符合条件的记录
		return dao.delete("com.SSM.mapper.userMapper.userDelete", user);
	}

	@Override
	public int insert() {                                                        //向表中插入记录
		return dao.insert("com.SSM.mapper.userMapper.setUser", user);
	}

	@Override
	public int update() {                                                            //更新表的记录
		return dao.update("com.SSM.mapper.userMapper.userUpdate", user);
	}
	
	

}
