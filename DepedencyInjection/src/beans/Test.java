/*
 * setter should have only one input at a time
 */
package beans;

public class Test {
	private String gender;
	private int age;
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age){
		this.age=age;
	}

	public void  hello(String name) {
		System.out.println("Hello .."+gender+" "+name);
		System.out.println("Age of "+name+" is "+age);
	}

}
