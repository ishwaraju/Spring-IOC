package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ConnectionPool;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		ConnectionPool cp =(ConnectionPool)ap.getBean("cp");
		cp.createConn();
	}

}
