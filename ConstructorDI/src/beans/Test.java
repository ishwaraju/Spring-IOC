package beans;

public class Test {
	private String name;
	private int age;

	public Test(String name) {
		super();
		this.name = name;
	}
	
	public Test(int age){
		super();
		this.age=age;
	}
	
	public Test(int age,String name){
		super();
		this.age=age;
		this.name= name;
	}
	
	public void hello(){
		System.out.println("Hello .... "+name);
		System.out.println("Age is "+age);
	}
}
