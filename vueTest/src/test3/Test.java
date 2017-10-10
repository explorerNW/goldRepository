package test3;

import  org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
                       ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
                       Hello p1 = (Hello)context.getBean("Person1");
                       Hello p2 = (Hello)context.getBean("Person2");
                               p1.hello();
                               p2.hello();                               
	}

}
