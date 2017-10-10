package com.easyBuy.hz.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.HttpRequestHandler;

import com.SSF;

public class ShowOrders implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		                 SqlSession ss = SSF.sqlsession();
		                            ss.selectList("com.easyBuy.hz.bean.userMapper.", "");
		
	}

}
