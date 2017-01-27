package beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
@SuppressWarnings("rawtypes")
public class Test {
	private Vector fruits;
	private TreeSet cricketors;
	private Hashtable cc;
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketors(TreeSet cricketors) {
		this.cricketors = cricketors;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	
	public void printDetails(){
		System.out.println("Fruits: ");
		for(Object o:fruits){
			System.out.println(o);
		}
		
		System.out.println("Cricketers");
		for(Object o:cricketors){
			System.out.println(o);
		}
		
		System.out.println("Country \t Capital");
		Set keys =cc.keySet();
		for(Object key:keys){
			System.out.println(keys);
			System.out.println(cc.get(key));
		}
	}
}
