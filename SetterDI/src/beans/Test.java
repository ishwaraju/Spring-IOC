package beans;

public class Test {
	private String name;
	private String email;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Age : "+age);
	}
	
}
