package bean;

public class Car {
	private String[] carNames;
	private Engine[] engine;
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void carData(){
		for(String car:carNames){
			System.out.println(car);
			}
		for(Engine e:engine){
			System.out.println(e.getModelYear());
		}
	}
	
}
