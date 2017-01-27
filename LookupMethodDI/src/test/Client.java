/*
 * if use singleton then at the time of loading 
 * it will create instances
 * if prototype is used then at the user request the object is created
 */
package test;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truk;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c=(Car)ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getName());
		
		Bus b=(Bus)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getName());
		
		Truk t=(Truk)ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTrukEngine().getName());
	}

}
