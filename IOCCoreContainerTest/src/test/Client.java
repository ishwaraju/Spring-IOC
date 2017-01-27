package test;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println("document loaded");
		
		Object o1 = factory.getBean("t");//instance is created here at first request
		Object o2 = factory.getBean("t");
		Object o3 = factory.getBean("t");
		Object o4 = factory.getBean("t");
	}

}
