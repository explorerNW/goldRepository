package com.easyBuy.hz;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SsWorks {
	
	public static SqlSessionFactory SsWorks() throws IOException{
		String conf="conf.xml";
		
		InputStream is= Resources.getResourceAsStream(conf);
		 //创建Session工厂
		 SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
		 return ssf;
	}

}
