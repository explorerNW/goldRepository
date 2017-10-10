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

public class AddProduct implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					SqlSession ss = SSF.sqlsession();
					Product product = new Product();
					        product.setEp_name(request.getParameter("ep_name").toString());
					        product.setEp_price(request.getParameter("ep_price").toString());
					        product.setEp_description(request.getParameter("ep_description").toString());
					        product.setEp_stock(request.getParameter("ep_stock").toString());
					        product.setEp_file_name(request.getParameter("ep_file_name").toString());				
			       int result = ss.insert("com.easyBuy.hz.bean.userMapper.addProduct",product);
			                   ss.commit();
			                   ss.close();	
			                   if(result>0){
			                	   request.getRequestDispatcher("showProducts.action").forward(request, response);        	   
			                   }else{
			                	   request.getRequestDispatcher("product-add.jsp").forward(request, response);			                	       
			                   }
					
		
	}

}
