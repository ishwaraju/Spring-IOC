package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client2 {

	public static void main(String[] args) {
		String files[]=new String[]{"resources/car.xml","resources/engine.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		
		Object o =ap.getBean("c");
		Car c = (Car)o;
		c.carOrder();
	}

}
