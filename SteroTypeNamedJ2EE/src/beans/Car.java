package beans;

import javax.annotation.Resource;
import javax.inject.Named;
//if i use component anotation , no need to create car class object 
//@Component
@Named
public class Car {
	@Resource
	private Engine engine;
	public void display(){
		System.out.println("Engine Name :"+engine.getEngineName());
	}
}
