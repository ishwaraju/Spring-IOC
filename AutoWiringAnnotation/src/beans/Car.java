package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Qualifier(value="e")
	@Autowired
	private Engine engine;
	//no need to have setter or constructor
	public void display(){
		System.out.println("Engine model year : "+engine.getModelYear());
	}
}
