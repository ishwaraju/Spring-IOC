package beans;

public class Bus {
	private Engine engine;
	public Bus(){
		System.out.println("default constructor");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Bus(Engine engine){
		System.out.println("Paramterized constructor");
		this.engine=engine;
	}
	public void display(){
		System.out.println(engine.getModelYear());
	}
}
