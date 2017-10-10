package com.springmvc.controllers;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login{
               @RequestMapping("login.action")
               public ModelAndView login(HttpServletRequest request, HttpServletResponse response, ModelAndView mav){
										               mav.setViewName("/text");									
            	                      return mav;
               }
               
               @RequestMapping("test.action")
               public ModelAndView test(ModelAndView mav){
            	               mav.setViewName("/index4.html");
            	               toString();
                        return mav;
               }
               
               @RequestMapping("print.action")
               public void print(HttpServletResponse response){
            	               Writer writer;
							try {
								writer = response.getWriter();
								  writer.write("hello there!");
	     	                      writer.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
               }
               
               @RequestMapping("check.action")
               public ModelAndView check(HttpServletRequest request, ModelAndView mav) {
            	           String PWD = request.getParameter("password");
            	                  if(PWD != null && PWD.equals("www") ) {
                                                mav.setViewName("/WEB-INF/OK");
            	                  }else {            	                	  
                                                mav.setViewName("/WEB-INF/FAULT");            	                	            
            	                  }
            	                  return mav;
               }
               
}