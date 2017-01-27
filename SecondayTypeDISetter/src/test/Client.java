package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object o = factory.getBean("t");
		Car c = (Car)o;
		c.carOrder();
	}

}
