package com.easyBuy.hz.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.easyBuy.hz.bean.User;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String conf="conf.xml";
		
		try {
			//加载配置文件
			 InputStream is= Resources.getResourceAsStream(conf);
			 //创建Session工厂
			 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
			 
			 //打开Session工厂
			 SqlSession ss= ssf.openSession();
			            
			 List<User> user = ss.selectList("com.easyBuy.hz.bean.userMapper.getUser");
			            for(int i = 0;i<user.size();i++){ 
			            	      System.out.println(user.get(i).getEmail());
			            }
			 //增删改查操作
			            User u = new User();
			                 u.setEn_user_id("20148188");
			                 u.setEn_user_name("赵六");
			                 u.setEn_user_pwd("12345678");
			                 u.setEn_user_sex("1");
			                 u.setEn_user_birthday("1995/01/10");
			                 u.setEn_user_identify_code("123456789012345678");
			                 u.setEmail("123456@qq.com");
			                 u.setEn_mobile("11111111111");
			                 u.setEn_address("HunanChangsha");
			                 u.setEn_status("1");
			          int i = ss.insert("com.easyBuy.hz.bean.userMapper.setUser", u);
			              if(i>0){
			                          System.out.println("insert into mysql compeleted!");  	         
			              }
			          user = ss.selectList("com.easyBuy.hz.bean.userMapper.allUser");
				            for(int j = 0;i<user.size();i++){ 
				            	      System.out.println(user.get(i).getEmail());
				            }
				           u.setEn_user_id("20148178");
				         int delete = ss.delete("com.easyBuy.hz.bean.userMapper.userDelete", u);
				             if(delete >0){
				            	   System.out.println("data delete completed!");
				             }
				             
				             u.setEn_user_id("20148178");
				             u.setEn_user_name("李四");
				          int update = ss.update("com.easyBuy.hz.bean.userMapper.userUpdate", u);
				               if(update > 0){
				            	     System.out.println("update completed!");
				               }
			 ss.commit();
			
			 ss.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
