/*
 * if use singleton then at the time of loading 
 * it will create instances
 * if prototype is used then at the user request the object is created
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b =(Bank)ap.getBean("b");
		b.deposit();
		b.withdraw();
		b.calInt();
	}

}
