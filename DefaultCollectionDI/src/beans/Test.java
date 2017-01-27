package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	@SuppressWarnings("rawtypes")
	private List fruits;
	@SuppressWarnings("rawtypes")
	private Set cricketers;
	@SuppressWarnings("rawtypes")
	private Map countryCapital;
	@SuppressWarnings("rawtypes")
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(@SuppressWarnings("rawtypes") Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setCountryCapital(@SuppressWarnings("rawtypes") Map countryCapital) {
		this.countryCapital = countryCapital;
	}
	public void printData(){
		System.out.println("Fruits");
		for(Object f:fruits){
			System.out.println(f);
		}
		
		System.out.println("Cricketers");
		for(Object cr:cricketers){
			System.out.println(cr);
		}
		
		System.out.println("Country capital");
		@SuppressWarnings("rawtypes")
		Set keys=countryCapital.keySet();
		for(Object key:keys){
			System.out.println("Country : "+key+" Capital : "+countryCapital.get(key));
		}
	}
}
