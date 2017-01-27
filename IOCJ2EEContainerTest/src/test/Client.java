/*
 * if use singleton then at the time of loading 
 * it will create instances
 * if prototype is used then at the user request the object is created
 */
package test;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		//check xml documents
		//it will create instances to singleton beans
	}

}
