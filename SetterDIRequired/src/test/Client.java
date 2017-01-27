package test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext ap =new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t = (Test)ap.getBean("t");
		t.printConn();
		
				
	}

}
