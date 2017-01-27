package test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("resources/spring.xml");
		
	}

}
