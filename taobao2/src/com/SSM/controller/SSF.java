package com.SSM.controller;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class SSF{
	           public  SqlSession sqlsession(){
	        	   String config = "config.xml";
	        		//加载配置文件
	        		 InputStream is;
	        		 SqlSession ss = null;
					try {
						is = Resources.getResourceAsStream(config);
						 //创建Session工厂
		        		 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
		        		 
		        		 //打开Session工厂
		        		 ss = ssf.openSession();		        		            		        				        		
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 return ss;
	           }
}
