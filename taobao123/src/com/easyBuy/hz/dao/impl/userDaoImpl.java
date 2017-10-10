package com.easyBuy.hz.dao.impl;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.easyBuy.hz.SsWorks;
import com.easyBuy.hz.bean.User;
import com.easyBuy.hz.dao.userDao;

@Repository
public  class userDaoImpl implements userDao {

	public User getUser(User user0)  {
		User user1=new User();
		try {

			 //打开Session工厂
			SqlSession ss=SsWorks.SsWorks().openSession();
			
			user1=ss.selectOne("com.easyBuy.hz.bean.userMapper.getUser", user0);
			
			
			
//		    List<User>  list= ss.selectList("com.easyBuy.hz.bean.userMapper.getUser");
//		    
//		     for (User user : list) {
//				
//		    	 System.out.println(user);
//			}
			//增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user1;
	}

	public List<User> getUserList()  {
		SqlSession ss;
		List<User> user1=new ArrayList();
		try {
			ss = SsWorks.SsWorks().openSession();
			
		    user1=ss.selectList("com.easyBuy.hz.bean.userMapper.getUserList");
			//增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user1;
	}
	public void deleteUserList(User user0)  {
		
		try {

			 //打开Session工厂
			SqlSession ss=SsWorks.SsWorks().openSession();
			
			ss.delete("com.easyBuy.hz.bean.userMapper.deUser", user0);
			
			
			
//		    List<User>  list= ss.selectList("com.easyBuy.hz.bean.userMapper.getUser");
//		    
//		     for (User user : list) {
//				
//		    	 System.out.println(user);
//			}
			//增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public void insertUserList(User user0)  {
		
		try {

			 //打开Session工厂
			SqlSession ss=SsWorks.SsWorks().openSession();
			
			ss.insert("com.easyBuy.hz.bean.userMapper.inUser", user0);
			
			
			
//		    List<User>  list= ss.selectList("com.easyBuy.hz.bean.userMapper.getUser");
//		    
//		     for (User user : list) {
//				
//		    	 System.out.println(user);
//			}
			//增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}





public void updateUserList(User user0)  {
	System.out.println(user0);
		try {

			 //打开Session工厂
			SqlSession ss=SsWorks.SsWorks().openSession();
			
			ss.update("com.easyBuy.hz.bean.userMapper.upUser", user0);
			
			
			
//		    List<User>  list= ss.selectList("com.easyBuy.hz.bean.userMapper.getUser");
//		    
//		     for (User user : list) {
//				
//		    	 System.out.println(user);
//			}
			//增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
