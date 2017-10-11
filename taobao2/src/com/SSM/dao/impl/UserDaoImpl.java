package com.SSM.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.SSM.bean.User;
import com.SSM.controller.SSF;
import com.SSM.dao.UserDao;

public class UserDaoImpl implements UserDao {	
	                private SqlSession sqlSession;
	                public UserDaoImpl(SqlSession sqlsession) {          //依赖注入
                                 this.sqlSession = sqlsession;
	                }

	@Override
	public String selectOne(String mapper, User user) {              //查询一条记录	
		           this.sqlSession = new SSF().sqlsession();
		 String result = this.sqlSession.selectOne(mapper, user);	
		 this.sqlSession.commit();
         this.sqlSession.close();	
		return result;
	}
  
	@Override
	public List<User> selectList(String mapper) {               //查询列表
		                    List<User> list = this.sqlSession.selectList(mapper);
		                    this.sqlSession.commit();
		  		            this.sqlSession.close();	
		                    return list;
	}

	@Override
	public int delete(String mapper, User user) {		                     //删除操作
		              return this.sqlSession.delete(mapper, user);

	}

	@Override
	public int insert(String mapper, User user) {                            //插入记录
                         return this.sqlSession.insert(mapper, user);                  

	}

	@Override
	public int update(String mapper, User user) {                         //更新数据
		                return this.sqlSession.update(mapper, user);

	}
    	
}
