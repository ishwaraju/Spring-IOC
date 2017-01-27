package beans;

public class Car {
	private String carName;
	private Engine engine;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void carOrder(){
		System.out.println("Car Name : "+carName);
		System.out.println("Year of manufacture : "+engine.getModelYear());
	}
}
