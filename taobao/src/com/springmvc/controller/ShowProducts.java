package com.springmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.HttpRequestHandler;

import com.SSF;
import com.easyBuy.hz.bean.Product;

public class ShowProducts implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		                              SqlSession ss = SSF.sqlsession();
		                              List<Product> productList = ss.selectList("com.easyBuy.hz.bean.userMapper.productList");		                                            
		                                         ss.commit();
		                                         ss.close();
		                 request.setAttribute("productList", productList);
		                 request.getRequestDispatcher("product.jsp").forward(request, response);
	}

}
