package com.easyBuy.hz.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.easyBuy.hz.bean.User;

public class test {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		String conf="conf.xml";
		
		try {
			//加载配置文件
			 InputStream is= Resources.getResourceAsStream(conf);
			 //创建Session工厂
			 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
			 
			 //打开Session工厂
			 SqlSession ss= ssf.openSession();
			 
			 User user=ss.selectOne("com.easyBuy.hz.bean.userMapper.getUser", new User());
			 
			 //增删改查操作
			
			 ss.commit();
			 
			 ss.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
*/
}
