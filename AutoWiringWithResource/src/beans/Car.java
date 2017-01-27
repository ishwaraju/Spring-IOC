package beans;

import javax.annotation.Resource;

public class Car {
	@Resource
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display(){
		System.out.println(engine.getModelYear());
	}
}
