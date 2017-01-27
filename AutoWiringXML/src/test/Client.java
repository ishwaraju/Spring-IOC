package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Bus;
import beans.Car;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/spring.xml");
		BeanFactory factory =new XmlBeanFactory(resource);
//		Object o = factory.getBean("c");
//		Car c = (Car)o;
//		c.display();
		Bus b = (Bus)factory.getBean("b");
		b.display();

	}

}
