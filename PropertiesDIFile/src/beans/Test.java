package beans;

import java.util.Properties;
import java.util.Set;

public class Test {
	private Properties driver;
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	public void print(){
		@SuppressWarnings("rawtypes")
		Set keys = driver.keySet();
		for(Object key:keys){
			System.out.println(key+" : "+driver.getProperty((String) key));
		}
	}
}
